package com.mhes.service;

import java.util.List;

import com.mhes.domain.CmCircle;

/**
 * 
 * @author RedMind
 *
 */
public interface CmCircleService {

	List<CmCircle> findAll();

	public List<Object> findByCircleName(String circleName);
}
