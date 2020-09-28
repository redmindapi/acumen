package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.CmSubStation;

/**
 * 
 * @author RedMind
 *
 */
public interface CmSubStationService {
	List<CmSubStation> findAll();

	List<Object> findBySubStationName(String subStationName);

	List<Object> findByCirNameAndDivNameAndSubDivNameAndSecNameAndTownName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid, long sectionAutoid, long townAutoid);
}
