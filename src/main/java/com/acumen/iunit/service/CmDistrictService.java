package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.CmDistrict;

/**
 * 
 * @author RedMind
 *
 */
public interface CmDistrictService {

	List<CmDistrict> findAll();

	CmDistrict save(CmDistrict cmDistrict);

}
