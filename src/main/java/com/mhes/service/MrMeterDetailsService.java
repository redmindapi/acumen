package com.mhes.service;

import com.mhes.domain.MrMeterDetails;
import com.mhes.request.MeterRequest;
import com.mhes.response.MeterResponse;
import java.util.List;

/**
 * @author SureshKumar
 *
 */

public interface MrMeterDetailsService {

    List<MrMeterDetails> findAll();

    public List<Object> findByMrMeterDetails(String meterSerialnumber);

    public List<Object> findByconnectionStatus(String connectionStatus);

    public MeterResponse save(MeterRequest addMeterRequest);

}