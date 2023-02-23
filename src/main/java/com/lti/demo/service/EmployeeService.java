package com.lti.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.demo.exception.EmployeeNotFoundException;
import com.lti.demo.model.Employee;
import com.lti.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeeRepository empRepository;

	public List<Employee> getAllEmployees() {
		List<Employee> empList = empRepository.findAll();
		LOG.info(empList.toString());
		return empList;
	}

	public Employee getEmployeeById(int employeeId) {
		Optional<Employee> empOptional = empRepository.findById(employeeId);
		if (empOptional.isPresent()) {
			LOG.info("Employee with eid " + employeeId + " was found successfully.");
			return empOptional.get();
		} else {
			String errorMessage = "Employee with eid " + employeeId + " was not found.";
			LOG.warn(errorMessage);
			throw new EmployeeNotFoundException(errorMessage);
		}
	}

	public Employee addEmployee(Employee employee) {
		LOG.info(employee.toString());
		return empRepository.save(employee);
	}

//	getEmployeesByFirstName(String firstName);
//
//	updateEmployee(Employee employee);
//
//	deleteEmployee(int employeeId);	

}

//package com.lti.demo.service;
//
//import java.util.ArrayList;
//
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//
//import com.lti.demo.model.Employee;
//
//@Service
//public class EmployeeService {
//
//	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
//
//	public List<Employee> getAllEmployees() {
//		LOG.info("getAllEmployees");
//		List<Employee> empList = new ArrayList<>();
//		empList.add(new Employee(101, "Sonu", 90000));
//		empList.add(new Employee(102, "Monu", 99000));
//		empList.add(new Employee(103, "Tonu", 95000));
//		empList.add(new Employee(104, "Ponu", 98000));
//		empList.forEach(e -> System.out.println(e.toString()));
//		return empList;
//	}
//
//	public Employee getEmployeeById(int employeeId) {
//		LOG.info(Integer.toString(employeeId));
//		Employee emp = new Employee(employeeId, "Sonu", 90000);
//		return emp;
//	}
//
//	public Employee addEmployee(Employee employee) {
//		LOG.info(employee.toString());
//		return employee;
//	}
//	
////	getEmployeesByFirstName(String firstName);
////
////	updateEmployee(Employee employee);
////
////	deleteEmployee(int employeeId);	
//
//}
