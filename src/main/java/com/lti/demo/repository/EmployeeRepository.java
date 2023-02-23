package com.lti.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// no methods here as of now ...
	
//	basic CRUD Ops - no need to write any methods 
	
//	select - findAll();
//	select - findById();
//	insert - save();
//	update - save();
//	delete - deleteById();
	

}
