package com.mhes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.CmDistrict;
import com.mhes.repository.CmDistrictRepository;
import com.mhes.service.CmDistrictService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class CmDistrictServiceImpl implements CmDistrictService {

	@Autowired
	private CmDistrictRepository cmDistrictRepository;

	@Override
	public List<CmDistrict> findAll() {
		return cmDistrictRepository.findAll();
	}

	@Override
	public CmDistrict save(CmDistrict cmDistrict) {
		return cmDistrictRepository.save(cmDistrict);
	}

}
