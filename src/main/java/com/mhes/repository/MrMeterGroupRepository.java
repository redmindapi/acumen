package com.mhes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mhes.domain.MrMeterGroup;



/**
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface MrMeterGroupRepository extends JpaRepository<MrMeterGroup, Long> {
	

}
