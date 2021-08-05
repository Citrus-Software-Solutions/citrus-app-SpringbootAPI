package com.citrus.api.application.service;

import java.util.ArrayList;
import java.util.List;

import com.citrus.api.application.commands.CreateReviewCommand;
import com.citrus.api.application.providers.ReviewRepo;
import com.citrus.api.domain.Question;
import com.citrus.api.domain.Review;
import com.citrus.api.domain.valueObjects.Review_Total_Score;
import com.citrus.api.infraestructure.database.JPAClasses.ReviewJPA;

public class ReviewCreator {

	final ReviewRepo repo;
	
	public ReviewCreator (ReviewRepo repo) {
		this.repo = repo;
	}
	
	public ReviewJPA createReview(CreateReviewCommand command) {
		
		List<Question> question = command.getQuestions();
		int score = 0;
		for (int i = 0; i < question.size(); i++) {
			score = score + question.get(i).getScore().getValue();
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
		
		return repo.saveReview(review);
	}
	
	
}
