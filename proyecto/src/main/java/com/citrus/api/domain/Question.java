package com.citrus.api.domain;

import com.citrus.api.domain.valueObjects.Review_Question;
import com.citrus.api.domain.valueObjects.Review_Score;

public class Question {
	
	Review_Question question;
	
	Review_Score score;

	public Question(Review_Question name, Review_Score score2) {
		super();
		this.score=score2;
		this.question=name;
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

	public void setScore(Review_Score score) {
		this.score = score;
	}
	

}
