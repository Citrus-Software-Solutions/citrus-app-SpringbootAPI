package com.example.demo.infraestructure.http.mapper;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.demo.infraestructure.api.DTO.EmployeeDTO;

@Service
public class EmployeeMapperHTTP {
	
	final RestTemplate restTemplate;
	public EmployeeMapperHTTP(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	
	public EmployeeDTO getById(Integer id) {
		ResponseEntity<EmployeeDTO> response= restTemplate.getForEntity("https://citrus-api-nest.herokuapp.com/api-nest/employees/"+id, EmployeeDTO.class);
		EmployeeDTO employer = response.getBody();
		return employer;
		
	}


}
