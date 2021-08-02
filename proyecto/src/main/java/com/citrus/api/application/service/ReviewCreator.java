package com.citrus.api.application.service;

import com.citrus.api.application.commands.CreateReviewCommand;
import com.citrus.api.application.providers.ReviewRepo;
import com.citrus.api.domain.Question;
import com.citrus.api.domain.Review;
import com.citrus.api.domain.valueObjects.Review_Total_Score;

public class ReviewCreator {

	final ReviewRepo repo;
	
	public ReviewCreator (ReviewRepo repo) {
		this.repo = repo;
	}
	
	public void createReview(CreateReviewCommand command) {
		
		Question[] question = command.getQuestions();
		
		int score = 0;
		for (int i = 0; i < question.length; i++) {
			score = score + question[i].getScore().getValue();
        }
		
		Review review = new Review
				(
						command.getId(),
						command.getQuestions(),
						new Review_Total_Score(score),
						command.getEmployee(),
						command.getEmployer(),
						command.getApplication()
				);
		repo.saveReview(review);
	}
	
	
}
