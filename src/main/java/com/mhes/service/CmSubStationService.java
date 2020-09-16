package com.mhes.service;

import java.util.List;

import com.mhes.domain.CmSubStation;

/**
 * 
 * @author RedMind
 *
 */
public interface CmSubStationService {
	List<CmSubStation> findAll();

	List<CmSubStation> findBySubStationName(String subStationName);

	List<CmSubStation> findByCirNameAndDivNameAndSubDivNameAndSecNameAndTownName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid, long sectionAutoid, long townAutoid);
}
