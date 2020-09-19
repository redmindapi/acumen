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

	List<Object> findByDivisionName(String divisionName);

	List<Object> findDivisionNameBycircleAutoid(long circleAutoid);

}
