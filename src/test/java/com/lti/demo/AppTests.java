package com.lti.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.demo.service.EmployeeService;

// write test cases here - 

@SpringBootTest
class AppTests {

	@Autowired
	EmployeeService empService;

	@Test
	public void testAddNums() {
		int expected = empService.addNums(5, 5);
		int actual = 5 + 5;
		assertEquals(expected, actual);
	}

	@Test
	public void testAddNums2() {
		int expected = empService.addNums(5, 5);
		int actual = 5 + 5;
		assertEquals(expected, actual);
	}

}
