package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.CmCountry;

/**
 * 
 * @author RedMind
 *
 */
public interface CmCountryService {

	List<CmCountry> findAll();

	CmCountry save(CmCountry cmCountry);
}
