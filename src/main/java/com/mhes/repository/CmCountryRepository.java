package com.mhes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mhes.domain.CmCountry;

/**
 * 
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmCountryRepository  extends JpaRepository<CmCountry, Long>{

}
