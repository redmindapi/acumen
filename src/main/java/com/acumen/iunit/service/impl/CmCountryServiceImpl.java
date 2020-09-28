package com.acumen.iunit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acumen.iunit.domain.CmCountry;
import com.acumen.iunit.repository.CmCountryRepository;
import com.acumen.iunit.service.CmCountryService;

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
