package com.mhes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.CmCircle;
import com.mhes.repository.CmCircleRepository;
import com.mhes.service.CmCircleService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class CmCircleServiceImpl implements CmCircleService {

	@Autowired
	private CmCircleRepository cmCircleRepository;

	@Override
	public List<CmCircle> findAll() {
		return cmCircleRepository.findAll();
	}

	@Override
	public List<Object> findByCircleName(String circleName) {

		return cmCircleRepository.findByCircleName(circleName);
	}
}
