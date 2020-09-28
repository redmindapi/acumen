package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.CmTransformer;

/**
 * 
 * @author RedMind
 *
 */
public interface CmTransformerService {

	List<CmTransformer> findAll();

	List<Object> findByTransformerName(String transformerName);

	List<Object> findByCirNameDivNameSubDivNameSecNameTownNameFeederName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid, long sectionAutoid, long townAutoid, long substationAutoid, long feederAutoid);

}
