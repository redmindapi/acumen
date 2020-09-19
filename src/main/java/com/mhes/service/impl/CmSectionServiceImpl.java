package com.mhes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.CmSection;
import com.mhes.repository.CmSectionRepository;
import com.mhes.service.CmSectionService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class CmSectionServiceImpl implements CmSectionService {

	@Autowired
	private CmSectionRepository cmSectionRepository;

	@Override
	public List<CmSection> findAll() {
		return cmSectionRepository.findAll();
	}

	@Override
	public List<Object> findBySectionName(String sectionName) {

		return cmSectionRepository.findBySectionName(sectionName);
	}

	@Override
	public List<Object> findByCircleNameAndDivisionName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid) {

		return cmSectionRepository.findByCircleNameAndDivisionNameAndSubDivisionName(circleAutoid, divisionAutoid,
				subdivisionAutoid);
	}

}
