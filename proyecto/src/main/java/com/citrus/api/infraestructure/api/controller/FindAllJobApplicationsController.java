package com.citrus.api.infraestructure.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.service.JobApplicationFinder;
import com.citrus.api.infraestructure.api.DTO.ApplicationDTO;
import com.citrus.api.infraestructure.api.mapper.JobApplicationMapperDTO;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterJobApplication;

@RestController
@RequestMapping("/job-application")
public class FindAllJobApplicationsController {
	
	final PersistanceAdapterJobApplication repo;

	public FindAllJobApplicationsController(PersistanceAdapterJobApplication repo) {
		super();
		this.repo = repo;
	}
	
	@Autowired
	JobApplicationMapperDTO mapperDTO;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<ApplicationDTO> findAllJobApplications() {
		JobApplicationFinder handler = new JobApplicationFinder(repo);
		return (mapperDTO.toDTO(handler.findAllApplications()));

	}


}
