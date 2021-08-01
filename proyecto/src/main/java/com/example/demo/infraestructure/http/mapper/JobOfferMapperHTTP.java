package com.example.demo.infraestructure.http.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.infraestructure.api.DTO.JobOfferDTO;
@Service
public class JobOfferMapperHTTP {
	
	final RestTemplate restTemplate;
	
	public JobOfferMapperHTTP(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	
	public JobOfferDTO getById(Integer id) {
		ResponseEntity<JobOfferDTO> response= restTemplate.getForEntity("https://citrus-api-nest.herokuapp.com/api-nest/job-offers/"+id, JobOfferDTO.class);
		JobOfferDTO job = response.getBody();
		return job;
		
	}

}
