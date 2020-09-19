package com.mhes.service;

import java.util.List;

import com.mhes.domain.CmSubDivision;

/**
 * 
 * @author RedMind
 *
 */
public interface CmSubDivisionService {

	List<CmSubDivision> findAll();

	public List<Object> findBySubDivisionName(String subdivisionName);

	List<Object> findByCircleNameAndDivisionName(long circleAutoid, long divisionAutoid);

	List<Object> findByDivisionName(long divisionAutoid);
}
