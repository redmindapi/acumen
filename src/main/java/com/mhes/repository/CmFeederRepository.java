package com.mhes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mhes.domain.CmFeeder;

/**
 * 
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmFeederRepository extends JpaRepository<CmFeeder, Long> {

	@Query("from CmFeeder where feederName LIKE %:feederName%")
	List<CmFeeder> findByFeederName(String feederName);

	@Query("from CmFeeder where circleAutoid =:circleAutoid and divisionAutoid=:divisionAutoid and subdivisionAutoid=:subdivisionAutoid and sectionAutoid=:sectionAutoid and townAutoid=:townAutoid and substationAutoid=:substationAutoid")
	List<CmFeeder> findByCirNameDivNameSubDivNameSecNameTownName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid, long sectionAutoid, long townAutoid, long substationAutoid);

}
