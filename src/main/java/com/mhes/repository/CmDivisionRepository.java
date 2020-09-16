package com.mhes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mhes.domain.CmDivision;

/**
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmDivisionRepository extends JpaRepository<CmDivision, Long> {

	@Query("from CmDivision where divisionName LIKE %:divisionName%")
	public List<CmDivision> findByDivisionName(String divisionName);

	@Query("from CmDivision where circleAutoid=:circleAutoid")
	List<CmDivision> findDivisionNameBycircleAutoid(long circleAutoid);
}
