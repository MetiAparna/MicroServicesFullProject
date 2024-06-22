package com.Aparna.Addressapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Aparna.Addressapp.entity.AddressEntity;
import com.Aparna.Addressapp.repository.AddressRepository;
import com.Aparna.Addressapp.response.AddressResponse;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressrepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public  AddressResponse findadressResponseByemployeeId(Long employeeId) {
		
		AddressEntity addressEntity = addressrepo.findAddressByEmployeeId(employeeId);
		
		AddressResponse addressResponse = modelMapper.map(addressEntity, AddressResponse.class);
		
		return addressResponse;
		
	}
	
	

}
