package com.Aparna.employeeapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.Aparna.employeeapp.entity.EmployeeEntity;
import com.Aparna.employeeapp.response.EmployeeResponse;
import com.Aparna.employeeapp.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empservice;
	
	@PostMapping("/employee")
	public EmployeeEntity saveEmployee( @RequestBody   EmployeeEntity entity) {
		 EmployeeEntity entityR = empservice.saveEmployee(entity);
		 return entityR;
	}
	
	@GetMapping("/employee/{id}")//instead of return entity class return model object
 	ResponseEntity<EmployeeResponse>  getemployeeDetails(@PathVariable("id") Long id){
		
	EmployeeResponse empResponse = empservice.getemployeeById(id);
		return  ResponseEntity.status(HttpStatus.OK).body(empResponse);
	}

//	@GetMapping("/employee/{id}")//instead of return entity class return model object
//	ResponseEntity<EmployeeEntity>  getemployeeDetails(@PathVariable("id") Long id){
//		
//		EmployeeEntity empResponse = empservice.getemployeeById(id);
//		return  ResponseEntity.status(HttpStatus.OK).body(empResponse);
//	}

	
}




