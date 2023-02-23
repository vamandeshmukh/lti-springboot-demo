package com.lti.demo.exception;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.lti.demo.model.Department;
import com.lti.demo.model.Employee;

import jakarta.validation.ConstraintViolationException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Employee> handleEmployeeNotFoundException(EmployeeNotFoundException e) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", e.getMessage());
		ResponseEntity<Employee> response = new ResponseEntity<>(null, headers, status);
		return response;
	}

	@ExceptionHandler(DepartmentNotFoundException.class)
	public ResponseEntity<Department> handleDepartmentNotFoundException(DepartmentNotFoundException e) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", e.getMessage());
		ResponseEntity<Department> response = new ResponseEntity<>(null, headers, status);
		return response;
	}

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<Object> handleConstraintException(ConstraintViolationException ex) {
//		HttpStatus.UNPROCESSABLE_ENTITY;
//		 write necessary code here 
		return null;
	}

	// create other exception classes and call them where needed
	// create methods here to handle other exceptions

}
