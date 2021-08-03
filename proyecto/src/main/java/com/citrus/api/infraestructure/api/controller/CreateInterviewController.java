package com.citrus.api.infraestructure.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.service.InterviewCreator;

import com.citrus.api.infraestructure.database.JPAClasses.InterviewJPA;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterInterview;
import com.citrus.api.infraestructure.database.mapper.InterviewMapperJPA;

@RestController
@RequestMapping("/interview")
public class CreateInterviewController {
	
	
	final PersistanceAdapterInterview repo;
	
	public CreateInterviewController(PersistanceAdapterInterview repo) {
	super();
	this.repo = repo;
	}
	
	@Autowired
	InterviewMapperJPA mapperJPA;

	
	@RequestMapping(value="", method=RequestMethod.POST)
	public void newInterview(@RequestBody InterviewJPA interview) {
		InterviewCreator handler = new InterviewCreator(repo);
		handler.createInterview(mapperJPA.toCommand(interview));
	}
	


}