package com.acumen.iunit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acumen.iunit.domain.CmDivision;
import com.acumen.iunit.repository.CmDivisionRepository;
import com.acumen.iunit.service.CmDivisionService;

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
	public List<Object> findByDivisionName(String divisionName) {

		return cmDivisionRepository.findByDivisionName(divisionName);
	}

	@Override
	public List<Object> findDivisionNameBycircleAutoid(Long circleAutoid) {

		return cmDivisionRepository.findDivisionNameBycircleAutoid(circleAutoid);
	}

}
