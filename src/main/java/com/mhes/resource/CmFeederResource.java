package com.mhes.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mhes.domain.CmFeeder;
import com.mhes.service.CmFeederService;

/**
 * 
 * @author RedMind
 *
 */
@RestController
public class CmFeederResource {

	@Autowired
	private CmFeederService cmFeederService;

	@GetMapping("/getFeederdetails")
	public ResponseEntity<List<CmFeeder>> getFeederDetails() {
		List<CmFeeder> cmFeederDetails = cmFeederService.findAll();
		return ResponseEntity.ok().body(cmFeederDetails);
	}

	@GetMapping("/getFeederName")
	public ResponseEntity<List<CmFeeder>> getFeederName(@RequestParam String feederName) {
		List<CmFeeder> cmFeederName = cmFeederService.findByFeederName(feederName);
		return ResponseEntity.ok().body(cmFeederName);
	}

	@GetMapping("/getFeederNameByCirIdDivIdSubDivIdSecIdTownIdSubStatId")
	public ResponseEntity<List<CmFeeder>> getFeederNameByCicleIdAndDivIdAndSubDivIdAndSecIdAndTownIdAndSubStatId(
			@RequestParam long circleAutoid, @RequestParam int divisionAutoid, @RequestParam long subdivisionAutoid,
			@RequestParam long sectionAutoid, @RequestParam long townAutoid, @RequestParam long substationAutoid) {
		List<CmFeeder> cmFeederName = cmFeederService.findByCirNameDivNameSubDivNameSecNameTownName(circleAutoid,
				divisionAutoid, subdivisionAutoid, sectionAutoid, townAutoid, substationAutoid);
		return ResponseEntity.ok().body(cmFeederName);

	}
}
