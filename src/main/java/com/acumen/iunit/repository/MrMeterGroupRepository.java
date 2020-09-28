package com.acumen.iunit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acumen.iunit.domain.MrMeterGroup;



/**
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface MrMeterGroupRepository extends JpaRepository<MrMeterGroup, Long> {
	
	@Query("select groupCode,groupName from MrMeterGroup where groupName=:groupName")
    List<Object>  findByMeterGroup(String groupName);
}
