package com.mhes.service;

import java.util.List;

import com.mhes.domain.CmCountry;

/**
 * 
 * @author RedMind
 *
 */
public interface CmCountryService {

	List<CmCountry> findAll();

	CmCountry save(CmCountry cmCountry);
}
