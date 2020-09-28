package com.mhes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mhes.domain.CmDistrict;

/**
 * 
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmDistrictRepository  extends JpaRepository<CmDistrict, Long>{

}
