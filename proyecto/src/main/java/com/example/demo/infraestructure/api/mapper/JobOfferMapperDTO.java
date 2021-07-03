package com.example.demo.infraestructure.api.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Employer;
import com.example.demo.domain.JobOffer;
import com.example.demo.domain.Location;
import com.example.demo.domain.valueObjects.Age;
import com.example.demo.domain.valueObjects.Gender;
import com.example.demo.infraestructure.api.DTO.EmployerDTO;
import com.example.demo.infraestructure.api.DTO.JobOfferDTO;
import com.example.demo.infraestructure.api.DTO.LocationDTO;

@Service
public class JobOfferMapperDTO {
	
	public JobOfferDTO toDTO(JobOffer jobOffer) {
		LocationDTO location;
		EmployerDTO employer;
		String gender;
		Integer min_age;
		Integer max_age;
		String status;
		
		if (jobOffer.getLocation()== null) {
			location = null;
		}else {
			LocationDTO locationd = new LocationDTO();
			locationd.name = (jobOffer.getLocation().getName() == null)? null : jobOffer.getLocation().getName().getValue();
			locationd.id = (jobOffer.getLocation().getId() == null)? null : jobOffer.getLocation().getId().getValue();
			locationd.type = (jobOffer.getLocation().getType() == null)? null : jobOffer.getLocation().getType().getValue();
			location = locationd;
		}
		if (jobOffer.getEmployer() == null) {
			employer = null;
		} else {
			EmployerDTO employerd = new EmployerDTO();
			employerd.name = (jobOffer.getEmployer().getName() == null)? null : jobOffer.getEmployer().getName().getValue();
			employerd.id = (jobOffer.getEmployer().getId() == null)? null : jobOffer.getEmployer().getId().getValue();
			employer=employerd;

		}
		gender = (jobOffer.getGender() == null)? null : jobOffer.getGender().getGender();
		min_age = (jobOffer.getMin_age() == null)? null : jobOffer.getMin_age().getValue();
		max_age = (jobOffer.getMax_age() == null)? null : jobOffer.getMax_age().getValue();
		status = (jobOffer.getStatus() == null)? null : jobOffer.getStatus().getValue();
		
		Long id = jobOffer.getId().getValue();
		String name = jobOffer.getName().getName();
	    String description = jobOffer.getDescription().getDescription();
	    Long available_vacans = jobOffer.getAvailable_vacans().getQuota();
	    Date date_begin = jobOffer.getDate_begin().getValue();
	    Date date_end = jobOffer.getDate_end().getValue();;
	    Float salary = jobOffer.getSalary().getPrice();

		return new JobOfferDTO(id, name, description, available_vacans, date_begin, date_end,
				 status, gender, salary, min_age, max_age, employer,
				 location);
	}

	public List<JobOfferDTO> toDTO(List<JobOffer> jobOffers) {
		List<JobOfferDTO> dto = new ArrayList<JobOfferDTO>();
		for (int i = 0; i < jobOffers.size(); i++) {
			dto.add(toDTO(jobOffers.get(i)));
        }
		return dto;
	}

}
