package com.citrus.api.infraestructure.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.service.JobApplicationCreator;
import com.citrus.api.infraestructure.api.DTO.ApplicationDTO;
import com.citrus.api.infraestructure.api.mapper.JobApplicationMapperDTO;
import com.citrus.api.infraestructure.database.JPAClasses.ApplicationJPA;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterJobApplication;
import com.citrus.api.infraestructure.database.mapper.ApplicationMapperJPA;

@RestController
@RequestMapping("/job-application")
public class CreateJobApplicationController {
	
	
	final PersistanceAdapterJobApplication repo;
	
	@Autowired
	JobApplicationMapperDTO mapperDTO;
	
	
	ApplicationMapperJPA mapperJPA =  new ApplicationMapperJPA();
	
	public CreateJobApplicationController(PersistanceAdapterJobApplication repo) {
	super();
	this.repo = repo;
	}


	@RequestMapping(value="", method=RequestMethod.POST)
	public ApplicationDTO newJobApplication(@RequestBody ApplicationJPA job_appliaction) {
		JobApplicationCreator handler = new JobApplicationCreator(repo);
		return mapperDTO.toDTO(handler.createJobApplication(mapperJPA.toCommand(job_appliaction)));
	}

}