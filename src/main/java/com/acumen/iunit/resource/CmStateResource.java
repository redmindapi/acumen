package com.acumen.iunit.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acumen.iunit.domain.CmState;
import com.acumen.iunit.service.CmStateService;

/**
 * 
 * @author RedMind
 *
 */
@RestController
public class CmStateResource {
	
	@Autowired
	private CmStateService cmStateService;

	@RequestMapping("/getAllStateName")
	public ResponseEntity<List<CmState>> getAllStateName() {
		List<CmState> cmStateDetails = cmStateService.findAll();
		return ResponseEntity.ok().body(cmStateDetails);
	}
	
	@PostMapping("/saveStateDetails")
	public CmState save(CmState cmState) {
		return cmStateService.save(cmState);
	}
}
