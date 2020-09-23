package com.mhes.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mhes.response.MeterSearchReponse;
import com.mhes.service.impl.MeterSearchServiceImpl;
import com.mhes.domain.DpTimeTable;
import com.mhes.domain.MrMeterDetails;
import com.mhes.domain.MrMeterLocation;
import  com.mhes.request.MeterSearchRequest;

/**
 * 
 * @author RedMind
 *
 */
@RestController
public class MeterSearchResource {

	@Autowired
	MeterSearchServiceImpl meterSearchServiceImpl;
	
	@GetMapping("/getMeterSearchDetails")
	
	public ResponseEntity<List<DpTimeTable>> getMeterSearchDetails(@RequestBody MeterSearchRequest meterSearchRequest) {
		
	//	meterSearchRequest.setCircleAutoid(1);
		List<DpTimeTable> meterDetails = new ArrayList<DpTimeTable>();
		
		List<Object> meterSearchDetails = meterSearchServiceImpl.findAllMeterSearchResults(meterSearchRequest); 
		
		
//		if(meterSearchDetails.size()>0)
//		{
//			System.out.println("inside man details");
//			if(!meterSearchRequest.getManufactureName().isEmpty())
//			{
//				List<Object> b = meterSearchDetails.stream() .filter(list -> meterSearchRequest.getManufactureName().equals(
//						((MrMeterLocation) meterSearchDetails.get(0)).getMrMeterDetails().getVmMeterManufacture().getManufactureName()))
//					.collect(Collectors.toList());
//				 b.forEach(c -> System.out.println(((MrMeterLocation) c).getMrMeterDetails().getConnectionStatus()));
//			}
//			
//		}
//		else
//		{
//			System.out.println("inside man details else condition");
//			 meterDetails = meterSearchServiceImpl.findDptimetableDetails(meterSearchRequest); 
//		}
		
		List<MeterSearchReponse> meterResponse=new ArrayList<MeterSearchReponse>();
		
		
//		meterSearchDetails.forEach(b -> 
//		meterResponse.get(0).setCircleName(b.getCmCircle().getCircleName())
//	        );
		//meterSearchDetails.stream().forEachOrdered(System.out::println);
				//System.out.println("List of Meter details : "+ meterSearchDetails.get(0).getCompanyAutoid());
		
		//meterResponse.set
		
		
		
//		// List 2 - Mrmeterdetails (pass comapanyAutoid as input)
//			//List<MrMeterLocation> metermrDetails =
//			long compannyid= meterSearchDetails.get(0).getCompanyAutoid();
//			List<MrMeterDetails> meterSearchDetails1= meterSearchServiceImpl.findAllMrMeterDetails(compannyid);
//			//System.out.println("List of Meter details : "+ meterSearchDetails1.get(0).);
//		
//		// List 3 - DpTimetable (pass comapanyAutoid as input)
//			List<DpTimeTable> meterSearchDetails2= meterSearchServiceImpl.findDptimetableDetails(compannyid);
//			System.out.println("List of Meter details : "+ meterSearchDetails1.get(0).getMeterName());
			
		
		return ResponseEntity.ok().body(meterDetails);
	}
}
