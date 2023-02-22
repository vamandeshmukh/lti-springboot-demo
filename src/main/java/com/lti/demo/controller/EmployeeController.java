package com.lti.demo.controller;

import com.lti.demo.model.Employee;

public class EmployeeController {

	public Employee emp() {
		Employee emp = new Employee(101, "Sonu", 90000);
		System.out.println(emp.toString());
		return emp;
	}

}
