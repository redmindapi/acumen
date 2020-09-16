package com.mhes.service;

import java.util.List;

import com.mhes.domain.CmDivision;

/**
 * 
 * @author RedMind
 *
 */
public interface CmDivisionService {
	List<CmDivision> findAll();

	List<CmDivision> findByDivisionName(String divisionName);

	List<CmDivision> findDivisionNameBycircleAutoid(long circleAutoid);

}
