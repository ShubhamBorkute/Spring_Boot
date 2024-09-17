package com.nit.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.repository.HostelRoomRepository;

@Service
public class HostelRoomService {

	@Autowired
	private HostelRoomRepository repo;
	
public void insertRow(String value1,Long value2) {
	
repo.InsertRecord(value1, value2);

System.out.println("Records Saved");
}	
	
public void getCustomCol() {
List<Object[]> list = repo.getCustomCol();

String result = list.stream()
.map(row -> "Hostel Name: " + row[0] + ", Room Number: " + row[1])
.collect(Collectors.joining("\n"));

System.out.println(result);


//for each 
/*
 * list.forEach(row->{ String name =(String)row[0]; String no=(String)row[1];
 * 
 * System.out.println("Hostel Name: " + name + ", Room Number: " + no); });
 */

}
	
	
}
