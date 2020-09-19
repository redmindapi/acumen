package com.mhes.service;

import java.util.List;
import com.mhes.domain.MrMeterLocation;

/**
* 
* @author RedMind
*
*/
public interface MrMeterLocationService {

	List<MrMeterLocation> findAll();

	//public List<MrMeterLocation> findByCircleName(String circleName);
}
