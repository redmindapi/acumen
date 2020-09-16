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

	public List<CmSubDivision> findBySubDivisionName(String subdivisionName);

	List<CmSubDivision> findByCircleNameAndDivisionName(long circleAutoid, long divisionAutoid);

	List<CmSubDivision> findByDivisionName(long divisionAutoid);
}
