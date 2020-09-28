/**
 * 
 */
package com.acumen.iunit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acumen.iunit.domain.VmCompanyProfile;
import com.acumen.iunit.repository.VmCompanyProfileRepository;
import com.acumen.iunit.service.VmCompanyProfileService;

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