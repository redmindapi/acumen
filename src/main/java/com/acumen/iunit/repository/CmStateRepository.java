package com.acumen.iunit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acumen.iunit.domain.CmState;

/**
 * 
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmStateRepository extends JpaRepository<CmState, Long>{

}
