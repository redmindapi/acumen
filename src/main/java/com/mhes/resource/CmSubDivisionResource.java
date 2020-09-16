package com.mhes.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mhes.domain.CmSubDivision;
import com.mhes.service.CmSubDivisionService;

/**
 * 
 * @author RedMind
 *
 */
@RestController
public class CmSubDivisionResource {

	@Autowired
	private CmSubDivisionService cmSubDivisionService;

	@GetMapping("/getAllSubDivisionName")
	public ResponseEntity<List<CmSubDivision>> getAllSubDivisionName() {
		List<CmSubDivision> cmSubDivisionDetails = cmSubDivisionService.findAll();
		return ResponseEntity.ok().body(cmSubDivisionDetails);
	}

	@GetMapping("/getSubDivisionName")
	public ResponseEntity<List<CmSubDivision>> getSubDivisionNameBySearch(@RequestParam String subdivisionName) {
		List<CmSubDivision> cmSubDivisionDetails = cmSubDivisionService.findBySubDivisionName(subdivisionName);
		return ResponseEntity.ok().body(cmSubDivisionDetails);
	}

	@GetMapping("/getSubDivisionNameByCircleIdAndDivisionId")
	public ResponseEntity<List<CmSubDivision>> getSubDivisionNameByCircleAutoIdAndDivisionAutoId(
			@RequestParam long circleAutoid, @RequestParam long divisionAutoid) {
		List<CmSubDivision> cmDivisionDetails = cmSubDivisionService.findByCircleNameAndDivisionName(circleAutoid,
				divisionAutoid);
		return ResponseEntity.ok().body(cmDivisionDetails);
	}

	@GetMapping("/getSubDivisionNameByDivisionId")
	public ResponseEntity<List<CmSubDivision>> getSubDivisionNameByDivisionAutoId(@RequestParam long divisionAutoid) {
		List<CmSubDivision> cmDivisionDetails = cmSubDivisionService.findByDivisionName(divisionAutoid);
		return ResponseEntity.ok().body(cmDivisionDetails);
	}
}
