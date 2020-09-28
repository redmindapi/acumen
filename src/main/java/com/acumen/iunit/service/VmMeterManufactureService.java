package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.VmMeterManufacture;

public interface VmMeterManufactureService {

	List<VmMeterManufacture> findAll();
	List<Object> findBymanufactureName(String manufactureName);
}
