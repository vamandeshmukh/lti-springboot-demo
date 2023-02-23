package com.lti.demo.repository;

import java.util.List;

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

//	syntax 
//	public abstract List<Employee> findByFieldName(String firstName);

	public abstract List<Employee> findByFirstName(String firstName);

//	public abstract List<Employee> findBySalary(double salary);
//
//	public abstract List<Employee> findBySalaryGreaterThan(double salary);
//
//	public abstract List<Employee> findBySalaryLessThan(double salary);
//
//	public abstract List<Employee> findBySalaryBetween(double salary1, double salary2);

	// Employee findByFirstName();

}
