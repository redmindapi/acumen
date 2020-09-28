package com.acumen.iunit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acumen.iunit.domain.CmTransformer;
import com.acumen.iunit.repository.CmTransformerRepository;
import com.acumen.iunit.service.CmTransformerService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class CmTransformerServiceImpl implements CmTransformerService {

	@Autowired
	private CmTransformerRepository cmTransformerRepository;

	@Override
	public List<CmTransformer> findAll() {

		return cmTransformerRepository.findAll();
	}

	@Override
	public List<Object> findByTransformerName(String transformerName) {

		return cmTransformerRepository.findByTransformerName(transformerName);
	}

	@Override
	public List<Object> findByCirNameDivNameSubDivNameSecNameTownNameFeederName(long circleAutoid,
			long divisionAutoid, long subdivisionAutoid, long sectionAutoid, long townAutoid, long substationAutoid,
			long feederAutoid) {

		return cmTransformerRepository.findByCirNameDivNameSubDivNameSecNameTownNameFeederName(circleAutoid,
				divisionAutoid, subdivisionAutoid, sectionAutoid, townAutoid, substationAutoid, feederAutoid);

	}

}
