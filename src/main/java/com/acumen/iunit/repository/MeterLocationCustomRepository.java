package com.acumen.iunit.repository;
import java.util.List;

import com.acumen.iunit.domain.MrMeterLocation;

public interface MeterLocationCustomRepository {

	List<MrMeterLocation> findAllMeterSearchResults(StringBuilder query);

}