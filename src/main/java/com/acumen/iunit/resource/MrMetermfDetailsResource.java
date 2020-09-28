package com.acumen.iunit.resource;
/**
 * 
 * @author RedMind
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acumen.iunit.domain.MrMetermfDetails;
import com.acumen.iunit.service.MrMetermfDetailsService;

@RestController
public class MrMetermfDetailsResource  {
	
	@Autowired
	private  MrMetermfDetailsService mrMetermfDetailsService;
	
	@GetMapping("/getMeterMfDetails")
	public  ResponseEntity<List<MrMetermfDetails>> getMeterMfDetails(){
		
		List<MrMetermfDetails>  mrMeterMfdetails = mrMetermfDetailsService.findAll();
		return ResponseEntity.ok().body(mrMeterMfdetails);
	}
	
	@GetMapping("/getMeterMfDetailsByMeterType")
	public ResponseEntity<List<Object>> getMeterMfDetailsByMeterType(@RequestParam String meterType) {
		
		List<Object> mrMeterMfdetails=mrMetermfDetailsService.findByMeterType(meterType);
		return ResponseEntity.ok().body(mrMeterMfdetails);
	}
	
	@GetMapping("/getMeterMfDetailsByMfYear")
	public ResponseEntity<List<Object>> getMeterMfDetailsByMfYear(@RequestParam long mfYear) {
		
		List<Object> mrMeterMfdetails=mrMetermfDetailsService.findByMfYear(mfYear);
		return ResponseEntity.ok().body(mrMeterMfdetails);
	}
	
	@GetMapping("/getMeterMfDetailsByFwVersion")
	public ResponseEntity<List<Object>> getMeterMfDetailsByFwVersion(@RequestParam String fwVersion) {
		
		List<Object> mrMeterMfdetails=mrMetermfDetailsService.findByFwVersion(fwVersion);
		return ResponseEntity.ok().body(mrMeterMfdetails);
	}
	
	@GetMapping("/getMeterMfDetailsByCategoryType")
	public ResponseEntity<List<Object>> getMeterMfDetailsByCategoryType(@RequestParam String type) {
		
		List<Object> mrMeterMfdetails=mrMetermfDetailsService.findByCategoryType(type);
		return ResponseEntity.ok().body(mrMeterMfdetails);
	}
}
