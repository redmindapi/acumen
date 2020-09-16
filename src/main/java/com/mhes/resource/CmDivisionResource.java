package com.mhes.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mhes.domain.CmDivision;
import com.mhes.service.CmDivisionService;

/**
 * 
 * @authorRedMind
 *
 */
@RestController
public class CmDivisionResource {

	@Autowired
	private CmDivisionService cmDivisionService;

	@GetMapping("/getAllDivisionName")
	public ResponseEntity<List<CmDivision>> getAllDivisionName() {
		List<CmDivision> cmDivisionDetails = cmDivisionService.findAll();
		return ResponseEntity.ok().body(cmDivisionDetails);
	}

	@GetMapping("/getDivisionName")
	public ResponseEntity<List<CmDivision>> getDivisionNameBySearch(@RequestParam String divisionName) {
		List<CmDivision> cmDivisionDetails = cmDivisionService.findByDivisionName(divisionName);
		return ResponseEntity.ok().body(cmDivisionDetails);
	}

	@GetMapping("/getDivisionNameByCircleAutoId")
	public ResponseEntity<List<CmDivision>> getDivisionNameByCircleAutoId(@RequestParam int circleAutoid) {
		List<CmDivision> cmDivisionDetails = cmDivisionService.findDivisionNameBycircleAutoid(circleAutoid);
		return ResponseEntity.ok().body(cmDivisionDetails);
	}
}
