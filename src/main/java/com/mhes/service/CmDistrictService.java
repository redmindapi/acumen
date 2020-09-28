package com.mhes.service;

import java.util.List;

import com.mhes.domain.CmDistrict;

/**
 * 
 * @author RedMind
 *
 */
public interface CmDistrictService {

	List<CmDistrict> findAll();

	CmDistrict save(CmDistrict cmDistrict);

}
