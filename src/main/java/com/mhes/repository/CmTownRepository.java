package com.mhes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mhes.domain.CmTown;

/**
 * 
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmTownRepository extends JpaRepository<CmTown, Long> {

	@Query("select townName,autoId from CmTown where townName LIKE %:townName%")
	List<Object> findByTownName(String townName);

	@Query("select townName,autoId from CmTown where circleAutoid =:circleAutoid and divisionAutoid=:divisionAutoid and subdivisionAutoid=:subdivisionAutoid and sectionAutoid=:sectionAutoid")
	List<Object> findByCirNameAndDivNameAndSubDivNameAndSecName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid, long sectionAutoid);

}
