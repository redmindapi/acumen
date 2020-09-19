package com.mhes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.mhes.domain.CmTransformer;

/**
 * 
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmTransformerRepository extends JpaRepository<CmTransformer, Long>{

	@Query("select transformerName,autoId from CmTransformer where transformerName LIKE %:transformerName%")
	List<Object> findByTransformerName(String transformerName);

	@Query("select transformerName,autoId from CmTransformer where circleAutoid =:circleAutoid and divisionAutoid=:divisionAutoid and subdivisionAutoid=:subdivisionAutoid and sectionAutoid=:sectionAutoid and townAutoid=:townAutoid and substationAutoid=:substationAutoid and feederAutoid=:feederAutoid")
	List<Object> findByCirNameDivNameSubDivNameSecNameTownNameFeederName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid, long sectionAutoid, long townAutoid, long substationAutoid, long feederAutoid);

}
