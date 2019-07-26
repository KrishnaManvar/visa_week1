package com.visa.prj.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.visa.prj.entity.Employee;
import com.visa.prj.service.TicketService;

@RestController
public class EmployeeController {
	
	@Autowired
	private TicketService service;
	
	@PostMapping("register")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee e) {
		service.addEmployee(e);
		return new ResponseEntity(e, HttpStatus.CREATED);
	}
	
	
}
