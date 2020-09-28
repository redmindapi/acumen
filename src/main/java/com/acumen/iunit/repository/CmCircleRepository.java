package com.acumen.iunit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acumen.iunit.domain.CmCircle;

/**
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface CmCircleRepository extends JpaRepository<CmCircle, Long> {

	@Query("select circleName,autoId from CmCircle where circleName LIKE %:circleName%")
	public List<Object> findByCircleName(String circleName);
}
