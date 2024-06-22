package com.Aparna.employeeapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.Aparna.employeeapp.entity.EmployeeEntity;
import com.Aparna.employeeapp.repository.Employeerepository;
import com.Aparna.employeeapp.response.AddressResponse;
import com.Aparna.employeeapp.response.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	private Employeerepository emprepo;
	
	@Autowired
	private ModelMapper modelMapper;
	//@Autowired
//	private RestTemplate restTemplate;//now null
	
//	@Value("${adressservice.base.url}")
//	private String addressBaseUrl;
	
	
	@Autowired
	private WebClient webClient;
	
//	 public EmployeeService(	@Value("${adressservice.base.url}") String  addressBaseUrl,RestTemplateBuilder builder) {
//		 System.out.println("Uri"+addressBaseUrl);
//		 this .restTemplate=builder
//				            .rootUri(addressBaseUrl)
//				            .build();
//	 }
	
	public EmployeeEntity saveEmployee(EmployeeEntity entity) {
		 return emprepo.save(entity);
 
	}
	
	
//	public EmployeeResponse getemployeeById(Long id) {
//		
//		EmployeeEntity entity = emprepo.findById(id).get();
//		EmployeeResponse  map = modelMapper.map(entity, EmployeeResponse.class);
//		
//		
//		//EmployeeResponse employeeResponse = new EmployeeResponse();
//		
////		employeeResponse.setId(entity.getId());
////		employeeResponse.setEname(entity.getEname());
////		employeeResponse.setEmail(entity.getEmail());
////		employeeResponse.setBloodgroup(entity.getBloodgroup());
//
//		return map;
//		
//	}
	
	public EmployeeResponse getemployeeById(Long id) {
		
		//AddressResponse addressResponse = new AddressResponse();
		
		 EmployeeEntity employeeEntity = emprepo.findById(id).get();//db call
		 EmployeeResponse employeeResponse = modelMapper.map(employeeEntity, EmployeeResponse.class);
		 
	//	 AddressResponse addressResponse = restTemplate.getForObject("/address/{id}", AddressResponse.class,id);//external call
		 
		 AddressResponse addressResponse = webClient//not blocking
				                           .get()
				                           .uri("/address/"+id)
				                           .retrieve()
				                           .bodyToMono(AddressResponse.class)//everything coming in reactive call
				                           .block();
				 //springcloud donot use retTemplate
		 //
		 employeeResponse.setAddressResponse(addressResponse);
		 
		 return employeeResponse;	
	}
	
//	private AddressResponse callingAddressServiceUsingRestRemplate(Long id) {
//		return restTemplate.getForObject("/address/{id}",AddressResponse.class,id);
//		
//	}
//	
//	
//	public EmployeeEntity getemployeeById(Long id) {
//		return emprepo.findById(id).get();
//	}

}
