package com.mhes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mhes.domain.CmSubDivision;

/**
 * 
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmSubDivisionRepository extends JpaRepository<CmSubDivision, Long> {

	@Query("from CmSubDivision where subdivisionName LIKE %:subdivisionName%")
	List<CmSubDivision> findBySubDivisionName(String subdivisionName);

	@Query("from CmSubDivision where circleAutoid =:circleAutoid and divisionAutoid=:divisionAutoid")
	List<CmSubDivision> findByCircleNameAndDivisionName(long circleAutoid, long divisionAutoid);

	@Query("from CmSubDivision where  divisionAutoid=:divisionAutoid")
	List<CmSubDivision> findByDivisionName(long divisionAutoid);
}
