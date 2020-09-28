package com.mhes.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhes.domain.CmCountry;
import com.mhes.service.CmCountryService;

/**
 * 
 * @author RedMind
 *
 */
@RestController
public class CmCountryResource {

	@Autowired
	private CmCountryService cmCountryService;

	@GetMapping("/getAllCountryName")
	public ResponseEntity<List<CmCountry>>getAllCountryName() {
		List<CmCountry> cmCountryDetails = cmCountryService.findAll();
		return ResponseEntity.ok().body(cmCountryDetails);
	}

	@PostMapping("/saveCountryDetails")
	public CmCountry save(CmCountry cmCountry) {
		return cmCountryService.save(cmCountry);
	}
}
