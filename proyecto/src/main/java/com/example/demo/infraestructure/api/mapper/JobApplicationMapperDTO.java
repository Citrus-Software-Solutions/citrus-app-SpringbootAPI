package com.example.demo.infraestructure.api.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Application;
import com.example.demo.infraestructure.api.DTO.EmployeeDTO;
import com.example.demo.infraestructure.api.DTO.ApplicationDTO;
import com.example.demo.infraestructure.api.DTO.JobOfferDTO;

@Service
public class JobApplicationMapperDTO {
	
	final EmployeeMapperDTO employeeMapper;
	final JobOfferMapperDTO jobOfferMapper;

	
	public JobApplicationMapperDTO(EmployeeMapperDTO employee, JobOfferMapperDTO jobOfferMapper){
		this.employeeMapper=employee;
		this.jobOfferMapper=jobOfferMapper;
	}
	
	public ApplicationDTO toDTO(Application application){
		Integer status;
		String date;
		Integer id;
		EmployeeDTO employee = new EmployeeDTO();
	    JobOfferDTO jobOffer = new JobOfferDTO();
	    
	    if(application.getEmployee()==(null)) {
	    	employee= null;
	    }else {
	    	employee = employeeMapper.toDTO(application.getEmployee());
	    }
	    if (application.getJobOffer()==null) {
	    	jobOffer = null;
	    }else {
	    	jobOffer = jobOfferMapper.toDTO(application.getJobOffer());
	    }
	    
	    status = (application.getStatus()==null) ? null:application.getStatus().getValue();
	    date = (application.getDate()==null) ? null:application.getDate().getValue();
	    id = (application.getId()==null) ? null:application.getId().getValue();
	    
	    return new ApplicationDTO(id, date, employee, jobOffer,status);
	}
	public List<ApplicationDTO> toDTO(List<Application> application) {
		List<ApplicationDTO> dto = new ArrayList<ApplicationDTO>();
		for (int i = 0; i < application.size(); i++) {
			dto.add(toDTO(application.get(i)));
        }
		return dto;
	}
}
