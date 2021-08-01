package com.example.demo.infraestructure.http.mapper;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.infraestructure.api.DTO.EmployerDTO;

@Service
public class EmployerMapperHTTP {
	final RestTemplate restTemplate;
	public EmployerMapperHTTP(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	public EmployerDTO getById(Integer id) {
		ResponseEntity<EmployerDTO> response= restTemplate.getForEntity("https://citrus-api-nest.herokuapp.com/api-nest/employees/"+id, EmployerDTO.class);
		EmployerDTO employer = response.getBody();
		return employer;
	}

}
