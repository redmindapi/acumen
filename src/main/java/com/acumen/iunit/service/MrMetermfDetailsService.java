package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.MrMetermfDetails;

/**
 * 
 * @author RedMind
 *
 */
public interface MrMetermfDetailsService {

	List<MrMetermfDetails> findAll();

	public List<Object> findByMeterType(String meterType);

	
	public List<Object> findByMfYear(long mfYear);
	
	
	public List<Object> findByFwVersion(String fwVersion);
	
	public List<Object> findByCategoryType(String type);
}
