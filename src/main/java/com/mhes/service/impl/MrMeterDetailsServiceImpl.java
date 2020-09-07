/**
 * 
 */
package com.mhes.service.impl;

import com.mhes.domain.MrMeterDetails;
import com.mhes.repository.MrMeterDetailsRepository;
import com.mhes.service.MrMeterDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author SureshKumar
 *
 */
@Service
public class MrMeterDetailsServiceImpl implements MrMeterDetailsService{

	@Autowired
    private MrMeterDetailsRepository mrMeterDetailsRepository;
	
	/*
	 * @Override public List<MrMeterDetails>
	 * findMrMeterDetailsByMeterSerialNumberAndManufactureAutoIdAndCompanyAutoId(
	 * String meterSerialNumber, int manufactureAutoId, int companyAutoId) { return
	 * mrMeterDetailsRepository.
	 * findMrMeterDetailsByMeterSerialNumberAndManufactureAutoIdAndCompanyAutoId(
	 * meterSerialNumber, manufactureAutoId, companyAutoId); }
	 */

	@Override
	public List<MrMeterDetails> findAll() {
		return mrMeterDetailsRepository.findAll();
	}

	@Override
	public MrMeterDetails save(MrMeterDetails mrMeterDetails) {
		return mrMeterDetailsRepository.save(mrMeterDetails);
	}

}