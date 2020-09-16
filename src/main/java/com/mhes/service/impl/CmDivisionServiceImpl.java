package com.mhes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.CmDivision;
import com.mhes.repository.CmDivisionRepository;
import com.mhes.service.CmDivisionService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class CmDivisionServiceImpl implements CmDivisionService {

	@Autowired
	private CmDivisionRepository cmDivisionRepository;

	@Override
	public List<CmDivision> findAll() {
		return cmDivisionRepository.findAll();
	}

	@Override
	public List<CmDivision> findByDivisionName(String divisionName) {

		return cmDivisionRepository.findByDivisionName(divisionName);
	}

	@Override
	public List<CmDivision> findDivisionNameBycircleAutoid(long circleAutoid) {

		return cmDivisionRepository.findDivisionNameBycircleAutoid(circleAutoid);
	}

}
