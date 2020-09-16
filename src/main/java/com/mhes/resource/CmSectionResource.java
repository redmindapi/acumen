package com.mhes.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mhes.domain.CmSection;
import com.mhes.service.CmSectionService;

/**
 * 
 * @author RedMind
 *
 */
@RestController
public class CmSectionResource {

	@Autowired
	private CmSectionService cmSectionService;

	@GetMapping("/getAllSectionName")
	public ResponseEntity<List<CmSection>> getAllSectionName() {
		List<CmSection> cmSectionDetails = cmSectionService.findAll();
		return ResponseEntity.ok().body(cmSectionDetails);

	}

	@GetMapping("/getSectionName")
	public ResponseEntity<List<CmSection>> getSectionName(@RequestParam String sectionName) {
		List<CmSection> cmSectionNames = cmSectionService.findBySectionName(sectionName);
		return ResponseEntity.ok().body(cmSectionNames);
	}

	@GetMapping("/getSectionNameByCircleIdAndDivisionIdAndSubDivisionId")
	public ResponseEntity<List<CmSection>> getSectionNameByCircleIdAndDivisionIdAndSubDivisionId(@RequestParam long circleAutoid,
			@RequestParam long divisionAutoid, @RequestParam long subdivisionAutoid) {
		List<CmSection> cmSectionNames = cmSectionService.findByCircleNameAndDivisionName(circleAutoid, divisionAutoid,
				subdivisionAutoid);
		return ResponseEntity.ok().body(cmSectionNames);
	}
}
