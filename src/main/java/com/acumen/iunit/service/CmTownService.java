package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.CmTown;

/**
 * 
 * @author RedMind
 *
 */
public interface CmTownService {
	List<CmTown> findAll();

	List<Object> findById(String townName);

	List<Object> findByCircleNameAndDivisionNameAndSubDivisionNameAndSectionName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid, long sectionAutoid);

}
