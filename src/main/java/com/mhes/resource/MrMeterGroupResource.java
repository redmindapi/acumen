package com.mhes.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhes.domain.CmCircle;
import com.mhes.domain.MrMeterGroup;
import com.mhes.service.MrMeterGroupService;

/**
 * 
 * @author RedMind
 *
 */
@RestController
public class MrMeterGroupResource {
	
	@Autowired
	private MrMeterGroupService mrMeterGroupService;
	
	@GetMapping("/getAllMeterGroup")
	public ResponseEntity<List<MrMeterGroup>> getAllMeterGroup() {
		List<MrMeterGroup> mrMeterGroupServices = mrMeterGroupService.findAll();
		return ResponseEntity.ok().body(mrMeterGroupServices);
	}

}
