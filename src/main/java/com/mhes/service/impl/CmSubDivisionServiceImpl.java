package com.mhes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.CmSubDivision;
import com.mhes.repository.CmSubDivisionRepository;
import com.mhes.service.CmSubDivisionService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class CmSubDivisionServiceImpl implements CmSubDivisionService {

	@Autowired
	private CmSubDivisionRepository cmSubDivisionRepository;

	@Override
	public List<CmSubDivision> findAll() {
		return cmSubDivisionRepository.findAll();
	}

	@Override
	public List<Object> findBySubDivisionName(String subdivisionName) {

		return cmSubDivisionRepository.findBySubDivisionName(subdivisionName);
	}

	@Override
	public List<Object> findByCircleNameAndDivisionName(long circleAutoid, long divisionAutoid) {

		return cmSubDivisionRepository.findByCircleNameAndDivisionName(circleAutoid, divisionAutoid);
	}

	@Override
	public List<Object> findByDivisionName(long divisionAutoid) {

		return cmSubDivisionRepository.findByDivisionName(divisionAutoid);
	}

}
