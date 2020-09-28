package com.mhes.resource;

import com.mhes.domain.MrMeterDetails;
import com.mhes.request.MeterRequest;
import com.mhes.response.MeterResponse;
import com.mhes.service.MrMeterDetailsService;
import com.mhes.util.Constants;

import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
	public ResponseEntity<MeterResponse> save(@Validated @RequestBody MeterRequest addMeterRequest){

		MeterResponse meterResponse = new MeterResponse();
		try {

			meterResponse = mrMeterDetailsService.save(addMeterRequest);
			
			if(null != meterResponse && !meterResponse.toString().isEmpty())
				meterResponse.setMessage(Constants.ADD_METER_SUCCESS_MESSAGE);
			else
				meterResponse.setMessage(Constants.ADD_METER_FAILURE_MESSAGE);

		}catch(Exception addMeterException) {
			meterResponse.setMessage(Constants.METER_SEARCH_RESULTS_EXCEPTION);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(meterResponse);
		}

        return ResponseEntity.status(HttpStatus.CREATED).body(meterResponse);
    }

	@PutMapping("/updateMeterDetails/{meterId}")
	public ResponseEntity<MeterResponse> update(@PathParam("meterId") String meterId, @Validated @RequestBody MeterRequest updateMeterRequest){

		MeterResponse meterResponse = mrMeterDetailsService.save(updateMeterRequest);
        return ResponseEntity.ok().body(meterResponse);
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

	@GetMapping("/getDetailsByConnectionStatus")
    public ResponseEntity<List<Object>> getDetailsByConnectionStatus(@RequestParam String connectionStatus) {
		List<Object> mrMeterDetails = mrMeterDetailsService.findByconnectionStatus(connectionStatus);
        return ResponseEntity.ok().body(mrMeterDetails);
	}

}