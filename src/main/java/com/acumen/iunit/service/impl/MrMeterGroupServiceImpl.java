package com.acumen.iunit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acumen.iunit.domain.MrMeterGroup;
import com.acumen.iunit.repository.CmCircleRepository;
import com.acumen.iunit.repository.MrMeterGroupRepository;
import com.acumen.iunit.service.MrMeterGroupService;

@Service
public class MrMeterGroupServiceImpl implements MrMeterGroupService{

	@Autowired
	private  MrMeterGroupRepository mrMeterGroupRepository;

	@Override
	public List<MrMeterGroup> findAll() {
		// TODO Auto-generated method stub
		return mrMeterGroupRepository.findAll();
	}

	@Override
	public List<Object> findByMeterGroup(String groupName) {
		
		return mrMeterGroupRepository.findByMeterGroup(groupName);
	}
	
	

}
