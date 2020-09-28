package com.mhes.service.impl;

import com.mhes.domain.MrMeterConnectionInfo;
import com.mhes.domain.MrMeterDetails;
import com.mhes.domain.MrMeterLocation;
import com.mhes.domain.MrMetermfDetails;
import com.mhes.domain.VmCompanyProfile;
import com.mhes.domain.VmMeterManufacture;
import com.mhes.repository.CmCircleRepository;
import com.mhes.repository.CmDivisionRepository;
import com.mhes.repository.CmFeederRepository;
import com.mhes.repository.CmSectionRepository;
import com.mhes.repository.CmSubDivisionRepository;
import com.mhes.repository.CmSubStationRepository;
import com.mhes.repository.CmTownRepository;
import com.mhes.repository.CmTransformerRepository;
import com.mhes.repository.MrMeterConnectionInfoRepository;
import com.mhes.repository.MrMeterDetailsRepository;
import com.mhes.repository.MrMeterLocationRepository;
import com.mhes.repository.MrMetermfDetailsRepository;
import com.mhes.repository.VmCompanyProfileRepository;
import com.mhes.repository.VmMeterManufactureRepository;
import com.mhes.request.MeterRequest;
import com.mhes.response.MeterResponse;
import com.mhes.service.MrMeterDetailsService;
import com.mhes.util.Constants;
import com.mhes.validation.CommonValidation;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author SureshKumar
 *
 */

@Service
public class MrMeterDetailsServiceImpl implements MrMeterDetailsService{

	@Autowired
    private MrMeterDetailsRepository mrMeterDetailsRepository;

	@Autowired
    private VmMeterManufactureRepository vmMeterManufactureRepository;
	
	@Autowired
    private VmCompanyProfileRepository vmCompanyProfileRepository;

	@Autowired
    private CmCircleRepository cmCircleRepository;

	@Autowired
    private CmDivisionRepository cmDivisionRepository;
	
	@Autowired
    private CmSubDivisionRepository cmSubDivisionRepository;

	@Autowired
    private CmSectionRepository cmSectionRepository;
	
	@Autowired
    private CmTownRepository cmTownRepository;
	
	@Autowired
    private CmSubStationRepository cmSubStationRepository;
	
	@Autowired
    private CmFeederRepository cmFeederRepository;

	@Autowired
    private CmTransformerRepository cmTransformerRepository;

	@Autowired
    private MrMeterLocationRepository mrMeterLocationRepository;
	
	@Autowired
    private MrMetermfDetailsRepository mrMeterMfDetailsRepository;

	@Autowired
    private MrMeterConnectionInfoRepository mrMeterConnectionInfoRepository;

	@Override
	public List<MrMeterDetails> findAll() {
		return mrMeterDetailsRepository.findAll();
	}

	@Override
	public MeterResponse save(MeterRequest addMeterRequest) {

		MrMeterDetails meterDetails = populateMrMeterDetails(addMeterRequest);
		MrMeterDetails returnMeterDetails = mrMeterDetailsRepository.save(meterDetails);

		MrMeterLocation mrMeterLocation = populateMrMeterLocationDetails(addMeterRequest, returnMeterDetails);
		MrMeterLocation returnedMeterLocation = mrMeterLocationRepository.save(mrMeterLocation);

		MrMetermfDetails mrMeterMfDetails = populateMrMeterMfDetails(addMeterRequest, returnMeterDetails);
		MrMetermfDetails returnedMrMfMeterDetails = mrMeterMfDetailsRepository.save(mrMeterMfDetails);

		MrMeterConnectionInfo mrMeterConnectionInfo = populateMrMeterConnectionInfoDetails(addMeterRequest, returnMeterDetails);
		MrMeterConnectionInfo returnedMrMeterConnectionInfo = mrMeterConnectionInfoRepository.save(mrMeterConnectionInfo);

		return populateAddMeterResponse(returnMeterDetails, returnedMeterLocation);
	}

	private MrMeterDetails populateMrMeterDetails(MeterRequest addMeterRequest) {

		MrMeterDetails mrMeterDetails = new MrMeterDetails();

		mrMeterDetails.setMeterSerialNumber(CommonValidation.checkNotNull(addMeterRequest.getMeterSerialNumber()) ? 
				addMeterRequest.getMeterSerialNumber() : Constants.EMPTY);
		mrMeterDetails.setDeviceId((CommonValidation.checkNotNull(addMeterRequest.getDeviceId())) ? addMeterRequest.getDeviceId() : 
			Constants.EMPTY);
		mrMeterDetails.setIpAddress((CommonValidation.checkNotNull(addMeterRequest.getIpAddress())) ? addMeterRequest.getIpAddress() : 
			Constants.EMPTY);
		mrMeterDetails.setConnectionStatus((CommonValidation.checkNotNull(addMeterRequest.getConnectionStatus())) ? addMeterRequest.getConnectionStatus() 
				: Constants.EMPTY);
		mrMeterDetails.setCurrentRating((CommonValidation.checkNotNull(addMeterRequest.getCurrentRating())) ? 
				addMeterRequest.getCurrentRating() : Constants.EMPTY);
		mrMeterDetails.setSimNumber( (CommonValidation.checkNotNull(addMeterRequest.getSimNumber())) ? addMeterRequest.getSimNumber() 
				: Constants.EMPTY);
		mrMeterDetails.setInstallationType((CommonValidation.checkNotNull(addMeterRequest.getCommonValueInstallationType())) ? 
				addMeterRequest.getCommonValueInstallationType() : Constants.EMPTY);
		mrMeterDetails.setInstallationSubtype((CommonValidation.checkNotNull(addMeterRequest.getCommonValueInstallationSubType())) ? 
				addMeterRequest.getCommonValueInstallationSubType() : Constants.EMPTY);
		
		Optional<VmMeterManufacture> vmMeterManufacture = vmMeterManufactureRepository.findById((Long.valueOf((
				CommonValidation.checkNotNull(addMeterRequest.getVmMeterManufactureAutoId())) ? addMeterRequest.getVmMeterManufactureAutoId() : Constants.EMPTY )));
		
		Optional<VmCompanyProfile> vmCompanyProfile = vmCompanyProfileRepository.findById(vmMeterManufacture.get().getCompanyAutoId());

		mrMeterDetails.setVmMeterManufacture((!vmMeterManufacture.isEmpty()) ? vmMeterManufacture.get() : null);
		mrMeterDetails.setVmCompanyProfile((!vmCompanyProfile.isEmpty()) ? vmCompanyProfile.get() : null );

		return mrMeterDetails;
	}

	private MrMeterLocation populateMrMeterLocationDetails(MeterRequest addMeterRequest, MrMeterDetails returnMeterDetails) {

		MrMeterLocation mrMeterLocation = new MrMeterLocation();

		mrMeterLocation.setMrMeterDetails(returnMeterDetails);
		mrMeterLocation.setLatitude((CommonValidation.checkNotNull(addMeterRequest.getLatitude())) ? addMeterRequest.getLatitude() : 
			Constants.EMPTY);
		mrMeterLocation.setLongitude((CommonValidation.checkNotNull(addMeterRequest.getLongitude())) ? addMeterRequest.getLongitude() : 
			Constants.EMPTY);

		mrMeterLocation.setCmCircle(cmCircleRepository.findById(Long.valueOf(CommonValidation.checkNotNull(addMeterRequest.getCircleId()) ? 
				addMeterRequest.getCircleId() : Constants.EMPTY )).get());
		mrMeterLocation.setCmDivision(cmDivisionRepository.findById(Long.valueOf(CommonValidation.checkNotNull(addMeterRequest.getDivisionId()) ? 
				addMeterRequest.getDivisionId() : Constants.EMPTY )).get());
		mrMeterLocation.setCmSubDivision(cmSubDivisionRepository.findById(Long.valueOf(CommonValidation.checkNotNull(
				addMeterRequest.getSubDivisionId()) ? addMeterRequest.getSubDivisionId() : Constants.EMPTY )).get());
		mrMeterLocation.setCmSection(cmSectionRepository.findById(Long.valueOf(CommonValidation.checkNotNull(
				addMeterRequest.getSectionId()) ? addMeterRequest.getSectionId() : Constants.EMPTY )).get());
		mrMeterLocation.setCmTown(cmTownRepository.findById(Long.valueOf(CommonValidation.checkNotNull(
				addMeterRequest.getTownId()) ? addMeterRequest.getTownId() : Constants.EMPTY )).get());
		mrMeterLocation.setCmSubStation(cmSubStationRepository.findById(Long.valueOf(CommonValidation.checkNotNull(
				addMeterRequest.getSubStationId()) ? addMeterRequest.getSubStationId() : Constants.EMPTY )).get());
		mrMeterLocation.setCmFeeder(cmFeederRepository.findById(Long.valueOf(CommonValidation.checkNotNull(
				addMeterRequest.getFeederId()) ? addMeterRequest.getFeederId() : Constants.EMPTY )).get());
		mrMeterLocation.setCmTransformer(cmTransformerRepository.findById(Long.valueOf(CommonValidation.checkNotNull(
				addMeterRequest.getTransformerId()) ? addMeterRequest.getTransformerId() : Constants.EMPTY )).get());

		return mrMeterLocation;
	}

	private MrMetermfDetails populateMrMeterMfDetails(MeterRequest addMeterRequest, MrMeterDetails returnMeterDetails) {

		MrMetermfDetails mrMeterMfDetails = new MrMetermfDetails();

		mrMeterMfDetails.setCompanyAutoid(returnMeterDetails.getVmCompanyProfile().getAutoId());
		mrMeterMfDetails.setMrMeterDetails(returnMeterDetails);
		mrMeterMfDetails.setFwVersion((CommonValidation.checkNotNull(addMeterRequest.getFwVersion())) ? addMeterRequest.getFwVersion() : 
			Constants.EMPTY);
		mrMeterMfDetails.setEnergyMultipiler((null != addMeterRequest.getEnergyMultipiler()) ? addMeterRequest.getEnergyMultipiler() :
			Constants.DEFAULT_BIG_DECIMAL);
		mrMeterMfDetails.setMeterType((CommonValidation.checkNotNull(addMeterRequest.getMeterType())) ? addMeterRequest.getMeterType() : 
			Constants.EMPTY);
		mrMeterMfDetails.setMeterCategory((CommonValidation.checkNotNull(addMeterRequest.getMeterCategory())) ? 
				addMeterRequest.getMeterCategory() : Constants.EMPTY);
		mrMeterMfDetails.setMfYear((null != addMeterRequest.getMfYear()) ? addMeterRequest.getMfYear() : null );
		mrMeterMfDetails.setVoltageMultipiler( (null != addMeterRequest.getVoltageMultipiler()) ? addMeterRequest.getVoltageMultipiler() : 
			Constants.DEFAULT_BIG_DECIMAL);
		mrMeterMfDetails.setCurrentMultipiler( (null != addMeterRequest.getCurrentMultipiler()) ? addMeterRequest.getCurrentMultipiler() : 
			Constants.DEFAULT_BIG_DECIMAL);

		return mrMeterMfDetails;
	}

	private MrMeterConnectionInfo populateMrMeterConnectionInfoDetails(MeterRequest addMeterRequest, MrMeterDetails returnMeterDetails) {

		MrMeterConnectionInfo mrMeterConnectionInfo = new MrMeterConnectionInfo();

		mrMeterConnectionInfo.setVmCompanyProfile(returnMeterDetails.getVmCompanyProfile());
		mrMeterConnectionInfo.setMrMeterDetails(returnMeterDetails);
		mrMeterConnectionInfo.setMeterIp((CommonValidation.checkNotNull(addMeterRequest.getMeterIp())) ? addMeterRequest.getMeterIp() : 
			Constants.EMPTY);
		mrMeterConnectionInfo.setMeterPort((CommonValidation.checkNotNull(addMeterRequest.getMeterPort())) ? addMeterRequest.getMeterPort() : 
			Constants.EMPTY);
		mrMeterConnectionInfo.setAunthenticationType((CommonValidation.checkNotNull(addMeterRequest.getAunthenticationType())) ? 
				addMeterRequest.getAunthenticationType() : Constants.EMPTY );
		mrMeterConnectionInfo.setAuthenticationKey( (CommonValidation.checkNotNull(addMeterRequest.getAuthenticationKey())) ? 
				addMeterRequest.getAuthenticationKey() : Constants.EMPTY);
		mrMeterConnectionInfo.setMeterPassword((CommonValidation.checkNotNull(addMeterRequest.getMeterPassword())) ? 
				addMeterRequest.getMeterPassword() : Constants.EMPTY );
		mrMeterConnectionInfo.setSystemTitle((CommonValidation.checkNotNull(addMeterRequest.getSystemTitle())) ? 
				addMeterRequest.getSystemTitle() : Constants.EMPTY);
		mrMeterConnectionInfo.setBlockCipherKey((CommonValidation.checkNotNull(addMeterRequest.getBlockCipherKey())) ? 
				addMeterRequest.getBlockCipherKey() : Constants.EMPTY);
		mrMeterConnectionInfo.setReferencingName((CommonValidation.checkNotNull(addMeterRequest.getReferencingName())) ?
				addMeterRequest.getReferencingName() : Constants.EMPTY);
		mrMeterConnectionInfo.setIsWrapper((CommonValidation.checkNotNull(addMeterRequest.getIsWrapper())) ?
				addMeterRequest.getIsWrapper() : Constants.EMPTY);
		mrMeterConnectionInfo.setIec((CommonValidation.checkNotNull(addMeterRequest.getIec())) ? addMeterRequest.getIec() :
			Constants.EMPTY);
		mrMeterConnectionInfo.setSerialPort((CommonValidation.checkNotNull(addMeterRequest.getSerialPort())) ? 
			addMeterRequest.getSerialPort() : Constants.EMPTY);
		mrMeterConnectionInfo.setConnectionStatus((CommonValidation.checkNotNull(addMeterRequest.getConnectionStatusConnInfo())) ? 
				addMeterRequest.getConnectionStatusConnInfo() : Constants.EMPTY);

		return mrMeterConnectionInfo;
	}

	private MeterResponse populateAddMeterResponse(MrMeterDetails returnMeterDetails, MrMeterLocation returnedMeterLocation) {

		MeterResponse returnMeterResponse = new MeterResponse();

		returnMeterResponse.setMeterSerialNumber(returnMeterDetails.getMeterSerialNumber());
		returnMeterResponse.setLocationName(returnedMeterLocation.getLacationName());
		returnMeterResponse.setLocationId(returnedMeterLocation.getLacationCode());
		returnMeterResponse.setSourceType(returnMeterDetails.getSourceType());
		returnMeterResponse.setDivisionName(returnedMeterLocation.getCmDivision().getDivisionName());
		returnMeterResponse.setDivisionName(returnedMeterLocation.getCmCircle().getCircleName());

		return returnMeterResponse;
	}

	@Override
	public List<Object> findByMrMeterDetails(String meterSerialnumber) {

		return mrMeterDetailsRepository.findByMrMeterDetails(meterSerialnumber);
	}

	@Override
	public List<Object> findByconnectionStatus(String connectionStatus) {

		return  mrMeterDetailsRepository.findByconnectionStatus(connectionStatus);
	}

}