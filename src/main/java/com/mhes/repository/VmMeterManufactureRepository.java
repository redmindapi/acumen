package com.mhes.repository;

import com.mhes.domain.VmMeterManufacture;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface VmMeterManufactureRepository extends JpaRepository<VmMeterManufacture, Long>{

	@Query("select autoId,manufactureName from VmMeterManufacture where manufactureName LIKE %:manufactureName%")
	List<Object> findByManufactureName(String manufactureName);
}