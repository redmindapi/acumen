package com.mhes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.MrMeterGroup;
import com.mhes.repository.CmCircleRepository;
import com.mhes.repository.MrMeterGroupRepository;
import com.mhes.service.MrMeterGroupService;

@Service
public class MrMeterGroupServiceImpl implements MrMeterGroupService{

	@Autowired
	private  MrMeterGroupRepository mrMeterGroupRepository;

	@Override
	public List<MrMeterGroup> findAll() {
		// TODO Auto-generated method stub
		return mrMeterGroupRepository.findAll();
	}
	
	/*
	 * @Override public List<MrMeterGroup> findAll() { // TODO Auto-generated method
	 * stub return mrMeterGroupRepository.findAll(); }
	 */

}
