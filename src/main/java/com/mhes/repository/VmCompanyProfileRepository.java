package com.mhes.repository;

import com.mhes.domain.VmCompanyProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public interface VmCompanyProfileRepository extends JpaRepository<VmCompanyProfile, Long>{

	List<VmCompanyProfile> findVmCompanyProfileByCompanyCodeOrCompanyName(String companyCode, int companyName);
}