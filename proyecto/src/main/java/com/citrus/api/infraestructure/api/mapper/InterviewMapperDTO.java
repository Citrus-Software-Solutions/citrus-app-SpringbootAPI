package com.citrus.api.infraestructure.api.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citrus.api.domain.Application;
import com.citrus.api.domain.Interview;
import com.citrus.api.infraestructure.api.DTO.ApplicationDTO;
import com.citrus.api.infraestructure.api.DTO.InterviewDTO;
import com.citrus.api.infraestructure.http.mapper.EmployeeMapperHTTP;
import com.citrus.api.infraestructure.http.mapper.EmployerMapperHTTP;

@Service
public class InterviewMapperDTO {
	
	@Autowired
	JobApplicationMapperDTO applicationMapper;
	
	@Autowired
	EmployeeMapperHTTP employeeMapper;


	public InterviewDTO toDTO (Interview domain) 
	{
		InterviewDTO dto = new InterviewDTO();
		dto.setAccessURL((domain.getAccessURL()==null)? null:domain.getAccessURL().getValue());
		dto.setDuration((domain.getDuration()==null)? null:domain.getDuration().getValue());
		dto.setId((domain.getId()==null)? null:domain.getId().getValue());
		dto.setStartDate((domain.getStartDate()==null)? null:domain.getStartDate().getValue());
		dto.setStatus((domain.getStatus()==null)? null:domain.getStatus().getValue());
		
		if(domain.getEmployee()==(null) ) {
	    	dto.setEmployee(null);
	    }else {
	    	dto.setEmployee(employeeMapper.getById(1));
	    }
		
		if(domain.getApplication()==(null) ) {
	    	dto.setApplication(null);
	    }else {
	    	dto.setApplication(applicationMapper.toDTOI(domain.getApplication()));
	    }
		
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

