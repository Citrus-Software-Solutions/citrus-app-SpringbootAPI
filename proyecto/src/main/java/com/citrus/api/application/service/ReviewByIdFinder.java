package com.citrus.api.application.service;

import com.citrus.api.application.providers.ReviewRepo;
import com.citrus.api.application.queries.ReviewByIdQuery;
import com.citrus.api.domain.Review;

public class ReviewByIdFinder {
	
final ReviewRepo repo;
	
	public ReviewByIdFinder (ReviewRepo repo) {
		this.repo = repo;
	}

	
	public Review findReviewById(ReviewByIdQuery query){
		return repo.findReview(query.getId());
	}
}
