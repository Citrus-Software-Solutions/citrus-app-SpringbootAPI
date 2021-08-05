package com.citrus.api.infraestructure.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.service.JobApplicationCreator;
import com.citrus.api.application.service.ReviewCreator;
import com.citrus.api.infraestructure.api.DTO.ReviewDTO;
import com.citrus.api.infraestructure.api.mapper.ReviewMapperDTO;
import com.citrus.api.infraestructure.database.JPAClasses.ApplicationJPA;
import com.citrus.api.infraestructure.database.JPAClasses.ReviewJPA;
import com.citrus.api.infraestructure.database.JPAClasses.ReviewRB;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterReview;
import com.citrus.api.infraestructure.database.mapper.ReviewMapperJPA;

@RestController
@RequestMapping("/review")
public class CreateReviewController {
	
	@Autowired
	ReviewMapperDTO mapperDTO;
	
	final PersistanceAdapterReview repo;
	
	@Autowired
	ReviewMapperJPA mapperJPA;
	
	public CreateReviewController(PersistanceAdapterReview repo) {
	super();
	this.repo = repo;
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public ReviewDTO newReview(@RequestBody ReviewRB review) {
		ReviewCreator handler = new ReviewCreator(repo);
		return mapperDTO.toDTO(mapperJPA.toDomain(handler.createReview(mapperJPA.toCommand(review))));
	}

}
