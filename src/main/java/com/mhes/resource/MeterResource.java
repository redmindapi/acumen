/**
 * 
 */
package com.mhes.resource;

import com.mhes.domain.MrMeterDetails;
import com.mhes.service.MrMeterDetailsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author SureshKumar
 *
 */

@RestController
public class MeterResource {

	@Autowired
    private MrMeterDetailsService mrMeterDetailsService;

	@PostMapping("/saveMeterDetails")
	public MrMeterDetails save(MrMeterDetails mrMeterDetails){
        return mrMeterDetailsService.save(mrMeterDetails);
    }
	
	@GetMapping("/getAllMeterDetails")
    public ResponseEntity<List<MrMeterDetails>> getAllMeterDetails() {
		List<MrMeterDetails> mrMeterDetails = mrMeterDetailsService.findAll();
        return ResponseEntity.ok().body(mrMeterDetails);
	}
	
	@GetMapping("/getAllMeterSerialNumber")
    public ResponseEntity<List<Object>> getAllMeterSerialNumber(@RequestParam String meterSerialnumber) {
		List<Object> mrMeterDetails = mrMeterDetailsService.findByMrMeterDetails(meterSerialnumber);
        return ResponseEntity.ok().body(mrMeterDetails);
	}

	/*
	 * @RequestMapping(value =
	 * "/getMeterDetails/{serialNumber}/{manufactureAutoId}/{companyAutoId}") public
	 * java.util.List<MrMeterDetails>
	 * getMeterDetails(@PathVariable("serialNumber")String
	 * serialNumber, @PathVariable("manufactureAutoId")String
	 * manufactureAutoId, @PathVariable("companyAutoId")String companyAutoId) {
	 * return mrMeterDetailsService.
	 * findMrMeterDetailsByMeterSerialNumberAndManufactureAutoIdAndCompanyAutoId(
	 * serialNumber,Integer.getInteger(manufactureAutoId).intValue(),Integer.
	 * getInteger(companyAutoId).intValue()); }
	 */
}