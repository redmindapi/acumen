package com.mhes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mhes.domain.MrMeterLocation;

/**
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface MrMeterLocationRepository extends JpaRepository<MrMeterLocation, Long>{
	
	//@Query("select circleName,autoId from MrMeterLocation where circleName LIKE %:circleName%")
	//public List<MrMeterLocation> findByCircleName(String circleName);

}