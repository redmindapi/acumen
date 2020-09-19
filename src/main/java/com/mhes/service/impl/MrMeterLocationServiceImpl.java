package com.mhes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.MrMeterLocation;
import com.mhes.repository.MrMeterLocationRepository;
import com.mhes.service.MrMeterLocationService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class MrMeterLocationServiceImpl implements MrMeterLocationService {

	@Autowired
	private MrMeterLocationRepository mrMeterLocationRepository;
	
	@Override
	public List<MrMeterLocation> findAll() {
		// TODO Auto-generated method stub
		return mrMeterLocationRepository.findAll();
	}

}
