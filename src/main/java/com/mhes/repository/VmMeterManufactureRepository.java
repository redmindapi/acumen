package com.mhes.repository;

import com.mhes.domain.VmMeterManufacture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface VmMeterManufactureRepository extends JpaRepository<VmMeterManufacture, Long>{

}