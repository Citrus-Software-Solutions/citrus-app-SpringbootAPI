package com.citrus.api.infraestructure.http.mapper;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.citrus.api.infraestructure.api.DTO.EmployeeDTO;

@Service
public class EmployeeMapperHTTP {
	
	final RestTemplate restTemplate;
	public EmployeeMapperHTTP(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	
	public EmployeeDTO getById(Integer id) {
		ResponseEntity<EmployeeDTO> response= restTemplate.getForEntity("https://citrus-api-nest.herokuapp.com/api-nest/employees/"+id, EmployeeDTO.class);
		EmployeeDTO employee = response.getBody();
		return employee;
		
	}


}
