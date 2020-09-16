package com.mhes.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mhes.domain.CmTransformer;
import com.mhes.service.CmTransformerService;

/**
 * 
 * @author RedMind
 *
 */
@RestController
public class CmTransformerResource {

	@Autowired
	private CmTransformerService cmTransformerService;

	@GetMapping("/getTransformerdetails")
	public ResponseEntity<List<CmTransformer>> getTransformerDetails() {
		List<CmTransformer> cmTransformDetails = cmTransformerService.findAll();
		return ResponseEntity.ok().body(cmTransformDetails);
	}

	@GetMapping("/getTransformerName")
	public ResponseEntity<List<CmTransformer>> getTransformerName(@RequestParam String transformerName) {
		List<CmTransformer> cmTransformName = cmTransformerService.findByTransformerName(transformerName);
		return ResponseEntity.ok().body(cmTransformName);
	}

	@GetMapping("/getTransformerNameByCirIdDivIdSubDivIdSecIdTownIdSubStatIdFeederId")
	public ResponseEntity<List<CmTransformer>> getTransformerNameByCirIdDivIdSubDivIdSecIdTownIdSubStatIdFeederId(
			@RequestParam long circleAutoid, @RequestParam long divisionAutoid, @RequestParam long subdivisionAutoid,
			@RequestParam long sectionAutoid, @RequestParam long townAutoid, @RequestParam long substationAutoid,
			@RequestParam long feederAutoid) {
		List<CmTransformer> cmTransformName = cmTransformerService
				.findByCirNameDivNameSubDivNameSecNameTownNameFeederName(circleAutoid, divisionAutoid,
						subdivisionAutoid, sectionAutoid, townAutoid, substationAutoid, feederAutoid);
		return ResponseEntity.ok().body(cmTransformName);
	}
}
