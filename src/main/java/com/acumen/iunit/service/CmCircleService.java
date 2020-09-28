package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.CmCircle;

/**
 * 
 * @author RedMind
 *
 */
public interface CmCircleService {

	List<CmCircle> findAll();

	public List<Object> findByCircleName(String circleName);
}
