package com.acumen.iunit.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acumen.iunit.domain.CmDivision;
import com.acumen.iunit.service.CmDivisionService;

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
	public ResponseEntity<List<Object>> getDivisionNameBySearch(@RequestParam String divisionName) {
		List<Object> cmDivisionDetails = cmDivisionService.findByDivisionName(divisionName);
		return ResponseEntity.ok().body(cmDivisionDetails);
	}

	@GetMapping("/getDivisionNameByCircleAutoId")
	public ResponseEntity<List<Object>> getDivisionNameByCircleAutoId(@RequestParam Long circleAutoid) {
		List<Object> cmDivisionDetails = cmDivisionService.findDivisionNameBycircleAutoid(circleAutoid);
		return ResponseEntity.ok().body(cmDivisionDetails);
	}
}
