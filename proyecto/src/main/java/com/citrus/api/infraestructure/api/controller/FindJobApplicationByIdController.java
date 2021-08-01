package com.citrus.api.infraestructure.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.queries.JobApplicationByIdQuery;
import com.citrus.api.application.service.JobApplicationByIdFinder;
import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.api.infraestructure.api.DTO.ApplicationDTO;
import com.citrus.api.infraestructure.api.mapper.JobApplicationMapperDTO;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterJobApplication;


@RestController
@RequestMapping("/job-application")
public class FindJobApplicationByIdController {
	
	final PersistanceAdapterJobApplication repo;

	public FindJobApplicationByIdController(PersistanceAdapterJobApplication repo) {
		super();
		this.repo = repo;
	}
	
	@Autowired
	JobApplicationMapperDTO mapperDTO;

	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ApplicationDTO findJobApplicationById(@PathVariable("id") Integer id){
		JobApplicationByIdFinder handler = new JobApplicationByIdFinder(repo);
		return(mapperDTO.toDTO(handler.findApplicationById(new JobApplicationByIdQuery(new Application_Id(id)))));
 }


}