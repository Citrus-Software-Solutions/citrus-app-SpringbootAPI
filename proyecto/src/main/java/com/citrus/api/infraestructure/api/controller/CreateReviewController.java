package com.citrus.api.infraestructure.api.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.service.JobApplicationCreator;
import com.citrus.api.application.service.ReviewCreator;
import com.citrus.api.infraestructure.database.JPAClasses.ApplicationJPA;
import com.citrus.api.infraestructure.database.JPAClasses.ReviewJPA;
import com.citrus.api.infraestructure.database.JPAClasses.ReviewRB;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterReview;
import com.citrus.api.infraestructure.database.mapper.ReviewMapperJPA;

@RestController
@RequestMapping("/review")
public class CreateReviewController {
	
	
	final PersistanceAdapterReview repo;
	
	
	ReviewMapperJPA mapperJPA =  new ReviewMapperJPA();
	
	public CreateReviewController(PersistanceAdapterReview repo) {
	super();
	this.repo = repo;
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public void newReview(@RequestBody ReviewRB review) {
		ReviewCreator handler = new ReviewCreator(repo);
		handler.createReview(mapperJPA.toCommand(review));
	}

}
