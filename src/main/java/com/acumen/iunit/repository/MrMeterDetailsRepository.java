package com.acumen.iunit.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acumen.iunit.domain.MrMeterDetails;

import java.util.List;

/**
 * @author SureshKumar
 *
 */

@Repository
@Transactional
public interface MrMeterDetailsRepository extends JpaRepository<MrMeterDetails, Long>{

	@Query("select meterSerialNumber from MrMeterDetails where meterSerialNumber LIKE %:mrmeterserialnumber%")
	public List<Object> findByMrMeterDetails(String mrmeterserialnumber);

	@Query("select meterSerialNumber from MrMeterDetails where connectionStatus=:connectionStatus")
	public List<Object> findByconnectionStatus(String connectionStatus);

}