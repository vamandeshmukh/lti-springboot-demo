package com.lti.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
	public void testAddNums() { // positive test case
		int expected = 10;
		int actual = empService.addNums(5, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void testAddNums2() { // negative test case
		int unexpected = 10;
		int actual = empService.addNums(5, 6);
		assertNotEquals(unexpected, actual);
	}

}
