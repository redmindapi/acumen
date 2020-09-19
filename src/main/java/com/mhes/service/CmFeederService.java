package com.mhes.service;

import java.util.List;

import com.mhes.domain.CmFeeder;

/**
 * 
 * @author RedMind
 *
 */
public interface CmFeederService {

	List<CmFeeder> findAll();

	List<Object> findByFeederName(String feederName);

	List<Object> findByCirNameDivNameSubDivNameSecNameTownName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid, long sectionAutoid, long townAutoid, long substationAutoid);

}
