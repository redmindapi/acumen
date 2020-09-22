/**
 * 
 */
package com.mhes.service;

import com.mhes.domain.MrMeterDetails;
import java.util.List;

/**
 * @author SureshKumar
 *
 */

public interface MrMeterDetailsService {

	//List<MrMeterDetails> findMrMeterDetailsByMeterSerialNumberAndManufactureAutoIdAndCompanyAutoId(String meterSerialNumber, int manufactureAutoId, int companyAutoId);
    List<MrMeterDetails> findAll();
    MrMeterDetails save(MrMeterDetails mrMeterDetails);
    public List<Object> findByMrMeterDetails(String meterSerialnumber);
    public List<Object> findByconnectionStatus(String connectionStatus);
}