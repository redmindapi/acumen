package com.mhes.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.mhes.domain.DpTimeTable;
import com.mhes.domain.MrMeterLocation;
import com.mhes.domain.MrMetermfDetails;
import com.mhes.request.MeterSearchRequest;
import com.mhes.response.MeterSearchReponse;
import com.mhes.util.MeterSearchInputCriteria;
import com.mhes.util.Constants;

/**
 * 
 * @author RedMind
 *
 */

@Component
public class MeterSearchMediator implements Constants{

	private StringBuilder orginalQuery = new StringBuilder();
	private StringBuilder whereClass = new StringBuilder();
	private String tmpOrginalQuery = "";
	private String CRITERIA_QUERY_METER_SERIAL_NO = " select  ml.* from mrmeterlocation ml, mrmeterdetails mr,"
			+ "dptimetable dp where \r\n" + 
			"ml.meterDetailsAutoid=mr.autoid and \r\n" + 
			"mr.autoid=dp.meterAutoid ";
	public String CRITERIA_QUERY_METER_GROUP = " select * from mrmeterlocation ml, mrmeterdetails mr,"
			+ "vmcompanyprofile vm, mrmetergroup mg ,dptimetable dp where \r\n" + 
			" ml.meterDetailsAutoid=mr.autoid and \r\n" + 
			" mr.companyAutoid=vm.autoid and\r\n" + 
			" vm.autoid=mg.companyAutoid and\r\n" +
			" mr.autoid=dp.meterAutoid and\r\n" +
			" vm.autoid= dp.companyAutoid \r\n";
	public String CRITERIA_QUERY_COMMUNICATION_STATS = "select ml.* from mrmeterlocation ml, mrmeterdetails mr, dptimetable dp where "
			+ "ml.meterDetailsAutoid=mr.autoid and mr.autoid=dp.meterAutoid ";
	public String CRITERIA_QUERY_METER_MANUFACTURER = "select ml.* from \r\n" + 
			"mrmeterlocation ml, mrmeterdetails mr, vmmetermanufacture vm, vmcompanyprofile vc, dptimetable dp, mrmetermfdetails mf\r\n" + 
			"where\r\n" + 
			"ml.meterDetailsAutoid=mr.autoid and\r\n" + 
			"mr.manufactureAutoid=vm.autoid and\r\n" + 
			"mr.autoid=dp.meterAutoid and \r\n" + 
			"vm.companyAutoid=vc.autoid and\r\n" + 
			"vc.autoid=dp.companyAutoid and\r\n" + 
			"mr.companyAutoid=mf.companyAutoid and\r\n" + 
			"vc.autoid=mf.companyAutoid ";
	public String CRITERIA_QUERY = "select ml.* from mrmeterlocation ml where ";

	public StringBuilder checkInputCriteriaAndGetSearchInputQuery(MeterSearchRequest meterSearchRequest,
			MeterSearchInputCriteria meterSearchInputCriteria){

		StringBuilder searchQuery = null;

		meterSearchInputCriteria = checkInputCriteria(meterSearchRequest, meterSearchInputCriteria);

		if(checkNotNull(meterSearchRequest.getMeterSerialNumber())) {
			searchQuery = getSearchInputQueryForMeterSerialNoSection(meterSearchRequest, meterSearchInputCriteria);
			if(checkNotNull(searchQuery.toString())) {
				meterSearchInputCriteria.setQueryExecutedSection(Constants.ONE);
			}
		}else if(checkNotNull(meterSearchRequest.getMeterGroup())) {
			searchQuery = getSearchInputQueryForMeterGroupSection(meterSearchRequest, meterSearchInputCriteria);
			if(checkNotNull(searchQuery.toString())) {
				meterSearchInputCriteria.setQueryExecutedSection(Constants.TWO);
			}
		}else if(null != meterSearchInputCriteria.getNetworkSection() && meterSearchInputCriteria.getNetworkSection()) {
			searchQuery = getSearchInputQueryForNetworkSection(meterSearchRequest, meterSearchInputCriteria);
			if(checkNotNull(searchQuery.toString())) {
				meterSearchInputCriteria.setQueryExecutedSection(Constants.THREE);
			}
		}else if(null != meterSearchInputCriteria.getMeterManufacturer() && meterSearchInputCriteria.getMeterManufacturer()) {
			searchQuery = getSearchInputQueryForMeterManufactureSection(meterSearchRequest, meterSearchInputCriteria);
			if(checkNotNull(searchQuery.toString())) {
				meterSearchInputCriteria.setQueryExecutedSection(Constants.FOUR);
			}
		}else { 
			if(null != meterSearchInputCriteria.getMeterCommunication() && meterSearchInputCriteria.getMeterCommunication()){
				searchQuery = getSearchInputQueryForMeterCommunicationSection(meterSearchRequest, meterSearchInputCriteria);
				if(checkNotNull(searchQuery.toString())) {
					meterSearchInputCriteria.setQueryExecutedSection(Constants.FIVE);
				}
			}
		}

		return searchQuery;
	}

	public List<MeterSearchReponse> filterMeterSearchResultsAndPrepareResponse(List<MrMeterLocation> mrMeterLocationList, MeterSearchRequest meterSearchRequest,
			MeterSearchInputCriteria meterSearchInputCriteria){

		List<MeterSearchReponse> meterResponse = new ArrayList<MeterSearchReponse>();
		List<MrMeterLocation> filteredMeterLocationList = new ArrayList<MrMeterLocation>();
			
		if(checkNotNull(meterSearchInputCriteria.getQueryExecutedSection())) {
			switch (meterSearchInputCriteria.getQueryExecutedSection()) {
				case Constants.THREE :
					filteredMeterLocationList = filterByMeterManufactureAndCommunication(meterSearchRequest, meterSearchInputCriteria, mrMeterLocationList);
					break;
				case Constants.FOUR :
					filteredMeterLocationList = filterByNetworkHierachyAndCommunication(meterSearchRequest, meterSearchInputCriteria, mrMeterLocationList);
					break;
				case Constants.FIVE :
					filteredMeterLocationList = filterByNetworkHierachyAndMeterManufacture(meterSearchRequest, meterSearchInputCriteria, mrMeterLocationList);
					break;
				case Constants.ONE :
					filteredMeterLocationList = mrMeterLocationList;
					break;
				case Constants.TWO :
					filteredMeterLocationList = mrMeterLocationList;
					break;
			}
		}

		if(filteredMeterLocationList.size() > 0) {
			meterResponse = prepareMeterSearchResponse(meterSearchRequest, meterResponse, filteredMeterLocationList);
		}else {
			meterResponse.clear();
		}
		return meterResponse;
	}

	private List<MrMeterLocation> filterByMeterManufactureAndCommunication(MeterSearchRequest meterSearchRequest, MeterSearchInputCriteria meterSearchInputCriteria,
			List<MrMeterLocation> mrMeterLocationList) {

		List<MrMeterLocation> tmpMeterLocationList = new ArrayList<MrMeterLocation>();
		Boolean meterManufacturerFlag = Constants.FALSE;
		Boolean meterCommunicationFlag = Constants.FALSE;

		if(meterSearchInputCriteria.getMeterCommunication() || meterSearchInputCriteria.getMeterManufacturer()) {
			for(MrMeterLocation mrMeterList : mrMeterLocationList) {
				if(meterSearchInputCriteria.getMeterManufacturer()) {
					meterManufacturerFlag = filterByMeterManufactureDetails(meterSearchRequest, mrMeterList);
				}
				if(meterSearchInputCriteria.getMeterCommunication()) {
					meterCommunicationFlag = filterByMeterCommunication(meterSearchRequest, mrMeterList);
				}
				if(meterManufacturerFlag && meterCommunicationFlag) {
					tmpMeterLocationList.add(mrMeterList);
				}
			}
		}else {
			return mrMeterLocationList;
		}
		return tmpMeterLocationList;
	}

	private List<MrMeterLocation> filterByNetworkHierachyAndCommunication(MeterSearchRequest meterSearchRequest, MeterSearchInputCriteria meterSearchInputCriteria,
			List<MrMeterLocation> mrMeterLocationList) {

		List<MrMeterLocation> tmpMeterLocationList = new ArrayList<MrMeterLocation>();
		Boolean networkHierachyFlag = Constants.FALSE;
		Boolean meterCommunicationFlag = Constants.FALSE;

		if(meterSearchInputCriteria.getNetworkSection() || meterSearchInputCriteria.getMeterCommunication()) {
			for(MrMeterLocation mrMeterList : mrMeterLocationList) {
				if(meterSearchInputCriteria.getNetworkSection()) {
					networkHierachyFlag = filterByNetworkHierachy(meterSearchRequest, mrMeterList);
				}
				if(meterSearchInputCriteria.getMeterCommunication()) {
					meterCommunicationFlag = filterByMeterCommunication(meterSearchRequest, mrMeterList);
				}
				if(networkHierachyFlag && meterCommunicationFlag) {
					tmpMeterLocationList.add(mrMeterList);
				}
			}
		}else {
			return mrMeterLocationList;
		}

		return tmpMeterLocationList;
	}

	private List<MrMeterLocation> filterByNetworkHierachyAndMeterManufacture(MeterSearchRequest meterSearchRequest, MeterSearchInputCriteria meterSearchInputCriteria,
			List<MrMeterLocation> mrMeterLocationList) {

		List<MrMeterLocation> tmpMeterLocationList = new ArrayList<MrMeterLocation>();
		Boolean networkHierachyFlag = Constants.FALSE;
		Boolean meterCommunicationFlag = Constants.FALSE;

		if(meterSearchInputCriteria.getNetworkSection() || meterSearchInputCriteria.getMeterManufacturer()) {
			for(MrMeterLocation mrMeterList : mrMeterLocationList) {
				if(meterSearchInputCriteria.getNetworkSection()) {
					networkHierachyFlag = filterByNetworkHierachy(meterSearchRequest, mrMeterList);
				}
				if(meterSearchInputCriteria.getMeterManufacturer()) {
					meterCommunicationFlag = filterByMeterManufactureDetails(meterSearchRequest, mrMeterList);
				}
				if(networkHierachyFlag && meterCommunicationFlag) {
					tmpMeterLocationList.add(mrMeterList);
				}
			}
		}else {
			return mrMeterLocationList;
		}

		return tmpMeterLocationList;
	}

	private Boolean filterByMeterManufactureDetails(MeterSearchRequest meterSearchRequest, MrMeterLocation mrMeterList){

		Boolean addFlag = Constants.FALSE;
		Boolean manufactureNameFlag = Constants.FALSE;
		Boolean meterTypeFlag = Constants.FALSE;
		Boolean yearOfManufactureFlag = Constants.FALSE;
		Boolean meeterCategoryFlag = Constants.FALSE;
		Boolean firmWareVersionFlag = Constants.FALSE;

		if(checkNotNull(meterSearchRequest.getManufactureName())) {
			if(meterSearchRequest.getManufactureName().equals(mrMeterList.getMrMeterDetails().getVmMeterManufacture().getManufactureName())) {
				manufactureNameFlag = Constants.TRUE;
			}else {
				manufactureNameFlag = Constants.FALSE;
			}
		}else {
			manufactureNameFlag = Constants.TRUE;
		}
		if(manufactureNameFlag) {
			for(MrMetermfDetails mrMeterMfList : mrMeterList.getMrMeterDetails().getMrMetermfDetails()) {

				if(checkNotNull(meterSearchRequest.getMeterType())) {
					if(meterSearchRequest.getMeterType().equals(mrMeterMfList.getMeterType())) {
						meterTypeFlag = Constants.TRUE;
					}else {
						meterTypeFlag = Constants.FALSE;
					}
				}else {
					meterTypeFlag = Constants.FALSE;
				}
				if(checkNotNull(meterSearchRequest.getYearofManufacture())) {
					if(Long.valueOf(meterSearchRequest.getYearofManufacture()).equals(mrMeterMfList.getMfYear())) {
						yearOfManufactureFlag = Constants.TRUE;
					}else {
						yearOfManufactureFlag = Constants.FALSE;
					}
				}else {
					yearOfManufactureFlag = Constants.FALSE;
				}
				if(checkNotNull(meterSearchRequest.getMeterCategory())) {
					if(meterSearchRequest.getMeterCategory().equals(mrMeterMfList.getMeterCategory())) {
						meeterCategoryFlag = Constants.TRUE;
					}else {
						meeterCategoryFlag = Constants.FALSE;
					}
				}else {
					meeterCategoryFlag = Constants.FALSE;
				}
				if(checkNotNull(meterSearchRequest.getFirmWareVersion())) {
					if(meterSearchRequest.getFirmWareVersion().equals(mrMeterMfList.getFwVersion())) {
						firmWareVersionFlag = Constants.TRUE;
					}else {
						firmWareVersionFlag = Constants.FALSE;
					}
				}else {
					firmWareVersionFlag = Constants.FALSE;
				}

				if(meterTypeFlag || yearOfManufactureFlag || meeterCategoryFlag || firmWareVersionFlag) {
					addFlag = Constants.TRUE;
					break;
				}

			}
		}else {
			addFlag = Constants.FALSE;
		}
		if(manufactureNameFlag && (meterTypeFlag || yearOfManufactureFlag || meeterCategoryFlag || firmWareVersionFlag)) {
			addFlag = Constants.TRUE;
		}
		return addFlag;
	}
	
	private Boolean filterByMeterCommunication(MeterSearchRequest meterSearchRequest, MrMeterLocation mrMeterList){

		Boolean addFlag = Constants.FALSE;
		Boolean communicationStatusFlag = Constants.FALSE;
		Boolean dateFlag = Constants.FALSE;

		if(checkNotNull(meterSearchRequest.getCommunicationStatus())) {
			if(meterSearchRequest.getCommunicationStatus().equals(mrMeterList.getMrMeterDetails().getConnectionStatus())) {
				communicationStatusFlag = Constants.TRUE;
			}else {
				communicationStatusFlag = Constants.FALSE;
			}
		}else {
			communicationStatusFlag = Constants.TRUE;
		}
		if(communicationStatusFlag) {
			if(null != meterSearchRequest.getFromDate() && null != meterSearchRequest.getToDate()) {
				for(DpTimeTable dpTimeTableList : mrMeterList.getMrMeterDetails().getDpTimeTable()) {
					if(meterSearchRequest.getFromDate().equals(dpTimeTableList.getFirstCommDatetime()) && 
							meterSearchRequest.getToDate().equals(dpTimeTableList.getLastCommDatetime())) {
						dateFlag = Constants.TRUE;
					}else {
						dateFlag = Constants.FALSE;
					}
					if(dateFlag) {
						break;
					}
				}
			}else {
				dateFlag = Constants.FALSE;
			}
		}else {
			addFlag = Constants.FALSE;
		}

		if(communicationStatusFlag && dateFlag) {
			addFlag = Constants.TRUE;
		}

		return addFlag;
	}

	private Boolean filterByNetworkHierachy(MeterSearchRequest meterSearchRequest, MrMeterLocation mrMeterList){

		Boolean addFlag = Constants.FALSE;
		Integer trueCount = 0;
		Integer inputRecordCount = 0;

		if(checkNotNull(meterSearchRequest.getCircleAutoid())) {
			if(Long.valueOf(meterSearchRequest.getCircleAutoid()).equals(mrMeterList.getCmCircle().getAutoId())) {
				trueCount++;
			}
			inputRecordCount++;
		}

		if(checkNotNull(meterSearchRequest.getDivisionAutoid())) {
			if(Long.valueOf(meterSearchRequest.getDivisionAutoid()).equals(mrMeterList.getCmDivision().getAutoId())) {
				trueCount++;
			}
			inputRecordCount++;
		}

		if(checkNotNull(meterSearchRequest.getSubdivisionAutoid())) {
			if(Long.valueOf(meterSearchRequest.getSubdivisionAutoid()).equals(mrMeterList.getCmSubDivision().getAutoId())) {
				trueCount++;
			}
			inputRecordCount++;
		}

		if(checkNotNull(meterSearchRequest.getSectionAutoid())) {
			if(Long.valueOf(meterSearchRequest.getSectionAutoid()).equals(mrMeterList.getCmSection().getAutoId())) {
				trueCount++;
			}
			inputRecordCount++;
		}

		if(checkNotNull(meterSearchRequest.getTownAutoid())) {
			if(Long.valueOf(meterSearchRequest.getTownAutoid()).equals(mrMeterList.getCmTown().getAutoId())) {
				trueCount++;
			}
			inputRecordCount++;
		}

		if(checkNotNull(meterSearchRequest.getSubstationAutoid())) {
			if(Long.valueOf(meterSearchRequest.getSubstationAutoid()).equals(mrMeterList.getCmSubStation().getAutoId())) {
				trueCount++;
			}
			inputRecordCount++;
		}

		if(checkNotNull(meterSearchRequest.getTransformerAutoid())) {
			if(Long.valueOf(meterSearchRequest.getTransformerAutoid()).equals(mrMeterList.getCmTransformer().getAutoId())) {
				trueCount++;
			}
			inputRecordCount++;
		}

		if((trueCount !=0 && inputRecordCount !=0) && trueCount.equals(inputRecordCount)) {
			addFlag = Constants.TRUE;
		}
		return addFlag;
	}

	private List<MeterSearchReponse> prepareMeterSearchResponse(MeterSearchRequest meterSearchRequest, List<MeterSearchReponse> meterResponse, 
			List<MrMeterLocation> filteredMeterLocationList) {

		MeterSearchReponse searchResultsResponse;
		List<DpTimeTable> dpTimeTable;

		for(MrMeterLocation searchResultList : filteredMeterLocationList) {
			searchResultsResponse = new MeterSearchReponse();
			searchResultsResponse.setMeterSerialNumber(searchResultList.getMrMeterDetails().getMeterSerialNumber());
			searchResultsResponse.setLocationName((checkNotNull(searchResultList.getLacationName()) ? searchResultList.getLacationName() : Constants.EMPTY));
			searchResultsResponse.setLocationCode( (checkNotNull(searchResultList.getLacationCode())) ? searchResultList.getLacationCode() : Constants.EMPTY);
			searchResultsResponse.setSourceType(searchResultList.getMrMeterDetails().getSourceType());
			searchResultsResponse.setDivisionName(searchResultList.getCmDivision().getDivisionName());
			searchResultsResponse.setCircleName(searchResultList.getCmCircle().getCircleName());
			dpTimeTable = getMatchedDpTimeTableList(meterSearchRequest, searchResultList.getMrMeterDetails().getDpTimeTable());
			if(dpTimeTable.size() > 0) {
				searchResultsResponse.setFirstCommDatetime(dpTimeTable.stream().findAny().get().getFirstCommDatetime());
				searchResultsResponse.setLastCommDatetime(dpTimeTable.stream().findAny().get().getLastCommDatetime());
			}
			meterResponse.add(searchResultsResponse);
		}
		
		return meterResponse;
	}
	
	private List<DpTimeTable> getMatchedDpTimeTableList(MeterSearchRequest meterSearchRequest, List<DpTimeTable> dpTimeTableList) {

		List<DpTimeTable> matchedDpTimeTableList = dpTimeTableList.stream().filter(list -> list.getFirstCommDatetime().equals(meterSearchRequest.getFromDate()) &&
				list.getLastCommDatetime().equals(meterSearchRequest.getToDate()))
				.collect(Collectors.toList());

		return matchedDpTimeTableList;
	}
	
	private MeterSearchInputCriteria checkInputCriteria(MeterSearchRequest meterSearchRequest, MeterSearchInputCriteria meterSearchInputCriteria) {

		if(checkNotNull(meterSearchRequest.getCircleAutoid()) || checkNotNull(meterSearchRequest.getDivisionAutoid()) || 
				checkNotNull(meterSearchRequest.getSubdivisionAutoid()) || checkNotNull(meterSearchRequest.getSectionAutoid()) || 
				checkNotNull(meterSearchRequest.getTownAutoid()) || checkNotNull(meterSearchRequest.getSubstationAutoid())
				|| checkNotNull(meterSearchRequest.getFeederAutoid()) || checkNotNull(meterSearchRequest.getTransformerAutoid())) {
			meterSearchInputCriteria.setNetworkSection(Constants.TRUE);
		}
		if(checkNotNull(meterSearchRequest.getManufactureName()) || checkNotNull(meterSearchRequest.getMeterType()) ||
				checkNotNull(meterSearchRequest.getYearofManufacture()) || checkNotNull(meterSearchRequest.getMeterCategory()) ||
				checkNotNull(meterSearchRequest.getFirmWareVersion())) {
			meterSearchInputCriteria.setMeterManufacturer(Constants.TRUE);
		}
		if(checkNotNull(meterSearchRequest.getCommunicationStatus()) || null != meterSearchRequest.getFromDate() ||
				null != meterSearchRequest.getToDate()) {
			meterSearchInputCriteria.setMeterCommunication(Constants.TRUE);
		}

		return meterSearchInputCriteria;
	}

	private StringBuilder getSearchInputQueryForNetworkSection(MeterSearchRequest meterSearchRequest, MeterSearchInputCriteria meterSearchInputCriteria) {

		whereClass.setLength(0);
		orginalQuery.setLength(0);
		tmpOrginalQuery=Constants.EMPTY;

		if(checkNotNull(meterSearchRequest.getCircleAutoid())){
			whereClass.append(Constants.CIRCLE_AUTOID).append(meterSearchRequest.getCircleAutoid());
		}
		if(checkNotNull(meterSearchRequest.getDivisionAutoid())){
			whereClass.append((checkNotNull(whereClass.toString())) ? Constants.AND_VAL : Constants.EMPTY)
			.append(Constants.DIV_AUTOID).append(meterSearchRequest.getDivisionAutoid());
		}
		if(checkNotNull(meterSearchRequest.getSubdivisionAutoid())){
			whereClass.append((checkNotNull(whereClass.toString())) ? Constants.AND_VAL : Constants.EMPTY)
					.append(Constants.SUBDIV_AUTOID).append(meterSearchRequest.getSubdivisionAutoid());
		}
		if(checkNotNull(meterSearchRequest.getSectionAutoid())){
			whereClass.append((checkNotNull(whereClass.toString())) ? Constants.AND_VAL : Constants.EMPTY)
					.append(Constants.SECTION_AUTOID).append(meterSearchRequest.getSectionAutoid());
		}
		if(checkNotNull(meterSearchRequest.getTownAutoid())){
			whereClass.append((checkNotNull(whereClass.toString())) ? Constants.AND_VAL : Constants.EMPTY)
					.append(Constants.TOWN_AUTOID).append(meterSearchRequest.getTownAutoid());
		}
		if(checkNotNull(meterSearchRequest.getSubstationAutoid())){
			whereClass.append((checkNotNull(whereClass.toString())) ? Constants.AND_VAL : Constants.EMPTY)
					.append(Constants.SUB_STATION_AUTOID).append(meterSearchRequest.getSubstationAutoid());
		}
		if(checkNotNull(meterSearchRequest.getFeederAutoid())){
			whereClass.append((checkNotNull(whereClass.toString())) ? Constants.AND_VAL : Constants.EMPTY)
					.append(Constants.FEEDER_AUTOID).append(meterSearchRequest.getFeederAutoid());
		}
		if(checkNotNull(meterSearchRequest.getTransformerAutoid())){
			whereClass.append( (checkNotNull(whereClass.toString())) ? Constants.AND_VAL : Constants.EMPTY)
					.append(Constants.FEEDER_AUTOID).append(meterSearchRequest.getTransformerAutoid());
		}

		tmpOrginalQuery = CRITERIA_QUERY + whereClass.toString();
		return orginalQuery.append(tmpOrginalQuery);
	}

	private StringBuilder getSearchInputQueryForMeterManufactureSection(MeterSearchRequest meterSearchRequest, 
			MeterSearchInputCriteria meterSearchInputCriteria) {

		whereClass.setLength(0);
		orginalQuery.setLength(0);
		tmpOrginalQuery=Constants.EMPTY;

		if(checkNotNull(meterSearchRequest.getManufactureName())){
			whereClass.append(Constants.SINGLE_SPACE).append(Constants.AND_VAL).append(Constants.VM_MANUFACTURE_NAME).append(Constants.SINGLE_QUOTE).append(meterSearchRequest.getManufactureName())
			.append(Constants.SINGLE_QUOTE);
		}
		if(checkNotNull(meterSearchRequest.getMeterType())){
			whereClass.append(Constants.SINGLE_SPACE).append(Constants.AND_VAL).append(Constants.VM_MANUFACTURE_METER_TYPE)
			.append(Constants.SINGLE_QUOTE).append(meterSearchRequest.getMeterType())
			.append(Constants.SINGLE_QUOTE);
		}
		if(checkNotNull(meterSearchRequest.getYearofManufacture())){
			whereClass.append(Constants.SINGLE_SPACE).append(Constants.AND_VAL).append(Constants.VM_MANUFACTURE_YEAR)
			.append(Constants.SINGLE_QUOTE).append(meterSearchRequest.getYearofManufacture())
			.append(Constants.SINGLE_QUOTE);
		}
		if(checkNotNull(meterSearchRequest.getMeterCategory())){
			whereClass.append(Constants.SINGLE_SPACE).append(Constants.AND_VAL).append(Constants.VM_MANUFACTURE_CATEGORY)
			.append(Constants.SINGLE_QUOTE).append(meterSearchRequest.getMeterCategory())
			.append(Constants.SINGLE_QUOTE);
		}
		if(checkNotNull(meterSearchRequest.getFirmWareVersion())){
			whereClass.append(Constants.SINGLE_SPACE).append(Constants.AND_VAL).append(Constants.VM_MANUFACTURE_FIRMWARE_VERSION)
			.append(Constants.SINGLE_QUOTE).append(meterSearchRequest.getFirmWareVersion())
			.append(Constants.SINGLE_QUOTE);
		}
		whereClass.append(Constants.SINGLE_SPACE).append(Constants.GRPBY_VAL);
		tmpOrginalQuery = CRITERIA_QUERY_METER_MANUFACTURER + whereClass.toString();
		return orginalQuery.append(tmpOrginalQuery);
	}

	private StringBuilder getSearchInputQueryForMeterCommunicationSection(MeterSearchRequest meterSearchRequest, 
			MeterSearchInputCriteria meterSearchInputCriteria) {

		whereClass.setLength(0);
		orginalQuery.setLength(0);
		tmpOrginalQuery=Constants.EMPTY;

		if(checkNotNull(meterSearchRequest.getCommunicationStatus())) {
			whereClass.append(Constants.SINGLE_SPACE).append(Constants.AND_VAL)
					.append(Constants.SINGLE_SPACE).append(Constants.METER_COMMUNICATING).append(Constants.SINGLE_QUOTE)
					.append(meterSearchRequest.getCommunicationStatus()).append(Constants.SINGLE_QUOTE);
		}
		if(null != meterSearchRequest.getFromDate()) {
			whereClass.append(Constants.SINGLE_SPACE).append(Constants.AND_VAL)
					.append(Constants.SINGLE_SPACE).append(Constants.DPTIME_FIRST_COMMUNICATING).append(Constants.SINGLE_QUOTE)
					.append(meterSearchRequest.getFromDate()).append(Constants.SINGLE_QUOTE);
		}
		if(null != meterSearchRequest.getToDate()) {
			whereClass.append(Constants.SINGLE_SPACE).append(Constants.AND_VAL)
					.append(Constants.SINGLE_SPACE).append(Constants.DPTIME_LAST_COMMUNICATING).append(Constants.SINGLE_QUOTE)
					.append(meterSearchRequest.getToDate()).append(Constants.SINGLE_QUOTE);
		}
		whereClass.append(Constants.SINGLE_SPACE).append(Constants.GRPBY_VAL);
		tmpOrginalQuery = CRITERIA_QUERY_COMMUNICATION_STATS + whereClass.toString();
		return orginalQuery.append(tmpOrginalQuery);
	}

	private StringBuilder getSearchInputQueryForMeterGroupSection(MeterSearchRequest meterSearchRequest, 
			MeterSearchInputCriteria meterSearchInputCriteria) {

		whereClass.setLength(0);
		orginalQuery.setLength(0);
		tmpOrginalQuery=Constants.EMPTY;

		if(null != meterSearchRequest.getMeterGroup()) {
			whereClass.append(Constants.SINGLE_SPACE).append(Constants.AND_VAL)
					.append(Constants.SINGLE_SPACE).append(Constants.GROUP_CODE).append(Constants.SINGLE_QUOTE)
					.append(meterSearchRequest.getMeterGroup()).append(Constants.SINGLE_QUOTE);
		}
		whereClass.append(Constants.SINGLE_SPACE).append(Constants.GRPBY_VAL);
		tmpOrginalQuery = CRITERIA_QUERY_METER_GROUP + whereClass.toString();
		return orginalQuery.append(tmpOrginalQuery);
	}

	private StringBuilder getSearchInputQueryForMeterSerialNoSection(MeterSearchRequest meterSearchRequest, 
			MeterSearchInputCriteria meterSearchInputCriteria) {

		whereClass.setLength(0);
		orginalQuery.setLength(0);
		tmpOrginalQuery=Constants.EMPTY;

		if(null != meterSearchRequest.getMeterSerialNumber()) {
			whereClass.append(Constants.SINGLE_SPACE).append(Constants.AND_VAL)
					.append(Constants.SINGLE_SPACE).append(Constants.METER_SERIAL_NUMBER).append(Constants.SINGLE_QUOTE)
					.append(meterSearchRequest.getMeterSerialNumber()).append(Constants.SINGLE_QUOTE);
		}
		whereClass.append(Constants.SINGLE_SPACE).append(Constants.GRPBY_VAL);
		tmpOrginalQuery = CRITERIA_QUERY_METER_SERIAL_NO + whereClass.toString();
		return orginalQuery.append(tmpOrginalQuery);
	}

	private Boolean checkNotNull(String inputString) {
		return (null != inputString && inputString.trim().length() > 0) ? Constants.TRUE : Constants.FALSE;
	}

}