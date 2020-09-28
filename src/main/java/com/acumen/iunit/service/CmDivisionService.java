package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.CmDivision;

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
