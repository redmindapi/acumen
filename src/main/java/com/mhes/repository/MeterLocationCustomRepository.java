package com.mhes.repository;
import java.util.List;

import com.mhes.domain.MrMeterLocation;

public interface MeterLocationCustomRepository {

	List<MrMeterLocation> findAllMeterSearchResults(StringBuilder query);

}