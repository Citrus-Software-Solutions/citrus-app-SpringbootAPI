package com.citrus.api.domain;

import com.citrus.api.domain.valueObjects.Interview_Id;
import com.citrus.api.domain.valueObjects.Question_Id;
import com.citrus.api.domain.valueObjects.Review_Id;
import com.citrus.api.domain.valueObjects.Review_Question;
import com.citrus.api.domain.valueObjects.Review_Score;

public class Question {
	Review_Id reviewId;

	public Review_Id getReviewId() {
		return reviewId;
	}

	public void setReviewId(Review_Id reviewId) {
		this.reviewId = reviewId;
	}

	public void setId(Question_Id id) {
		this.id = id;
	}

	Question_Id id;
	
	Review_Question question;
	
	Review_Score score;

	public Question(Review_Question name, Review_Score score, Question_Id id, Review_Id reviewId ) {
		super();
		this.score=score;
		this.question=name;
		this.id = id;
		this.reviewId= reviewId;
	}

	public Review_Question getQuestion() {
		return question;
	}

	public void setQuestion(Review_Question question) {
		this.question = question;
	}

	public Review_Score getScore() {
		return score;
	}

	public Question_Id getId() {
		return id;
	}

	public void setScore(Review_Score score) {
		this.score = score;
	}
	

}
