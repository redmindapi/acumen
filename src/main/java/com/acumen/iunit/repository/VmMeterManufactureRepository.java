package com.acumen.iunit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acumen.iunit.domain.VmMeterManufacture;

@Repository
@Transactional
public interface VmMeterManufactureRepository extends JpaRepository<VmMeterManufacture, Long>{

	@Query("select autoId,manufactureName from VmMeterManufacture where manufactureName LIKE %:manufactureName%")
	List<Object> findByManufactureName(String manufactureName);
}