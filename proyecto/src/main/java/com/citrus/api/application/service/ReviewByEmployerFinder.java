package com.citrus.api.application.service;

import java.util.List;

import com.citrus.api.application.providers.ReviewRepo;
import com.citrus.api.application.queries.ReviewByEmployerQuery;
import com.citrus.api.domain.Review;

public class ReviewByEmployerFinder {
	
final ReviewRepo repo;
	
	public ReviewByEmployerFinder (ReviewRepo repo) {
		this.repo = repo;
	}
	
	public List<Review> findReviewByEmployer(ReviewByEmployerQuery query){
		return repo.findReview(query.getId());
	}

}
