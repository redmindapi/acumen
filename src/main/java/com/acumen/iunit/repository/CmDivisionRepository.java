package com.acumen.iunit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acumen.iunit.domain.CmDivision;

/**
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmDivisionRepository extends JpaRepository<CmDivision, Long> {

	@Query("select autoId,divisionName from CmDivision where divisionName LIKE %:divisionName%")
	public List<Object> findByDivisionName(String divisionName);

	@Query("select autoId,divisionName from CmDivision where circleAutoid=:circleAutoid")
	List<Object> findDivisionNameBycircleAutoid(Long circleAutoid);
}
