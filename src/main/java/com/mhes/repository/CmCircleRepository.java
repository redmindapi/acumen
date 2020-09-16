package com.mhes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mhes.domain.CmCircle;

/**
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmCircleRepository extends JpaRepository<CmCircle, Long> {

	@Query("from CmCircle where circleName LIKE %:circleName%")
	public List<CmCircle> findByCircleName(String circleName);
}
