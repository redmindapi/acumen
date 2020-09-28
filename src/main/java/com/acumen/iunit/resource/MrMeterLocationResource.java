package com.acumen.iunit.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.acumen.iunit.domain.MrMeterLocation;
import com.acumen.iunit.service.MrMeterLocationService;
/**
 * 
 * @author RedMind
 *
 */
@RestController
public class MrMeterLocationResource {

	@Autowired
	private MrMeterLocationService mrMeterLocationService;
	
	
	@GetMapping("/getAllMeterLocationName")
	public ResponseEntity<List<MrMeterLocation>> getAllMeterLocationName() {
		List<MrMeterLocation> mrMeterLocationServiceDetails = mrMeterLocationService.findAll();
		return ResponseEntity.ok().body(mrMeterLocationServiceDetails);
	}
}
