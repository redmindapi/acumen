package com.mhes.service;

import java.util.List;

import com.mhes.domain.DpTimeTable;

/**
 * 
 * @author RedMind
 *
 */
public interface DpTimeTableService {

	public List<DpTimeTable> findByCompanyAutoId(long companyAutoid);
}
