package com.citrus.api.infraestructure.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.citrus.api.application.service.ReviewFinder;
import com.citrus.api.infraestructure.api.DTO.ReviewDTO;
import com.citrus.api.infraestructure.api.mapper.ReviewMapperDTO;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterReview;

@RestController
@RequestMapping("/review")
public class FindAllReviewController {
	
	final PersistanceAdapterReview repo;

	public FindAllReviewController(PersistanceAdapterReview repo) {
		super();
		this.repo = repo;
	}

	@Autowired
	ReviewMapperDTO mapperDTO;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<ReviewDTO> findAllJobApplications() {
		ReviewFinder handler = new ReviewFinder(repo);
		return (mapperDTO.toDTO(handler.findAllReviews()));

	}

}
