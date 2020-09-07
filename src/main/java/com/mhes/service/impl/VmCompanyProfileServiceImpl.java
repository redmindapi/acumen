/**
 * 
 */
package com.mhes.service.impl;

import java.util.List;

import com.mhes.domain.VmCompanyProfile;
import com.mhes.service.VmCompanyProfileService;
import com.mhes.repository.VmCompanyProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author SureshKumar
 *
 */
@Service
public class VmCompanyProfileServiceImpl implements VmCompanyProfileService{
	
	@Autowired
    private VmCompanyProfileRepository vmCompanyProfileRepository;
	
	@Override
	public List<VmCompanyProfile> findAll() {
		return vmCompanyProfileRepository.findAll();
	}

}