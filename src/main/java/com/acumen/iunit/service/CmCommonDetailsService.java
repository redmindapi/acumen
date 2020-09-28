package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.CmCommonDetails;

/**
 * 
 * @author RedMind
 *
 */
public interface CmCommonDetailsService {

	List<CmCommonDetails> findAll();
	
	public List<Object> finByCommonNameMetertype(String commonName);
	
}
