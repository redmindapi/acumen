package com.mhes.repository;

/**
 * 
 * @author RedMind
 *
 */

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mhes.domain.CmCommonDetails;

@Repository
@Transactional
public interface CmCommonDetailsRepository extends JpaRepository<CmCommonDetails, Long> {

	@Query("select commonValue from CmCommonDetails where commonName='Source Meter type'")
	public List<Object> finByCommonNameMetertype();

	@Query("select commonValue from CmCommonDetails where commonName='INSTALLATION_TYPE'")
	public List<Object> finByCommonNameInstallType();

	@Query("select commonValue from CmCommonDetails where commonName='INSTALLATION_SUB_TYPE'")
	public List<Object> finByCommonNameInstallSubType();

}
