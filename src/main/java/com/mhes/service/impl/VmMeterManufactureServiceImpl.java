package com.mhes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.VmMeterManufacture;
import com.mhes.repository.VmMeterManufactureRepository;
import com.mhes.service.VmMeterManufactureService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class VmMeterManufactureServiceImpl implements VmMeterManufactureService{
	
	@Autowired
	private VmMeterManufactureRepository vmMeterManufactureRepository;

	@Override
	public List<VmMeterManufacture> findAll() {

		return vmMeterManufactureRepository.findAll();
	}

	@Override
	public List<Object> findBymanufactureName(String manufactureName) {

		return vmMeterManufactureRepository.findBymanufactureName(manufactureName);
	}
}
