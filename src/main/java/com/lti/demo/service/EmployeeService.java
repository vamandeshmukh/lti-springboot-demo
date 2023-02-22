package com.lti.demo.service;

import com.lti.demo.model.Employee;

public class EmployeeService {

	public Employee getEmployeeById(int employeeId) {
		Employee emp = new Employee(employeeId, "Sonu", 90000);
		System.out.println(emp.toString());
		return emp;
	}

//	getAllEmployees();
//
//	getEmployeeById(int employeeId);
//
//	getEmployeesByFirstName(String firstName);
//
//	addEmployee(Employee employee);
//
//	updateEmployee(Employee employee);
//
//	deleteEmployee(int employeeId);	

}
