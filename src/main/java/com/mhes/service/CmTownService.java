package com.mhes.service;

import java.util.List;

import com.mhes.domain.CmTown;

/**
 * 
 * @author RedMind
 *
 */
public interface CmTownService {
	List<CmTown> findAll();

	List<CmTown> findById(String townName);

	List<CmTown> findByCircleNameAndDivisionNameAndSubDivisionNameAndSectionName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid, long sectionAutoid);

}
