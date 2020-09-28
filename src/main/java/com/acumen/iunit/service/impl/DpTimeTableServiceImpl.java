package com.acumen.iunit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acumen.iunit.domain.DpTimeTable;
import com.acumen.iunit.repository.DpTimeTableRepository;
import com.acumen.iunit.service.DpTimeTableService;

/**
 * 
 * @author RedMind
 *
 */
@Service
public class DpTimeTableServiceImpl implements DpTimeTableService{

	@Autowired
	private DpTimeTableRepository dpTimeTableRepository;
	
	@Override
	public List<DpTimeTable> findByCompanyAutoId(long companyAutoid) {
		
		return dpTimeTableRepository.findByCompanyAutoId(companyAutoid);
	}

}
