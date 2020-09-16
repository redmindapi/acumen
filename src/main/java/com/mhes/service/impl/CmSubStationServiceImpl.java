package com.mhes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.CmSubStation;
import com.mhes.repository.CmSubStationRepository;
import com.mhes.service.CmSubStationService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class CmSubStationServiceImpl implements CmSubStationService {

	@Autowired
	private CmSubStationRepository cmSubStationRepository;

	@Override
	public List<CmSubStation> findAll() {

		return cmSubStationRepository.findAll();
	}

	@Override
	public List<CmSubStation> findBySubStationName(String subStationName) {

		return cmSubStationRepository.findBySubStationName(subStationName);
	}

	@Override
	public List<CmSubStation> findByCirNameAndDivNameAndSubDivNameAndSecNameAndTownName(long circleAutoid,
			long divisionAutoid, long subdivisionAutoid, long sectionAutoid, long townAutoid) {

		return cmSubStationRepository.findByCirNameAndDivNameAndSubDivNameAndSecNameAndTownName(circleAutoid,
				divisionAutoid, subdivisionAutoid, sectionAutoid, townAutoid);
	}

}
