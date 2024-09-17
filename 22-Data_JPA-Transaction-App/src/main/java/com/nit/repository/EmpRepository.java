package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nit.dto.EmpAddressDTO;
import com.nit.entity.EmpTable;

public interface EmpRepository  extends JpaRepository<EmpTable, Integer>{
	
	 @Query("SELECT new com.nit.dto.EmpAddressDTO(e.eid, e.ename, e.sal, a.aid, a.city, a.country, a.state, a.type) " +
	           "FROM EmpTable e INNER JOIN AddressTable a ON e.eid = a.eid")
	    List<EmpAddressDTO> fetchEmpWithAddress();
	 


		    @Query("SELECT new com.example.dto.EmpAddressDTO(e.eid, e.ename, e.sal, a.aid, a.city, a.country, a.state, a.type) " +
		           "FROM EmpTable e INNER JOIN AddressTable a ON e.eid = a.eid WHERE e.eid = :eid")
		    List<EmpAddressDTO> fetchEmpWithAddressByEid(@Param("eid") Long eid);
		


}
