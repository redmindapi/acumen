package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.MrMeterLocation;
import com.acumen.iunit.request.MeterSearchRequest;

/**
 * @author SureshKumar
 *
 */

public interface MeterSearchService {

	List<MrMeterLocation> findAllMeterSearchResults(StringBuilder meterSearchQuery);

}