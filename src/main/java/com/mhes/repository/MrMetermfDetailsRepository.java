package com.mhes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mhes.domain.MrMetermfDetails;

/**
 * @author RedMind
 *
 */
@Repository
@Transactional
public interface MrMetermfDetailsRepository extends JpaRepository<MrMetermfDetails, Long> {
	
	@Query("select meterType,autoId from MrMetermfDetails where meterType LIKE %:meterType%")
	public List<Object> findByMeterType(String meterType);

	@Query("select mfYear ,autoId from MrMetermfDetails where mfYear=:mfYear")
	public List<Object> findByMfYear(long mfYear);
	
	@Query("select fwVersion ,autoId from MrMetermfDetails where fwVersion LIKE %:fwVersion%")
	public List<Object> findByFwVersion(String fwVersion);
	
	@Query("select meterCategory ,autoId from MrMetermfDetails  where meterCategory LIKE %:fwVersion%")
	public List<Object> findByCategoryType(String fwVersion);
}
