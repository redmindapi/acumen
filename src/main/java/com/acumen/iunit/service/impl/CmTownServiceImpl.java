package com.acumen.iunit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acumen.iunit.domain.CmTown;
import com.acumen.iunit.repository.CmTownRepository;
import com.acumen.iunit.service.CmTownService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class CmTownServiceImpl implements CmTownService {

	@Autowired
	private CmTownRepository cmTownRepository;

	@Override
	public List<CmTown> findAll() {
		return cmTownRepository.findAll();
	}

	@Override
	public List<Object> findById(String townName) {

		return cmTownRepository.findByTownName(townName);
	}

	@Override
	public List<Object> findByCircleNameAndDivisionNameAndSubDivisionNameAndSectionName(long circleAutoid,
			long divisionAutoid, long subdivisionAutoid, long sectionAutoid) {

		return cmTownRepository.findByCirNameAndDivNameAndSubDivNameAndSecName(circleAutoid, divisionAutoid,
				subdivisionAutoid, sectionAutoid);
	}

}
