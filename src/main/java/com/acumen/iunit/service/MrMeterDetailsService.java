package com.acumen.iunit.service;

import java.util.List;

import com.acumen.iunit.domain.MrMeterDetails;
import com.acumen.iunit.request.MeterRequest;
import com.acumen.iunit.response.MeterResponse;

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