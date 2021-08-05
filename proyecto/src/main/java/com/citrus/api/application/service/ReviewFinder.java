package com.citrus.api.application.service;

import java.util.List;

import com.citrus.api.application.providers.InterviewRepo;
import com.citrus.api.application.providers.ReviewRepo;
import com.citrus.api.domain.Interview;
import com.citrus.api.domain.Review;

public class ReviewFinder {
	final ReviewRepo repo;
	
	public ReviewFinder (ReviewRepo repo) {
		this.repo = repo;
	}
	
	public List<Review> findAllReviews() {
		return repo.findReview();
		
	}

	

}
