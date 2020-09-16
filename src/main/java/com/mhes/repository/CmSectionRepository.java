package com.mhes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mhes.domain.CmSection;

/**
 * 
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmSectionRepository extends JpaRepository<CmSection, Long> {

	@Query("from CmSection where sectionName LIKE %:sectionName%")
	public List<CmSection> findBySectionName(String sectionName);

	@Query("from CmSection where circleAutoid =:circleAutoid and divisionAutoid=:divisionAutoid and subdivisionAutoid=:subdivisionAutoid")
	List<CmSection> findByCircleNameAndDivisionNameAndSubDivisionName(long circleAutoid, long divisionAutoid,
			long subdivisionAutoid);
}
