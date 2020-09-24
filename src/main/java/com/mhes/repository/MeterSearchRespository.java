package com.mhes.repository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mhes.domain.DpTimeTable;
import com.mhes.domain.MrMeterDetails;
import com.mhes.domain.MrMeterLocation;
import com.mhes.request.MeterSearchRequest;

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
	public List<Object> getMeterLocationDetailsByCriteria(String query) {
		//criteriaQuery.append(query);
		Query queryString = entityManager.createNativeQuery(criteriaQuery.toString(), MrMeterLocation.class);	
		return (List<Object>) queryString.getResultList();
	}
	
	
	@Override
	public List<Object> getDpDetailsByCriteria(String query) {
		entityManager.flush();
		criteriaQueryMrDetails.append(query);
		Query queryString = entityManager.createNativeQuery(criteriaQueryDptimetableDetails.toString(), DpTimeTable.class);
		return (List<Object>) queryString.getResultList();
	}


	@Override
	public List<Object> getQueryMetermanufacturerByCriteria(String query) {
		
		CriteriaQueryMetermanufacturer.append(query);
		Query queryString = entityManager.createNativeQuery(CriteriaQueryMetermanufacturer.toString(), DpTimeTable.class);
		return (List<Object>) queryString.getResultList();
	}


	@Override
	public List<Object> getQueryConnectionstsByCriteria(String query) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Object> getQueryQueryMeterGrpByCriteria(String query) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Object> getQueryQueryMeterserailpByCriteria(String query) {
		// TODO Auto-generated method stub
		return null;
	}
}