package com.mhes.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mhes.domain.CmCommonDetails;
import com.mhes.domain.CmSubDivision;
import com.mhes.service.CmCommonDetailsService;

/**
 * 
 * @author RedMind
 *
 */
@RestController
public class CmCommonDetailsResource {
	
	@Autowired
	private CmCommonDetailsService cmCommonDetailsService;
	
	@GetMapping("/getAllCmCommonDetails")
	public ResponseEntity<List<CmCommonDetails>> getAllCmCommonDetails(){
		
		List<CmCommonDetails> cmcommonDetails = cmCommonDetailsService.findAll();
		return ResponseEntity.ok().body(cmcommonDetails);
	}

	@GetMapping("/getCommonNameByMeterType")
	public ResponseEntity<List<Object>> getCommonNameByMeterType(@RequestParam String commonName){
		
		List<Object> cmcommonDetails = cmCommonDetailsService.finByCommonNameMetertype(commonName);
		return ResponseEntity.ok().body(cmcommonDetails);
	}
	
	
}
