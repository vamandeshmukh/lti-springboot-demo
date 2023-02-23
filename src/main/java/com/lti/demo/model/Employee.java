package com.lti.demo.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import javax.persistence.Entity;
//import javax.persistence.Id;

@Entity
@Table(name = "employees_table")
public class Employee {

	@Id
	// Other DBs
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// MySQL
	@GenericGenerator(name = "emp_seq", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	@Column(name = "employee_id")
	private int employeeId; // PK

	@Column(name = "first_name")
	@Length(min = 3, max = 6, message = "Length should be 3 - 6")
	// apply constraints on all fields
	private String firstName;

	@Column(name = "salary")
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstName, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
