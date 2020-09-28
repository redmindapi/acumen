package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.CmState;

/**
 * 
 * @author RedMind
 *
 */
public interface CmStateService {

	List<CmState> findAll();

	CmState save(CmState cmState);
}
