package com.example.demo.infraestructure.http.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.infraestructure.http.DTO.JobOfferHTTPDTO;

@Service
public class JobOfferMapperHTTP {
	
	final RestTemplate restTemplate;
	
	public JobOfferMapperHTTP(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	
	public JobOfferHTTPDTO getById(Integer id) {
		ResponseEntity<JobOfferHTTPDTO> response= restTemplate.getForEntity("https://citrus-api-nest.herokuapp.com/api-nest/job-offers/"+id, JobOfferHTTPDTO.class);
		JobOfferHTTPDTO job = response.getBody();
		return job;
		
	}

}
