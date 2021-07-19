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
	
	public ApplicationDTO toDTO(Application application){
		Integer status;
		String date;
		Integer id;
		EmployeeDTO employee = new EmployeeDTO();
	    JobOfferDTO jobOffer = new JobOfferDTO();
	    
	    if(application.getEmployee()==null) {
	    	employee= null;
	    }else {
	    	//Faltan los demas value objects pero me dio fastidio
	    	//De todas maneras meintras el bus no este funcinal no entra aca
	    	/**EmployeeDTO employeed = new EmployeeDTO();
	    	employeed.setFirstName((application.getEmployee().getFirstName().getValue() == null)? null : application.getEmployee().getFirstName().getValue());
	    	employeed.setMiddleName((application.getEmployee().getMiddleName().getValue() == null)? null : application.getEmployee().getMiddleName().getValue());
	    	employeed.setLastName((application.getEmployee().getLastName().getValue() == null)? null : application.getEmployee().getLastName().getValue());
	    	
	    	employee = employeed;**/
	    }
	    if (application.getJobOffer()==null) {
	    	jobOffer = null;
	    }else {
	    	//Al igual que employee pero PEOR porque es mas larga
			/**EmployerDTO employer;
			String gender;
			Integer min_age;
			Integer max_age;
			String statusjb;
			
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
	    **/	
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
