package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.undirectional.entities.Department;
import com.example.demo.undirectional.entities.Employee;
import com.example.demo.undirectional.repository.DepartmentRepository;
import com.example.demo.undirectional.repository.EmployeeRepository;

@Component
public class OneToOne implements CommandLineRunner{
	
	@Autowired
	DepartmentRepository dr;

	@Autowired
	EmployeeRepository er;

	@Override
	public void run(String... args) throws Exception {
		
		Department de = new Department();
		de.setName("developing");
		dr.save(de);
		
		Employee em = new Employee();
		em.setEmployeeName("Alex Nikolic");
		em.setDepartment(de);
		er.save(em);
		/*
		 We have to save both Department an Employee. If we use Cascade than only one an secon will be saved
		 		automatically
		 */
		
		
	}

}
