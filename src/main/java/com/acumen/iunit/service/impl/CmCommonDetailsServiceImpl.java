package com.acumen.iunit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acumen.iunit.domain.CmCommonDetails;
import com.acumen.iunit.repository.CmCommonDetailsRepository;
import com.acumen.iunit.service.CmCommonDetailsService;

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
