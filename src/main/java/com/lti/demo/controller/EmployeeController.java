package com.lti.demo.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.model.Employee;
import com.lti.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@RequestMapping(value = "/get-all-emps", method = RequestMethod.GET, produces = "application/json")
	public List<Employee> getAllEmployees() {
		return empService.getAllEmployees();
	}

	@RequestMapping(value = "/get-emp-by-id/{eid}", method = RequestMethod.GET, produces = "application/json")
	public Employee getEmpById(@PathVariable(name = "eid") int employeeId) {
		return empService.getEmployeeById(employeeId);
	}

	@RequestMapping(value = "/add-emp", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Employee addEmployee(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}

}

//package com.lti.demo.controller;
//
//import java.util.List;
//import java.util.Random;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.lti.demo.model.Employee;
//import com.lti.demo.service.EmployeeService;
//
//@RestController
//public class EmployeeController {
//
////	EmployeeService empService = new EmployeeService(); // not required 
//
//	@Autowired
//	EmployeeService empService;
//
////	@RequestMapping("/get-all-emps")
////	@GetMapping("/get-all-emps")
////	@RequestMapping(value = "/get-all-emps", method = RequestMethod.GET)
//	@RequestMapping(value = "/get-all-emps", method = RequestMethod.GET, produces = "application/json")
//	public List<Employee> getAllEmployees() {
//		return empService.getAllEmployees();
//	}
//
//	@RequestMapping(value = "/get-emp-by-id/{eid}", method = RequestMethod.GET, produces = "application/json")
//	public Employee getEmpById(@PathVariable(name = "eid") int employeeId) {
//		return empService.getEmployeeById(employeeId);
//	}
//
//	@RequestMapping(value = "/add-emp", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
//	public Employee addEmployee() {
//		Employee emp = empService.getEmployeeById(new Random().nextInt(1000));
//		return empService.addEmployee(emp);
//	}
//
//}

//package com.lti.demo.controller;
//
//import java.util.List;
//import java.util.Random;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.lti.demo.model.Employee;
//import com.lti.demo.service.EmployeeService;
//
//@RestController
//public class EmployeeController {
//
////	EmployeeService empService = new EmployeeService(); // not required 
//
//	@Autowired
//	EmployeeService empService;
//
//	@RequestMapping("get-all-emps")
//	public List<Employee> getAllEmployees() {
//		return empService.getAllEmployees();
//	}
//
//	@RequestMapping("/get-emp-by-id")
//	public Employee getEmpById() {
//		int employeeId = new Random().nextInt(1000);
//		return empService.getEmployeeById(employeeId);
//	}
//
//	@RequestMapping("/add-emp")
//	public Employee addEmployee() {
//		Employee emp = empService.getEmployeeById(new Random().nextInt(1000));
//		return empService.addEmployee(emp);
//	}
//
//}

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
