package com.acumen.iunit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acumen.iunit.domain.VmCompanyProfile;

import java.util.List;

@Repository
@Transactional
public interface VmCompanyProfileRepository extends JpaRepository<VmCompanyProfile, Long>{

	List<VmCompanyProfile> findVmCompanyProfileByCompanyCodeOrCompanyName(String companyCode, int companyName);
}