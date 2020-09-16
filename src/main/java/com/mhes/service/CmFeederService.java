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

	List<CmFeeder> findByFeederName(String feederName);

	List<CmFeeder> findByCirNameDivNameSubDivNameSecNameTownName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid, long sectionAutoid, long townAutoid, long substationAutoid);

}
