package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.MrMeterGroup;

/**
 * 
 * @author RedMind
 *
 */
public interface MrMeterGroupService {

	List<MrMeterGroup> findAll();
	List<Object>  findByMeterGroup(String groupName);
}
