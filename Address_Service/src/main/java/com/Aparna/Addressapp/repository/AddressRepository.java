package com.Aparna.Addressapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Aparna.Addressapp.entity.AddressEntity;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {

	//address based on em[loyee id
	
	@Query(nativeQuery = true,value="SELECT ea.id,ea.lan1,ea.lan2,ea.Zip,ea.state,ea.emp_tbl_id FROM aparna_mircoservice.address_tbl ea join aparna_mircoservice.emp_tbl ee on ee.id=ea.emp_tbl_id where ea.emp_tbl_id= :employeeId ")
	AddressEntity findAddressByEmployeeId(@Param("employeeId") Long employeeId);
	
	
	
}
