package com.Aparna.Addressapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Aparna.Addressapp.response.AddressResponse;
import com.Aparna.Addressapp.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	
	@GetMapping("/address/{employeeId}")
	public ResponseEntity<AddressResponse>  getAddressByEmployeeId(@PathVariable("employeeId") Long id) {
		AddressResponse addressResponse=null;
		addressResponse=addressService.findadressResponseByemployeeId(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
	}
}