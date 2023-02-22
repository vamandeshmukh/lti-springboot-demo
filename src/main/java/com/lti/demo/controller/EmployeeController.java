package com.lti.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.model.Employee;
import com.lti.demo.service.EmployeeService;

@RestController
public class EmployeeController {

//	EmployeeService empService = new EmployeeService();

	@Autowired
	EmployeeService empService;

	@RequestMapping("/get-emp-by-id")
	public Employee getEmpById() {
		int employeeId = 101;
		return empService.getEmployeeById(employeeId);
	}

//	getAllEmps();
//
//	getEmpById(int employeeId);
//
//	getEmpsByFirstName(String firstName);
//
//	addEmp(Employee employee);
//
//	updateEmp(Employee employee);
//
//	deleteEmp(int employeeId);	

}

//package com.lti.demo.controller;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.lti.demo.model.Employee;
//
//@RestController
//public class EmployeeController {
//
////	@RequestMapping("/emp")
////	public String emp() {
////		Employee emp = new Employee(101, "Sonu", 90000);
////		System.out.println(emp.toString());
////		return emp.toString();
////	}
//
//	@RequestMapping("/emp")
//	public Employee emp() {
//		Employee emp = new Employee(101, "Sonu", 90000);
//		System.out.println(emp.toString());
//		return emp;
//	}
//
////	getAllEmps();
////
////	getEmpById(int employeeId);
////
////	getEmpsByFirstName(String firstName);
////
////	addEmp(Employee employee);
////
////	updateEmp(Employee employee);
////
////	deleteEmp(int employeeId);	
//
//	
//}
