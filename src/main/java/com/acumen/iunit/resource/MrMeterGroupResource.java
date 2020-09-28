package com.acumen.iunit.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acumen.iunit.domain.CmCircle;
import com.acumen.iunit.domain.MrMeterGroup;
import com.acumen.iunit.service.MrMeterGroupService;

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

	@GetMapping("/getByMeterGroupName")
	public ResponseEntity<List<Object>> getByMeterGroupName(@RequestParam  String groupName){
		List<Object> mrMeterGroupServices = mrMeterGroupService.findByMeterGroup(groupName);
		return ResponseEntity.ok().body(mrMeterGroupServices);
	}
}
