package com.citrus.api.infraestructure.http.mapper;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.citrus.api.infraestructure.api.DTO.JobOfferDTO;
import com.citrus.api.infraestructure.api.DTO.StaffMemberDTO;

@Service
public class StaffMemberMapperHTTP {
	
final RestTemplate restTemplate;
	
	public StaffMemberMapperHTTP(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	
	public StaffMemberDTO getById(Integer id) {
		ResponseEntity<StaffMemberDTO> response= restTemplate.getForEntity("https://citrus-api-nest.herokuapp.com/api-nest/staff-member/"+id, StaffMemberDTO.class);
		StaffMemberDTO  dto = response.getBody();
		return dto;
		
		
		
		
	}

}
