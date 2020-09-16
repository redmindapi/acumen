package com.mhes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.CmFeeder;
import com.mhes.repository.CmFeederRepository;
import com.mhes.service.CmFeederService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class CmFeederServiceImpl implements CmFeederService {

	@Autowired
	private CmFeederRepository cmFeederRepository;

	@Override
	public List<CmFeeder> findAll() {

		return cmFeederRepository.findAll();
	}

	@Override
	public List<CmFeeder> findByFeederName(String feederName) {
		return cmFeederRepository.findByFeederName(feederName);
	}

	@Override
	public List<CmFeeder> findByCirNameDivNameSubDivNameSecNameTownName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid, long sectionAutoid, long townAutoid, long substationAutoid) {

		return cmFeederRepository.findByCirNameDivNameSubDivNameSecNameTownName(circleAutoid, divisionAutoid,
				subdivisionAutoid, sectionAutoid, townAutoid, substationAutoid);
	}

}
