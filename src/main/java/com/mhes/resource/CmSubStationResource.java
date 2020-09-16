package com.mhes.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mhes.domain.CmSubStation;
import com.mhes.service.CmSubStationService;

/**
 * 
 * @author RedMind
 *
 */

@RestController
public class CmSubStationResource {

	@Autowired
	private CmSubStationService cmSubStationService;

	@GetMapping("/getSubStationdetails")
	public ResponseEntity<List<CmSubStation>> getTownDetails() {
		List<CmSubStation> cmSubStationDetails = cmSubStationService.findAll();
		return ResponseEntity.ok().body(cmSubStationDetails);
	}

	@GetMapping("/getSubStationName")
	public ResponseEntity<List<CmSubStation>> gettSubStationName(@RequestParam String subStationName) {
		List<CmSubStation> cmSubStationName = cmSubStationService.findBySubStationName(subStationName);
		return ResponseEntity.ok().body(cmSubStationName);
	}

	@GetMapping("/getSubStationNameByCirIdDivIdSubDivIdSecIdTownId")
	public ResponseEntity<List<CmSubStation>> gettSubStationNameByCircleAutoidAndDivisonAnSubDivisionAndSectionAndTown(
			@RequestParam int circleAutoid, @RequestParam int divisionAutoid, @RequestParam int subdivisionAutoid,
			@RequestParam int sectionAutoid, @RequestParam int townAutoid) {

		List<CmSubStation> cmSubStationName = cmSubStationService
				.findByCirNameAndDivNameAndSubDivNameAndSecNameAndTownName(circleAutoid, divisionAutoid,
						subdivisionAutoid, sectionAutoid, townAutoid);
		return ResponseEntity.ok().body(cmSubStationName);
	}
}
