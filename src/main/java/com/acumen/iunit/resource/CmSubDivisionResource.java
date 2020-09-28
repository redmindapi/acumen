package com.acumen.iunit.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acumen.iunit.domain.CmSubDivision;
import com.acumen.iunit.service.CmSubDivisionService;

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
	public ResponseEntity<List<Object>> getSubDivisionNameBySearch(@RequestParam String subdivisionName) {
		List<Object> cmSubDivisionDetails = cmSubDivisionService.findBySubDivisionName(subdivisionName);
		return ResponseEntity.ok().body(cmSubDivisionDetails);
	}

	@GetMapping("/getSubDivisionNameByCircleIdAndDivisionId")
	public ResponseEntity<List<Object>> getSubDivisionNameByCircleAutoIdAndDivisionAutoId(
			@RequestParam long circleAutoid, @RequestParam long divisionAutoid) {
		List<Object> cmDivisionDetails = cmSubDivisionService.findByCircleNameAndDivisionName(circleAutoid,
				divisionAutoid);
		return ResponseEntity.ok().body(cmDivisionDetails);
	}

	@GetMapping("/getSubDivisionNameByDivisionId")
	public ResponseEntity<List<Object>> getSubDivisionNameByDivisionAutoId(@RequestParam long divisionAutoid) {
		List<Object> cmDivisionDetails = cmSubDivisionService.findByDivisionName(divisionAutoid);
		return ResponseEntity.ok().body(cmDivisionDetails);
	}
}
