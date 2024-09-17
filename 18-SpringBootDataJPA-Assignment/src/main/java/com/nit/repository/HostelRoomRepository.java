package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.nit.entity.HostelRoom;


public interface HostelRoomRepository  extends JpaRepository<HostelRoom, Integer> {

	@Transactional
	@Modifying
	@Query(value="INSERT INTO Hostel_Room_tab (Hname_col,roomNo_col) value(:value1,:value2)",nativeQuery = true)
	void InsertRecord(@Param("value1")String value1,@Param("value2")Long value2);
	
	@Modifying
	@Transactional
	@Query(value="SELECT Hname_col,roomNo_col FROM Hostel_Room_tab",nativeQuery = true)
	List<Object[]> getCustomCol();
	
}
