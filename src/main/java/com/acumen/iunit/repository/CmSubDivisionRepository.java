package com.acumen.iunit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acumen.iunit.domain.CmSubDivision;

/**
 * 
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmSubDivisionRepository extends JpaRepository<CmSubDivision, Long> {

	@Query("select autoId,subdivisionName from CmSubDivision where subdivisionName LIKE %:subdivisionName%")
	List<Object> findBySubDivisionName(String subdivisionName);

	@Query("select autoId,subdivisionName from CmSubDivision where circleAutoid =:circleAutoid and divisionAutoid=:divisionAutoid")
	List<Object> findByCircleNameAndDivisionName(long circleAutoid, long divisionAutoid);

	@Query("select autoId,subdivisionName from CmSubDivision where  divisionAutoid=:divisionAutoid")
	List<Object> findByDivisionName(long divisionAutoid);
}
