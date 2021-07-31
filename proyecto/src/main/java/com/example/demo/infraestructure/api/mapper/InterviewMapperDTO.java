package com.example.demo.infraestructure.api.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Application;
import com.example.demo.domain.Interview;
import com.example.demo.infraestructure.api.DTO.ApplicationDTO;
import com.example.demo.infraestructure.api.DTO.InterviewDTO;

@Service
public class InterviewMapperDTO {
	
	@Autowired
	JobApplicationMapperDTO applicationMapper;


	public InterviewDTO toDTO (Interview domain) 
	{
		InterviewDTO dto = new InterviewDTO();
		dto.setAccessURL((domain.getAccessURL()==null)? null:domain.getAccessURL().getValue());
		dto.setApplication((domain.getApplication()== null)? null: applicationMapper.toDTO(domain.getApplication()));
		dto.setDuration((domain.getDuration()==null)? null:domain.getDuration().getValue());
		//dto.setEmployee((domain.getEmployee()== null)? null: employeeMapper.toDTO(domain.getEmployee()));
		dto.setId((domain.getId()==null)? null:domain.getId().getValue());
		//dto.setStaffMember((domain.getStaffMember()== null)? null: staffMemberMapper.toDTO(domain.getStaffMember()));
		dto.setStartDate((domain.getStartDate()==null)? null:domain.getStartDate().getValue());
		dto.setStatus((domain.getStatus()==null)? null:domain.getStatus().getValue());
		
		
		return dto;
	}
	
	public List<InterviewDTO> toDTO(List<Interview> interview) {
	List<InterviewDTO> dto = new ArrayList<InterviewDTO>();
	for (int i = 0; i < interview.size(); i++) {
		dto.add(toDTO(interview.get(i)));
    }
	return dto;
}
	
}

