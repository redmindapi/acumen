package com.acumen.iunit.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acumen.iunit.domain.CmDistrict;
import com.acumen.iunit.service.CmDistrictService;

/**
 * 
 * @author RedMind
 *
 */
@RestController
public class CmDistrictResource {

	@Autowired
	private CmDistrictService cmDistrictService;

	@RequestMapping("/getAllDistrictName")
	public ResponseEntity<List<CmDistrict>> getAllDistrictName() {
		List<CmDistrict> cmDistrictDetails = cmDistrictService.findAll();
		return ResponseEntity.ok().body(cmDistrictDetails);
	}

	@PostMapping("/saveDistrictDetails")
	public CmDistrict save(CmDistrict cmDistrict) {
		return cmDistrictService.save(cmDistrict);
	}
}
