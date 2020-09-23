/**
 * 
 */
package com.mhes.repository;
import com.mhes.domain.MrMeterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * @author SureshKumar
 *
 */
@Repository
@Transactional
public interface MrMeterDetailsRepository extends JpaRepository<MrMeterDetails, Long>{

	//List<MrMeterDetails> findMrMeterDetailsByMeterSerialNumberAndManufactureAutoIdAndCompanyAutoId(String meterSerialNumber, int manufactureAutoId, int companyAutoId);

	@Query("select meterSerialNumber,companyAutoid from MrMeterDetails where meterSerialNumber LIKE %:mrmeterserialnumber%")
	public List<Object> findByMrMeterDetails(String mrmeterserialnumber);
	
	@Query("select meterSerialNumber,companyAutoid from MrMeterDetails where connectionStatus=:connectionStatus")
	public List<Object> findByconnectionStatus(String connectionStatus);
}