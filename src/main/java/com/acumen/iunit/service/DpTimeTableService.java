package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.DpTimeTable;

/**
 * 
 * @author RedMind
 *
 */
public interface DpTimeTableService {

	public List<DpTimeTable> findByCompanyAutoId(long companyAutoid);
}
