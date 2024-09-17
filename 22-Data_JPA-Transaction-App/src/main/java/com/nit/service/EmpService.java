package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nit.dto.EmpAddressDTO;
import com.nit.entity.AddressTable;
import com.nit.entity.EmpTable;
import com.nit.repository.AddressRepository;
import com.nit.repository.EmpRepository;



@Service
public class EmpService {

	private EmpRepository empRepo;
	
	private AddressRepository addrRepo;

	public EmpService(EmpRepository empRepo, AddressRepository addrRepo) {
		super();
		this.empRepo = empRepo;
		this.addrRepo = addrRepo;
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void saveInfo() {
		
		EmpTable emp=new EmpTable();
		emp.setEname("Smith");
		emp.setSal(38000.0);
		
		/*
		 * List<EmpTable> list = empRepo.findAll();
		 * 
		 * boolean empExists = list.stream() .anyMatch(e ->
		 * e.getEname().equals(emp.getEname()) && e.getSal().equals(emp.getSal()));
		 * 
		 * if (empExists) { System.out.println("Employee exists");
		 * 
		 * } else { System.out.println("Employee does not exist");
		 * 
		 * }
		 */
		
		Integer eid=0;
		List<EmpTable> list = empRepo.findAll();

		Optional<EmpTable> matchingEmp = list.stream()
		    .filter(e -> e.getEname().equals(emp.getEname()) && e.getSal().equals(emp.getSal()))
		    .findFirst();

		if (matchingEmp.isPresent()) {
		  //  System.out.println("Employee exists with ID: " + matchingEmp.get().getEmpId());
		eid = matchingEmp.get().getEid();
		} else {
		    //System.out.println("Employee does not exist");
		    eid=empRepo.save(emp).getEid();
		}
		
	//	int s=10/0;
		AddressTable addr=new AddressTable();
		addr.setCity("Pune");
		addr.setState("MH");
		addr.setCountry("India");
		addr.setType("Current");
		addr.setEid(eid);
		
		addrRepo.save(addr);

	}
	
	
	public void getEmpDataAddressData(){
		List<EmpAddressDTO> list = empRepo.fetchEmpWithAddress();
		list.forEach(System.out::println);
	}
}
