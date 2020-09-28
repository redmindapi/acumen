package com.mhes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.CmCountry;
import com.mhes.repository.CmCountryRepository;
import com.mhes.service.CmCountryService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class CmCountryServiceImpl implements CmCountryService {

	@Autowired
	private CmCountryRepository cmCountryRepository;

	@Override
	public List<CmCountry> findAll() {
		return cmCountryRepository.findAll();
	}

	@Override
	public CmCountry save(CmCountry cmCountry) {
		return cmCountryRepository.save(cmCountry);
	}

}
