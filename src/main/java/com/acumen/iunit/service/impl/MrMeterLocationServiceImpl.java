package com.acumen.iunit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acumen.iunit.domain.MrMeterLocation;
import com.acumen.iunit.repository.MrMeterLocationRepository;
import com.acumen.iunit.service.MrMeterLocationService;

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
