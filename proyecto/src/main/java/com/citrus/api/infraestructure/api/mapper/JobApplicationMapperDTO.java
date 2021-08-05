package com.citrus.api.infraestructure.api.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citrus.api.domain.Application;
import com.citrus.api.infraestructure.api.DTO.ApplicationDTO;
import com.citrus.api.infraestructure.api.DTO.ApplicationInterviewDTO;
import com.citrus.api.infraestructure.api.DTO.ApplicationReviewDTO;
import com.citrus.api.infraestructure.api.DTO.EmployeeDTO;
import com.citrus.api.infraestructure.api.DTO.JobOfferDTO;
import com.citrus.api.infraestructure.http.mapper.EmployeeMapperHTTP;
import com.citrus.api.infraestructure.http.mapper.JobOfferMapperHTTP;

@Service
public class JobApplicationMapperDTO {
	
	@Autowired
	JobOfferMapperHTTP jobOfferMapper;
	
	@Autowired
	EmployeeMapperHTTP employeeMapper;
	
	public ApplicationDTO toDTO(Application application){
		Integer status;
		Date date;
		Integer id;
		EmployeeDTO employee = new EmployeeDTO();
	    JobOfferDTO jobOffer = new JobOfferDTO();
	    
	    if(application.getEmployee()==(null) ) {
	    	employee= null;
	    }else {
	    	employee = employeeMapper.getById(application.getEmployee().getId().getValue());
	    }
	    if (application.getJobOffer()==null) {
	    	jobOffer = null;
	    }else {
	    	jobOffer = jobOfferMapper.getById(application.getJobOffer().getId().getValue());
 

	    }
	    
	    status = (application.getStatus()==null) ? null:application.getStatus().getValue();
	    date = (application.getDate()==null) ? null:application.getDate().getValue();
	    id = (application.getId()==null) ? null:application.getId().getValue();
	    
	    return new ApplicationDTO(id, date, employee, jobOffer,status);
	}
	public ApplicationInterviewDTO toDTOI(Application application){
		Date date;
		Integer id;
	    JobOfferDTO jobOffer = new JobOfferDTO();
	    
	    if (application.getJobOffer()==null) {
	    	jobOffer = null;
	    }else {
	    	jobOffer = jobOfferMapper.getById(application.getJobOffer().getId().getValue());
			System.out.println(jobOffer.title); 

	    }
	    
	    date = (application.getDate()==null) ? null:application.getDate().getValue();
	    id = (application.getId()==null) ? null:application.getId().getValue();
	    
	    return new ApplicationInterviewDTO(id, date, jobOffer);
	}
	
	public ApplicationReviewDTO toDTOR(Application application){
		Date date;
		Integer id;
	    JobOfferDTO jobOffer = new JobOfferDTO();
	    
	    
	    date = (application.getDate()==null) ? null:application.getDate().getValue();
	    id = (application.getId()==null) ? null:application.getId().getValue();
	    
	    return new ApplicationReviewDTO(id, date);
	}
	
	public List<ApplicationDTO> toDTO(List<Application> application) {
		List<ApplicationDTO> dto = new ArrayList<ApplicationDTO>();
		for (int i = 0; i < application.size(); i++) {
			dto.add(toDTO(application.get(i)));
        }
		return dto;
	}
}
