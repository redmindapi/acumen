package com.mhes.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.DpTimeTable;
import com.mhes.domain.MrMeterDetails;
import com.mhes.domain.MrMeterLocation;
import com.mhes.repository.MeterSearchRespository;
import com.mhes.request.MeterSearchRequest;
import com.mhes.response.MeterSearchReponse;
import com.mhes.service.MeterSearchService;

@Service
public class MeterSearchServiceImpl implements MeterSearchService{

	@Autowired
	MeterSearchRespository meterSearchRespository;
	@PersistenceContext
	EntityManager entityManager;
	private static final String AND_VAL = " and ";
	private static final String WHERE_VAL = " where ";
	private static final String CIRCLE_AUTOID = "ml.circleAutoid=";
	private static final String DIV_AUTOID = "ml.divisionAutoid=";
	private static final String SUBDIV_AUTOID = "ml.subdivisionAutoid=";
	private static final String SECTION_AUTOID = "ml.sectionAutoid=";
	private static final String TOWN_AUTOID = "ml.townAutoid=";
	private static final String SS_AUTOID = "ml.substationAutoid=";
	private static final String FEEDER_AUTOID = "ml.feederAutoid=";
	private static final String DT_AUTOID = "ml.transformerAutoid=";
	private static final String GRPBY_VAL ="' group by mr.meterSerialNumber";
	
	List<Object> mrMeterLocationDetails=new ArrayList<Object>();
	List<Object> mrMeterMfDetails=new ArrayList<Object>();
	List<Object> mrMeterManufacturerNameDetails=new ArrayList<Object>();
	List<Object> mrMeterCommunicateDetails=new ArrayList<Object>();
	//List<Object> b = new ArrayList<Object>();
	
	@Override
	public List<Object> findAllMeterSearchResults(MeterSearchRequest meterSearchRequest) {
		
		String queryNwandMan="";
		String queryComm="";
		
		String queryForNetwork =searchNetworkheirachycriteria(meterSearchRequest);
		String queryForManuFacture=searchManufacturerDetails(meterSearchRequest);
		String queryForComm=searchCommunicationDetails(meterSearchRequest);	
		
		//ONLY NETWORK
		if(!queryForNetwork.isEmpty() && queryForManuFacture.isEmpty() ) 
		{
			mrMeterLocationDetails = meterSearchRespository.getMeterLocationDetailsByCriteria(queryForNetwork);
				//((MrMeterLocation) mrMeterLocation.get(0)).getMrMeterDetails());
				System.out.println("Meterlocation: "+mrMeterLocationDetails.size());
		}
		//ONLY MANUFACTURE
		if(queryForNetwork.isEmpty() && !queryForManuFacture.isEmpty() )
		{
			mrMeterMfDetails = meterSearchRespository.getQueryMetermanufacturerByCriteria(queryForManuFacture);
				System.out.println("MeterManufacturer: "+ mrMeterMfDetails.size());	
				
		}
		//AND CONDITION FOR NETWORK AND MANUFACTURE
		if(!queryForNetwork.isEmpty() && !queryForManuFacture.isEmpty() )
			
		{
			//need to remove the where form networkquery
				queryNwandMan=queryForNetwork + queryForManuFacture;
				System.out.println("Query when both available "+ queryForNetwork + queryForManuFacture );
				mrMeterMfDetails = meterSearchRespository.getQueryMetermanufacturerByCriteria(queryNwandMan);
		}
		// METERMANUFACTURE NAME ONLY
		
		  if(meterSearchRequest.getManufactureName()!=null && queryForNetwork.isEmpty()
		  && queryForManuFacture.isEmpty() ) { 
			  String query=" ";
		  mrMeterManufacturerNameDetails=findbyManufacturernameCombinations(query,meterSearchRequest);
		   }
		 
			
		//METERMANUFACTURE NAME AND NETWROK VALUES ARE AVAILABLE
		
		  if(meterSearchRequest.getManufactureName()!=null && queryForNetwork!=null && queryForManuFacture.isEmpty() ) { 
		 
			  String  query=queryForNetwork; 
			  mrMeterManufacturerNameDetails =findbyManufacturernameCombinations(query,meterSearchRequest);
		 
		  }
		 
		
		//METERMANUFACTURE NAME AND NETWROK VALUES AND MANUFACTURER TYPE,CATEGORY,YEAR,FRIMVERSION ARE AVAILABLE
		if(meterSearchRequest.getManufactureName()!=null && queryForNetwork!=null && queryForManuFacture!=null )
		{
			///Need Calrification
			//String query=queryForNetwork + queryForManuFacture;
			//METERLOCATION
			//List<Object> mrMeterManufacturerNameDetails = meterSearchRespository.getMeterLocationDetailsByCriteria(query);
			//COMBINATION QUERY
			//mrMeterMfDetails = meterSearchRespository.getQueryMetermanufacturerByCriteria(queryNwandMan);
			
			//List<Object> mrMeterManufacturerNameDetails = findbyManufacturernameCombinations(query,meterSearchRequest);
		}
		//METER COMMUNICATION STATUS ONLY 
		if(meterSearchRequest.getCommunicated()!=null)
		{
			String query="mr.connectionStatus="+meterSearchRequest.getCommunicated();
			mrMeterCommunicateDetails = meterSearchRespository.getQueryConnectionstsByCriteria(query);
		}
		//Communication ,FROM DATE & TO DATE values are available
		if(meterSearchRequest.getCommunicated()!=null && (meterSearchRequest.getFromDate()!=null) && (meterSearchRequest.getToDate()!=null))
		{
			//String query="mr.connectionStatus=";
			
			mrMeterCommunicateDetails = meterSearchRespository.getDpDetailsByCriteria(queryForComm);
		}
		// FROM DATE & TO DATE values are available and communication not available
		if(meterSearchRequest.getCommunicated()!=null && (meterSearchRequest.getFromDate()!=null) && (meterSearchRequest.getToDate()!=null))
		{
			mrMeterCommunicateDetails = meterSearchRespository.getDpDetailsByCriteria(queryForComm);
		}
		//METERGROUP only
		if(meterSearchRequest.getMeterGroup()!=null)
		{
			String query="mg.groupName="+meterSearchRequest.getMeterGroup();
			mrMeterCommunicateDetails = meterSearchRespository.getQueryQueryMeterGrpByCriteria(query);
		}
		//METERSerialNumber only
		if(meterSearchRequest.getMeterSerialNumber()!=null)
		{
			String query="mr.meterSerialNumber="+meterSearchRequest.getMeterSerialNumber();
			//mrMeterCommunicateDetails = meterSearchRespository.getQueryQueryMeterGrpByCriteria(query);
			mrMeterLocationDetails = meterSearchRespository.getQueryQueryMeterserailpByCriteria(query);
		}
		return mrMeterMfDetails;
	}

		private List<Object> findbyManufacturernameCombinations(String query,MeterSearchRequest meterSearchRequest)
		{
				//List<Object> d =new ArrayList<Object>();
		
				 mrMeterManufacturerNameDetails = meterSearchRespository.getMeterLocationDetailsByCriteria(query);
			
				List<Object> b = mrMeterManufacturerNameDetails.stream().filter(list -> meterSearchRequest.getManufactureName().equals(
						((MrMeterLocation) mrMeterManufacturerNameDetails.get(0)).getMrMeterDetails().getVmMeterManufacture().getManufactureName()))
					.collect(Collectors.toList());
				 b.forEach(c -> System.out.println(((MrMeterLocation) c).getMrMeterDetails().getConnectionStatus()));
				 
				 return b ;
		}
		
	
	
	@Override
	public List<Object> findDptimetableDetails(MeterSearchRequest meterSearchRequest) {
		// TODO Auto-generated method stub
		
		//List<Object> DpTimeTables = meterSearchRespository.getDpDetailsByCriteria(meterSearchRequest);
		return null;
	}
	
	private String searchNetworkheirachycriteria(MeterSearchRequest meterSearchRequest) {
		String query="";
		
		System.out.println("Query:"+query);
		
		if(meterSearchRequest.getCircleAutoid() != 0) {
			
			query= WHERE_VAL + CIRCLE_AUTOID + meterSearchRequest.getCircleAutoid();
			System.out.println("Query:"+query);
		}
		 if (meterSearchRequest.getDivisionAutoid() != 0)
		{
			if (query.isEmpty())
			{
				query= WHERE_VAL+DIV_AUTOID + meterSearchRequest.getDivisionAutoid();
			}
			else
			{
				query= query + AND_VAL + DIV_AUTOID + meterSearchRequest.getDivisionAutoid();
			}
		}
		 if (meterSearchRequest.getSubdivisionAutoid() != 0)
		{
			if (query.isEmpty())
			{
				query= WHERE_VAL+ SUBDIV_AUTOID + meterSearchRequest.getSubdivisionAutoid();
			}
			else
			{
				query= query + AND_VAL + SUBDIV_AUTOID +meterSearchRequest.getSubdivisionAutoid();
			}
			
		}
		 if (meterSearchRequest.getSectionAutoid() != 0)
		{
			if (query.isEmpty())
			{
				query= WHERE_VAL+ SECTION_AUTOID +meterSearchRequest.getSectionAutoid();
			}
			else
			{
				query= query + AND_VAL + SECTION_AUTOID + meterSearchRequest.getSectionAutoid();
			}
			
		}
		
		 if (meterSearchRequest.getTownAutoid() != 0)
		{
			if (query.isEmpty())
			{
				query= WHERE_VAL + TOWN_AUTOID +meterSearchRequest.getTownAutoid();
			}
			else
			{
				query= query + AND_VAL+ TOWN_AUTOID+meterSearchRequest.getTownAutoid();
			}
			
		}
		
		 if (meterSearchRequest.getSubstationAutoid() != 0)
		{
			if (query.isEmpty())
			{
				query= WHERE_VAL+SS_AUTOID+meterSearchRequest.getSubstationAutoid();
			}
			else
			{
				query= query +  AND_VAL + SS_AUTOID+meterSearchRequest.getSubstationAutoid();
			}
			
		}
		 if (meterSearchRequest.getFeederAutoid() != 0)
		{
			if (query.isEmpty())
			{
				query= WHERE_VAL+ FEEDER_AUTOID+meterSearchRequest.getFeederAutoid();
			}
			else
			{
				query= query +  AND_VAL+ FEEDER_AUTOID+meterSearchRequest.getFeederAutoid();
			}
			
		}
		 if (meterSearchRequest.getTransformerAutoid() != 0)
		{
			if (query.isEmpty())
			{
				query= WHERE_VAL+DT_AUTOID + meterSearchRequest.getTransformerAutoid();
			}
			else
			{
				query= query +  AND_VAL+ DT_AUTOID + meterSearchRequest.getTransformerAutoid();
			}
			
		}	
		return query ;
	}
	
	
	private String searchManufacturerDetails(MeterSearchRequest meterSearchRequest)
	{
		String manQuery="";

		
		if(manQuery.isEmpty())
		{
			if(meterSearchRequest.getMeterCategory()!=null)
			{
				
				manQuery= AND_VAL+" mf.meterCategory ='" + meterSearchRequest.getMeterCategory() + GRPBY_VAL;
			}
		}
		 if (meterSearchRequest.getYearofManufacture() != 0)
			{
				if (manQuery.isEmpty())
				{
					manQuery= AND_VAL+" mf.mfYear ='" + meterSearchRequest.getYearofManufacture() + GRPBY_VAL;
				}
				else
				{
					manQuery= manQuery + AND_VAL + " mf.mfYear ='" + meterSearchRequest.getYearofManufacture() + GRPBY_VAL;
				}
				
			}	
		 if (meterSearchRequest.getFirmWareVersion()!=null)
			{
				if (manQuery.isEmpty())
				{
					manQuery= AND_VAL+" mf.fwVersion ='" + meterSearchRequest.getYearofManufacture() + GRPBY_VAL;
				}
				else
				{
					manQuery= manQuery + AND_VAL + " mf.fwVersion ='" + meterSearchRequest.getYearofManufacture() +GRPBY_VAL;
				}
				
			}	
		 if (meterSearchRequest.getMeterType()!=null)
			{
				if (manQuery.isEmpty())
				{
					manQuery= AND_VAL+" mf.meterType ='" + meterSearchRequest.getYearofManufacture() + GRPBY_VAL;
				}
				else
				{
					manQuery= manQuery + AND_VAL + " mf.meterType ='" + meterSearchRequest.getYearofManufacture() + GRPBY_VAL;
				}
				
			}	
		
		
		
		
		
		return manQuery;
	}
	
	private String searchCommunicationDetails(MeterSearchRequest meterSearchRequest) {
		String commQuery = "";

		if (meterSearchRequest.getCommunicated() != null) {
			commQuery = "mr.connectionStatus=" + meterSearchRequest.getCommunicated();
		}
		if (meterSearchRequest.getFromDate() != null) {
			if (commQuery.isEmpty()) {
				commQuery = AND_VAL + "dp.insertedDate=" + meterSearchRequest.getFromDate();
			} else {
				commQuery = commQuery + AND_VAL + "dp.insertedDate=" + meterSearchRequest.getFromDate();
			}
		}
		if (meterSearchRequest.getToDate() != null) {
			if (commQuery.isEmpty()) {
				commQuery = AND_VAL + "dp.updatedDate=" + meterSearchRequest.getToDate();
			} else {
				commQuery = commQuery + AND_VAL + "dp.updatedDate=" + meterSearchRequest.getToDate();
			}
		}
		return commQuery;
	}
}