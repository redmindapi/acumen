package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.MrMeterLocation;

/**
* 
* @author RedMind
*
*/
public interface MrMeterLocationService {

	List<MrMeterLocation> findAll();

	//public List<MrMeterLocation> findByCircleName(String circleName);
}
