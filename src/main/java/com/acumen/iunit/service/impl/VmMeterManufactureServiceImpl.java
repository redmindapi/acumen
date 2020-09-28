package com.acumen.iunit.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acumen.iunit.domain.VmMeterManufacture;
import com.acumen.iunit.repository.VmMeterManufactureRepository;
import com.acumen.iunit.service.VmMeterManufactureService;

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

		return vmMeterManufactureRepository.findByManufactureName(manufactureName);
	}

}