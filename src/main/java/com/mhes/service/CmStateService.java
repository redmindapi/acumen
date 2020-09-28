package com.mhes.service;

import java.util.List;

import com.mhes.domain.CmState;

/**
 * 
 * @author RedMind
 *
 */
public interface CmStateService {

	List<CmState> findAll();

	CmState save(CmState cmState);
}
