package com.lti.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping("/emp")
	public String emp() {
		Employee emp = new Employee(101, "Sonu", 90000);
		System.out.println(emp.toString());
		return emp.toString();
	}

}
