package com.mhes.service;

import java.util.List;

import com.mhes.domain.CmCommonDetails;

/**
 * 
 * @author RedMind
 *
 */
public interface CmCommonDetailsService {

	List<CmCommonDetails> findAll();
	
	public List<Object> finByCommonNameMetertype();
	
	public List<Object> finByCommonNameInstallType();
	
	public List<Object> finByCommonNameInstallSubType();
}
