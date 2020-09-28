package com.acumen.iunit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acumen.iunit.domain.CmFeeder;

/**
 * 
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmFeederRepository extends JpaRepository<CmFeeder, Long> {

	@Query("select autoId ,feederName from CmFeeder where feederName LIKE %:feederName%")
	List<Object> findByFeederName(String feederName);

	@Query("select autoId ,feederName from CmFeeder where circleAutoid =:circleAutoid and divisionAutoid=:divisionAutoid and subdivisionAutoid=:subdivisionAutoid and sectionAutoid=:sectionAutoid and townAutoid=:townAutoid and substationAutoid=:substationAutoid")
	List<Object> findByCirNameDivNameSubDivNameSecNameTownName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid, long sectionAutoid, long townAutoid, long substationAutoid);

}
