package com.acumen.iunit.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acumen.iunit.domain.MrMeterLocation;

/**
 * 
 * @author RedMind
 *
 */

@Repository
@Transactional(readOnly = true)
public class MeterSearchRespository implements MeterLocationCustomRepository{

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<MrMeterLocation> findAllMeterSearchResults(StringBuilder query) {

		Query queryString = entityManager.createNativeQuery(query.toString(), MrMeterLocation.class);
		return queryString.getResultList();
	}

}