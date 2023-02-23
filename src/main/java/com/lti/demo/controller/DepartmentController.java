package com.lti.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dept")
public class DepartmentController {

	@RequestMapping(value = "/get-all-emps", method = RequestMethod.GET, produces = "application/json")
	public Object getNothing() {

		return null;
	}

}
