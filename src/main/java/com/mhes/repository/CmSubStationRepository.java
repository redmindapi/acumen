package com.mhes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mhes.domain.CmSubStation;

/**
 * 
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmSubStationRepository extends JpaRepository<CmSubStation, Long> {

	@Query("from CmSubStation where subStationName LIKE %:subStationName%")
	List<CmSubStation> findBySubStationName(String subStationName);

	@Query("from CmSubStation where circleAutoid =:circleAutoid and divisionAutoid=:divisionAutoid and subdivisionAutoid=:subdivisionAutoid and sectionAutoid=:sectionAutoid and townAutoid=:townAutoid")
	List<CmSubStation> findByCirNameAndDivNameAndSubDivNameAndSecNameAndTownName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid, long sectionAutoid, long townAutoid);

}
