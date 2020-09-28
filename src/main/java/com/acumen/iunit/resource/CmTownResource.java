package com.acumen.iunit.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acumen.iunit.domain.CmTown;
import com.acumen.iunit.service.CmTownService;

/**
 * 
 * @author RedMind
 *
 */
@RestController
public class CmTownResource {

	@Autowired
	private CmTownService cmTownService;

	@GetMapping("/getTownDetails")
	public ResponseEntity<List<CmTown>> getTownDetails() {
		List<CmTown> cmTownDetails = cmTownService.findAll();
		return ResponseEntity.ok().body(cmTownDetails);
	}

	@GetMapping("/getTownName")
	public ResponseEntity<List<Object>> getTownName(@RequestParam String townName) {
		List<Object> cmTownNameDetails = cmTownService.findById(townName);
		return ResponseEntity.ok().body(cmTownNameDetails);
	}

	@GetMapping("/getTownNameByCirIdAndDivIdAnSubDivIdAndSecId")
	public ResponseEntity<List<Object>> getTownNameByCircleAutoidAndDivisonAnSubDivisionAndSection(
			@RequestParam int circleAutoid, @RequestParam int divisionAutoid, @RequestParam int subdivisionAutoid,
			@RequestParam int sectionAutoid) {
		List<Object> cmTownNameDetails = cmTownService.findByCircleNameAndDivisionNameAndSubDivisionNameAndSectionName(
				circleAutoid, divisionAutoid, subdivisionAutoid, sectionAutoid);
		return ResponseEntity.ok().body(cmTownNameDetails);
	}
}
