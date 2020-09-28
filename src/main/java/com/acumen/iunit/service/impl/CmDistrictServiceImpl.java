package com.acumen.iunit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acumen.iunit.domain.CmDistrict;
import com.acumen.iunit.repository.CmDistrictRepository;
import com.acumen.iunit.service.CmDistrictService;

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
