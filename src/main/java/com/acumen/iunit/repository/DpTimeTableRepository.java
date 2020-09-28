package com.acumen.iunit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acumen.iunit.domain.DpTimeTable;

/**
 * 
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface DpTimeTableRepository extends JpaRepository<DpTimeTable, Long> {

	@Query("from DpTimeTable where companyAutoid =:companyAutoid")
	public List<DpTimeTable> findByCompanyAutoId(long companyAutoid);
}
