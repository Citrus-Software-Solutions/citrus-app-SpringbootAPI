package com.example.demo.infraestructure.api.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.demo.domain.Application;
import com.example.demo.domain.JobOffer;
import com.example.demo.infraestructure.api.DTO.EmployeeDTO;
import com.example.demo.infraestructure.api.DTO.JobApplicationDTO;
import com.example.demo.infraestructure.api.DTO.JobOfferDTO;

public class JobApplicationMapperDTO {
	
	public JobApplicationDTO toDTO(Application application){
		String status;
		Date date;
		Long id;
		EmployeeDTO employee;
	    JobOfferDTO jobOffer;
	    
	    if(application.getEmployee()==null) {
	    	employee= null;
	    }else {
	    	EmployeeDTO employeed = new EmployeeDTO();
	    	employeed.setName((application.getEmployee().getName().getName() == null)? null : application.getEmployee().getName().getName());
	    	employeed.setSecondname((application.getEmployee().getName().getSecondname() == null)? null : application.getEmployee().getName().getSecondname());
	    	employeed.setLastname((application.getEmployee().getName().getLastname() == null)? null : application.getEmployee().getName().getLastname());
	    	employeed.setSecondLastName((application.getEmployee().getName().getSecondLastname() == null)? null : application.getEmployee().getName().getSecondLastname());
	    	if (application.getEmployee().getId()==null) { 
	    		employeed.id= 0;
	    	}else {
	    		application.getEmployee().getId().getValue();
	    	}
	    	employeed.setGender((application.getEmployee().getGender()== null) ? null: application.getEmployee().getGender().getGender());
	    	employeed.setBirthdate((application.getEmployee().getBirthdate()==null) ? null: application.getEmployee().getBirthdate().getValue());
	    	employee = employeed;
	    }
	    if (application.getJoboffer()==null) {
	    	jobOffer = null;
	    }else {
	    	JobOfferMapperDTO mapper = null;
	    	jobOffer= mapper.toDTO(application.getJoboffer());
	    	
	    }
	    status = (application.getStatus()==null) ? null:application.getStatus().getValue();
	    date = (application.getDate()==null) ? null:application.getDate().getValue();
	    id = (application.getId()==null) ? null:application.getId().getValue();
	    
	    return new JobApplicationDTO(id,status, date, employee, jobOffer);
	}
	public List<JobApplicationDTO> toDTO(List<Application> application) {
		List<JobApplicationDTO> dto = new ArrayList<JobApplicationDTO>();
		for (int i = 0; i < application.size(); i++) {
			dto.add(toDTO(application.get(i)));
        }
		return dto;
	}
}
