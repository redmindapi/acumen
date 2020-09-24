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
		List<MeterSearchReponse> meterResponse=new ArrayList<MeterSearchReponse>();
		return ResponseEntity.ok().body(meterDetails);
	}
}
