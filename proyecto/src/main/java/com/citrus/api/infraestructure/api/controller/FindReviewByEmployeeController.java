package com.citrus.api.infraestructure.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.queries.ReviewByEmployerQuery;
import com.citrus.api.application.queries.ReviewByIdQuery;
import com.citrus.api.application.service.ReviewByEmployerFinder;
import com.citrus.api.application.service.ReviewByIdFinder;
import com.citrus.api.domain.valueObjects.Employer_Id;
import com.citrus.api.domain.valueObjects.Review_Id;
import com.citrus.api.infraestructure.api.DTO.ReviewDTO;
import com.citrus.api.infraestructure.api.mapper.ReviewMapperDTO;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterReview;

@RestController
@RequestMapping("/review")

public class FindReviewByEmployeeController {

	final PersistanceAdapterReview repo;
	
	public FindReviewByEmployeeController(PersistanceAdapterReview repo) {
		this.repo = repo;
	}
	
	@Autowired
	ReviewMapperDTO mapperDTO;
	
	@RequestMapping(value="/employer/{id}", method=RequestMethod.GET)
    public List<ReviewDTO> findReviewById(@PathVariable("id") Integer id){
		ReviewByEmployerFinder handler = new ReviewByEmployerFinder(repo);
		return(mapperDTO.toDTO(handler.findReviewByEmployer(new ReviewByEmployerQuery(new Employer_Id(id)))));
 }
	
}
