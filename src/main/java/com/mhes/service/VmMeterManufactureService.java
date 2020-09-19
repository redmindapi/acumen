package com.mhes.service;

import java.util.List;

import com.mhes.domain.VmMeterManufacture;

public interface VmMeterManufactureService {

	List<VmMeterManufacture> findAll();
	List<Object> findBymanufactureName(String manufactureName);
}
