package com.example.demo.infraestructure.api.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.demo.domain.Application;
import com.example.demo.domain.JobOffer;
import com.example.demo.infraestructure.api.DTO.EmployeeDTO;
import com.example.demo.infraestructure.api.DTO.EmployerDTO;
import com.example.demo.infraestructure.api.DTO.JobApplicationDTO;
import com.example.demo.infraestructure.api.DTO.JobOfferDTO;
import com.example.demo.infraestructure.api.DTO.LocationDTO;

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
	    		employeed.id= application.getEmployee().getId().getValue();
	    	}
	    	employeed.setGender((application.getEmployee().getGender()== null) ? null: application.getEmployee().getGender().getGender());
	    	employeed.setBirthdate((application.getEmployee().getBirthdate()==null) ? null: application.getEmployee().getBirthdate().getValue());
	    	employee = employeed;
	    }
	    System.out.println(application.getJoboffer());
	    if (application.getJoboffer()==null) {
	    	jobOffer = null;
	    }else {
	    	LocationDTO location;
			EmployerDTO employer;
			String gender;
			Integer min_age;
			Integer max_age;
			String statusjb;
			
			if (application.getJoboffer().getLocation()== null) {
				location = null;
			}else {
				LocationDTO locationd = new LocationDTO();
				locationd.name = (application.getJoboffer().getLocation().getName() == null)? null : application.getJoboffer().getLocation().getName().getValue();
				locationd.id = (application.getJoboffer().getLocation().getId() == null)? null :application.getJoboffer().getLocation().getId().getValue();
				locationd.type = (application.getJoboffer().getLocation().getType() == null)? null : application.getJoboffer().getLocation().getType().getValue();
				location = locationd;
			}
			if (application.getJoboffer().getEmployer() == null) {
				employer = null;
			} else {
				EmployerDTO employerd = new EmployerDTO();
				employerd.name = (application.getJoboffer().getEmployer().getName() == null)? null : application.getJoboffer().getEmployer().getName().getValue();
				employerd.id = (application.getJoboffer().getEmployer().getId() == null)? null : application.getJoboffer().getEmployer().getId().getValue();
				employer=employerd;

			}
			gender = (application.getJoboffer().getGender() == null)? null : application.getJoboffer().getGender().getGender();
			min_age = (application.getJoboffer().getMin_age() == null)? null : application.getJoboffer().getMin_age().getValue();
			max_age = (application.getJoboffer().getMax_age() == null)? null : application.getJoboffer().getMax_age().getValue();
			statusjb = (application.getJoboffer().getStatus() == null)? null : application.getJoboffer().getStatus().getValue();
			
			Long idjp = application.getJoboffer().getId().getValue();
			String name = application.getJoboffer().getName().getName();
		    String description = application.getJoboffer().getDescription().getDescription();
		    Long available_vacans = application.getJoboffer().getAvailable_vacans().getQuota();
		    Date date_begin = application.getJoboffer().getDate_begin().getValue();
		    Date date_end = application.getJoboffer().getDate_end().getValue();;
		    Float salary = application.getJoboffer().getSalary().getPrice();

		    jobOffer = new JobOfferDTO(idjp, name, description, available_vacans, date_begin, date_end,
		    		statusjb, gender, salary, min_age, max_age, employer,
					 location);
	    	
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
