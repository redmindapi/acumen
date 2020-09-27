package com.mhes.resource;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mhes.response.MeterSearchReponse;
import com.mhes.service.impl.MeterSearchServiceImpl;
import com.mhes.util.Constants;
import com.mhes.util.MeterSearchInputCriteria;
import com.mhes.domain.MrMeterLocation;
import com.mhes.mediator.MeterSearchMediator;
import  com.mhes.request.MeterSearchRequest;

/**
 * 
 * @author RedMind
 *
 */

@RestController
public class MeterSearchResource implements Constants{

	@Autowired
	MeterSearchServiceImpl meterSearchServiceImpl;
	@Autowired
	private MeterSearchMediator meterSearchMediator;

	@GetMapping("/getMeterSearchDetails")
	public ResponseEntity<List<MeterSearchReponse>> getMeterSearchDetails(@RequestBody MeterSearchRequest meterSearchRequest) {
		
		List<MeterSearchReponse> meterSearchResponseList = new ArrayList<MeterSearchReponse>();
		List<String> errorMessage = new ArrayList<String>();
		List<MrMeterLocation> meterSearchDetails = new ArrayList<MrMeterLocation>();
		MeterSearchInputCriteria meterSearchInputCriteria = new MeterSearchInputCriteria();
		StringBuilder query;
		MeterSearchReponse meterSearchReponse = new MeterSearchReponse();

		try {

			query = meterSearchMediator.checkInputCriteriaAndGetSearchInputQuery(meterSearchRequest, meterSearchInputCriteria);

			if(null == query || query.length() <= 0 ) {
				errorMessage.add(Constants.METER_SEARCH_RESULTS);
				meterSearchResponseList.clear();
				meterSearchReponse.setErrormessage(errorMessage);
				meterSearchResponseList.add(meterSearchReponse);
			}else {
				meterSearchDetails = meterSearchServiceImpl.findAllMeterSearchResults(query);
				meterSearchResponseList = meterSearchMediator.filterMeterSearchResultsAndPrepareResponse(meterSearchDetails, meterSearchRequest, meterSearchInputCriteria);

				if(meterSearchResponseList.size() <= 0) {
					errorMessage.clear();
					errorMessage.add(Constants.NO_METER_SEARCH_RESULTS);
					meterSearchReponse.setErrormessage(errorMessage);
					meterSearchResponseList.add(meterSearchReponse);
				}
			}

		}catch(Exception meterSearchResponseException) {
			errorMessage.clear();
			errorMessage.add(Constants.METER_SEARCH_RESULTS_EXCEPTION);
			meterSearchReponse.setErrormessage(errorMessage);
			meterSearchResponseList.clear();
			meterSearchResponseList.add(meterSearchReponse);
		}
		return ResponseEntity.ok().body(meterSearchResponseList);
	}
}