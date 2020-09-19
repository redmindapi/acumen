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

	List<Object> findBySectionName(String sectionName);

	List<Object> findByCircleNameAndDivisionName(long circleAutoid, long divisionAutoid, long subdivisionAutoid);

}
