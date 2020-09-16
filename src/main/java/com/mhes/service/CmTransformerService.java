package com.mhes.service;

import java.util.List;

import com.mhes.domain.CmTransformer;

/**
 * 
 * @author RedMind
 *
 */
public interface CmTransformerService {

	List<CmTransformer> findAll();

	List<CmTransformer> findByTransformerName(String transformerName);

	List<CmTransformer> findByCirNameDivNameSubDivNameSecNameTownNameFeederName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid, long sectionAutoid, long townAutoid, long substationAutoid, long feederAutoid);

}
