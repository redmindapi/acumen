package com.mhes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhes.domain.DpTimeTable;
import com.mhes.repository.DpTimeTableRepository;
import com.mhes.service.DpTimeTableService;

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
