package com.mhes.service;

import com.mhes.domain.DpTimeTable;
import com.mhes.domain.MrMeterDetails;
import com.mhes.domain.MrMeterLocation;
import com.mhes.request.MeterSearchRequest;
import com.mhes.response.MeterSearchReponse;
import java.util.List;

/**
 * @author SureshKumar
 *
 */

public interface MeterSearchService {

	List<Object> findAllMeterSearchResults( MeterSearchRequest meterSearchRequest);
	List<Object> findDptimetableDetails(MeterSearchRequest meterSearchRequest);
}