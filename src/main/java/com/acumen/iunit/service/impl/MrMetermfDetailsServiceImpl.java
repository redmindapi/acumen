package com.acumen.iunit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acumen.iunit.domain.MrMetermfDetails;
import com.acumen.iunit.repository.MrMetermfDetailsRepository;
import com.acumen.iunit.service.MrMetermfDetailsService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class MrMetermfDetailsServiceImpl implements MrMetermfDetailsService {

	@Autowired
	private MrMetermfDetailsRepository mrMetermfDetailsRepository;

	@Override
	public List<MrMetermfDetails> findAll() {

		return mrMetermfDetailsRepository.findAll();
	}

	@Override
	public List<Object> findByMeterType(String meterType) {

		return mrMetermfDetailsRepository.findByMeterType(meterType);
	}

	@Override
	public List<Object> findByMfYear(long mfYear) {

		return mrMetermfDetailsRepository.findByMfYear(mfYear);
	}

	@Override
	public List<Object> findByFwVersion(String fwVersion) {

		return mrMetermfDetailsRepository.findByFwVersion(fwVersion);
	}
	
	@Override
	public List<Object> findByCategoryType(String type) {

		return mrMetermfDetailsRepository.findByCategoryType(type);
	}

}
