package com.mhes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.CmCommonDetails;
import com.mhes.repository.CmCommonDetailsRepository;
import com.mhes.service.CmCommonDetailsService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class CmCommonDetailsServiceImpl implements CmCommonDetailsService {

	@Autowired
	private CmCommonDetailsRepository cmCommonDetailsRepository;

	@Override
	public List<CmCommonDetails> findAll() {

		return cmCommonDetailsRepository.findAll();
	}

	@Override
	public List<Object> finByCommonNameMetertype(String commonName) {
		
		return cmCommonDetailsRepository.finByCommonNameMetertype(commonName);
	}

	

}
