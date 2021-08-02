package com.citrus.api.application.service;

import com.citrus.api.application.commands.CreateReviewCommand;
import com.citrus.api.application.providers.ReviewRepo;
import com.citrus.api.domain.Review;

public class ReviewCreator {

	final ReviewRepo repo;
	
	public ReviewCreator (ReviewRepo repo) {
		this.repo = repo;
	}
	
	public void createReview(CreateReviewCommand command) {
		Review review = new Review
				(
						command.getId(),
						command.getQuestions(),
						command.getTotalScore(),
						command.getEmployee(),
						command.getEmployer(),
						command.getApplication()
				);
		repo.saveReview(review);
	}
	
	
}
