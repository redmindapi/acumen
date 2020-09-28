package com.mhes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.CmState;
import com.mhes.repository.CmStateRepository;
import com.mhes.service.CmStateService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class CmStateServiceImpl implements CmStateService {

	@Autowired
	private CmStateRepository cmStateRepository;

	@Override
	public List<CmState> findAll() {
		return cmStateRepository.findAll();
	}

	@Override
	public CmState save(CmState cmState) {
		return cmStateRepository.save(cmState);
	}

}
