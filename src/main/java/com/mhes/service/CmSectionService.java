package com.mhes.service;

import java.util.List;

import com.mhes.domain.CmSection;

/**
 * 
 * @author RedMind
 *
 */
public interface CmSectionService {
	List<CmSection> findAll();

	List<CmSection> findBySectionName(String sectionName);

	List<CmSection> findByCircleNameAndDivisionName(long circleAutoid, long divisionAutoid, long subdivisionAutoid);

}
