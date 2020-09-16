package com.mhes.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mhes.domain.CmCircle;
import com.mhes.service.CmCircleService;

/**
 * 
 * @author RedMind
 *
 */
@RestController
public class CmCircleResource {

	@Autowired
	private CmCircleService cmCircleService;

	@GetMapping("/getAllCircleName")
	public ResponseEntity<List<CmCircle>> getAllCircleName() {
		List<CmCircle> cmCircleDetails = cmCircleService.findAll();
		return ResponseEntity.ok().body(cmCircleDetails);
	}

	@GetMapping("/getCircleName")
	public ResponseEntity<List<CmCircle>> getCircleNameBySearch(@RequestParam String circleName) {
		List<CmCircle> cmCircleDetails = cmCircleService.findByCircleName(circleName);
		return ResponseEntity.ok().body(cmCircleDetails);
	}
}
