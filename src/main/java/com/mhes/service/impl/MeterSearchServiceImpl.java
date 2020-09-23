package com.mhes.service.impl;

import java.util.List;

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
	
	@Override
	public List<Object> findAllMeterSearchResults(MeterSearchRequest meterSearchRequest) {
		
		String queryForNetwork =searchNetworkheirachycriteria(meterSearchRequest);
		
		List<Object> mrMeterLocation = meterSearchRespository.getMeterLocationDetailsByCriteria(queryForNetwork);
		
		if(mrMeterLocation.size()==0)
		{
			if(meterSearchRequest.getManufactureautoid()!=0)
			{
				//List<Object> MrMeterDetails = meterSearchRespository.getDpDetailsByCriteria(meterSearchRequest);
				String queryForManuFacture=searchManufacturerDetails(meterSearchRequest);
			}				
		}
		
		
		return mrMeterLocation;
	}

	
	
	@Override
	public List<Object> findDptimetableDetails(MeterSearchRequest meterSearchRequest) {
		// TODO Auto-generated method stub
		
		//List<Object> DpTimeTables = meterSearchRespository.getDpDetailsByCriteria(meterSearchRequest);
		return null;
	}
	
	private String searchNetworkheirachycriteria(MeterSearchRequest meterSearchRequest) {
		String query="";
		if(meterSearchRequest.getCircleAutoid() != 0) {
			
			query= " where ml.circleAutoid="+meterSearchRequest.getCircleAutoid();
			
		}
		else if (meterSearchRequest.getDivisionAutoid() != 0)
		{
			if (query.isEmpty())
			{
				query= "ml.divisionAutoid="+meterSearchRequest.getDivisionAutoid();
			}
			else
			{
				query= query + " and ml.divisionAutoid="+meterSearchRequest.getDivisionAutoid();
			}
		}
		else if (meterSearchRequest.getSubdivisionAutoid() != 0)
		{
			if (query.isEmpty())
			{
				query= " where ml.subdivisionAutoid="+meterSearchRequest.getSubdivisionAutoid();
			}
			else
			{
				query= query + " and ml.subdivisionAutoid="+meterSearchRequest.getSubdivisionAutoid();
			}
			
		}
		else if (meterSearchRequest.getSectionAutoid() != 0)
		{
			if (query.isEmpty())
			{
				query= "where ml.sectionAutoid="+meterSearchRequest.getSectionAutoid();
			}
			else
			{
				query= query + " and ml.sectionAutoid="+meterSearchRequest.getSectionAutoid();
			}
			
		}
		
		else if (meterSearchRequest.getTownAutoid() != 0)
		{
			if (query.isEmpty())
			{
				query= "where ml.townAutoid="+meterSearchRequest.getTownAutoid();
			}
			else
			{
				query= query + " and ml.townAutoid="+meterSearchRequest.getTownAutoid();
			}
			
		}
		
		else if (meterSearchRequest.getSubstationAutoid() != 0)
		{
			if (query.isEmpty())
			{
				query= "where ml.substationAutoid="+meterSearchRequest.getSubstationAutoid();
			}
			else
			{
				query= query + " and ml.substationAutoid="+meterSearchRequest.getSubstationAutoid();
			}
			
		}
		else if (meterSearchRequest.getFeederAutoid() != 0)
		{
			if (query.isEmpty())
			{
				query= "where ml.feederAutoid="+meterSearchRequest.getFeederAutoid();
			}
			else
			{
				query= query + " and ml.feederAutoid="+meterSearchRequest.getFeederAutoid();
			}
			
		}
		else if (meterSearchRequest.getTransformerAutoid() != 0)
		{
			if (query.isEmpty())
			{
				query= "where ml.transformerAutoid="+meterSearchRequest.getTransformerAutoid();
			}
			else
			{
				query= query + " and ml.transformerAutoid="+meterSearchRequest.getTransformerAutoid();
			}
			
		}	
		return query ;
	}
	
	
	private String searchManufacturerDetails(MeterSearchRequest meterSearchRequest)
	{
		String manQuery="";
		if(meterSearchRequest.getManufactureautoid() != 0)
		{
			//			
			manQuery=" where dp.companyAutoid =" +meterSearchRequest.getManufactureautoid();
		}
		if(manQuery.isEmpty())
		{
			if(!meterSearchRequest.getMeterCategory().isEmpty())
			{
				
			}
		}
		
		
		
		
		
		return manQuery;
	}
	
	
}