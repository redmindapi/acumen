package com.mhes.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mhes.response.MeterSearchReponse;
import com.mhes.mediator.MeterSearchMediator;
import  com.mhes.request.MeterSearchRequest;

/**
 * 
 * @author RedMind
 *
 */
@RestController
public class MeterSearchResource {

	
	@GetMapping("/getSearchDetails")
	public ResponseEntity<List<MeterSearchReponse>> getTransformerDetails(@RequestParam MeterSearchRequest meterSearchRequest ) {
		//List<MeterSearchReponse> searchrmDetails = 

		//return ResponseEntity.ok().body(searchrmDetails);
		return null;
	}
}
