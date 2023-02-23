package com.lti.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.demo.model.Department;
import com.lti.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository deptRepository;

	public List<Department> getAllDepartments() {
		return deptRepository.findAll();
	}

}
