package com.nit;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entityOneToOne.Address;
import com.nit.entityOneToOne.Employee;
import com.nit.repository.EmployeeRepository;

@Component
public class DemoRunner implements CommandLineRunner {
    @Autowired
    private EmployeeRepository empRepo;

    @Override
    public void run(String... args) throws Exception {
		/*
		 * Employee e = new Employee(); e.setEname("Nagesh"); e.setEmail("n@gmail.com");
		 * e.setEid(102);
		 * 
		 * Address ad = new Address(); ad.setState("MH"); ad.setCity("Chandrapur");
		 * ad.setId(1002);
		 * 
		 * // Set bidirectional relationship ad.setEmployee(e); // Set employee in
		 * address e.setAddress(ad); // Set address in employee
		 * 
		 * // Save the employee, cascading will also save address Employee employee =
		 * empRepo.save(e); System.out.println(employee);
		 */
    	
    	
    	Optional<Employee> id = empRepo.findById(102);
    	if(id.isPresent()) {
    		System.out.println(id.get());
    		System.out.println(id.get().getAddress());
    	}
    	else {System.out.println("Not Found");}
    }
}
