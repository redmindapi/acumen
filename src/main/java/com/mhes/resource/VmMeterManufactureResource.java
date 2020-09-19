package com.mhes.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mhes.domain.VmMeterManufacture;
import com.mhes.service.VmMeterManufactureService;

/**
 * 
 * @author RedMind
 *
 */
@RestController
public class VmMeterManufactureResource {
	@Autowired
	private VmMeterManufactureService vmMeterManufactureService;

	@GetMapping("/getManufactureDetails")
	public ResponseEntity<List<VmMeterManufacture>> getManufactureDetails() {

		List<VmMeterManufacture> vmManfactureDetails = vmMeterManufactureService.findAll();
		return ResponseEntity.ok().body(vmManfactureDetails);
	}

	@GetMapping("/getManufactureName")
	public ResponseEntity<List<Object>> getManufactureName(@RequestParam String manufactureName) {
		List<Object> vmManfactureDetails = vmMeterManufactureService.findBymanufactureName(manufactureName);
		return ResponseEntity.ok().body(vmManfactureDetails);
	}
}
