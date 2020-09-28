package com.acumen.iunit.service.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acumen.iunit.domain.MrMeterLocation;
import com.acumen.iunit.repository.MeterSearchRespository;
import com.acumen.iunit.service.MeterSearchService;

@Service
public class MeterSearchServiceImpl implements MeterSearchService{

	@Autowired
	MeterSearchRespository meterSearchRespository;
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<MrMeterLocation> findAllMeterSearchResults(StringBuilder meterSearchQuery) {
		List<MrMeterLocation> mrMeterLocationList = meterSearchRespository.findAllMeterSearchResults(meterSearchQuery);
		return mrMeterLocationList;
	}
}