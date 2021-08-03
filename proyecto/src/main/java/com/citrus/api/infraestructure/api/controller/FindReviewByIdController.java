package com.citrus.api.infraestructure.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.queries.ReviewByIdQuery;
import com.citrus.api.application.service.ReviewByIdFinder;
import com.citrus.api.domain.valueObjects.Review_Id;
import com.citrus.api.infraestructure.api.DTO.ReviewDTO;
import com.citrus.api.infraestructure.api.mapper.ReviewMapperDTO;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterReview;

@RestController
@RequestMapping("/review")

public class FindReviewByIdController {

	final PersistanceAdapterReview repo;
	
	public FindReviewByIdController(PersistanceAdapterReview repo) {
		this.repo = repo;
	}
	
	@Autowired
	ReviewMapperDTO mapperDTO;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ReviewDTO findReviewById(@PathVariable("id") Integer id){
		ReviewByIdFinder handler = new ReviewByIdFinder(repo);
		return(mapperDTO.toDTO(handler.findReviewById(new ReviewByIdQuery(new Review_Id(id)))));
 }
	
}
