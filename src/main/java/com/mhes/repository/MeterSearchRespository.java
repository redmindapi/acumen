package com.mhes.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mhes.domain.MrMeterDetails;
import com.mhes.request.MeterSearchRequest;

/**
 * 
 * @author RedMind
 *
 */
@Repository
@Transactional
public class MeterSearchRespository  {

	
	 MrMeterLocationRepository mrMeterLocationRepository;
	
	 //String query=""
}
