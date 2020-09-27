package com.mhes.service;

import com.mhes.domain.MrMeterLocation;
import com.mhes.request.MeterSearchRequest;
import java.util.List;

/**
 * @author SureshKumar
 *
 */

public interface MeterSearchService {

	List<MrMeterLocation> findAllMeterSearchResults(StringBuilder meterSearchQuery);

}