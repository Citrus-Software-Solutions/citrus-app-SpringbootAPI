package com.citrus.api.infraestructure.database.mapper;

import java.util.ArrayList;
import java.util.List;

import com.citrus.api.domain.Question;
import com.citrus.api.domain.valueObjects.Review_Question;
import com.citrus.api.domain.valueObjects.Review_Score;
import com.citrus.api.infraestructure.database.JPAClasses.QuestionJPA;

public class QuestionMapperJPA {
	
	private Question[] questions;

	public Question toDomain (QuestionJPA jpa) {
		Review_Question name = new Review_Question(jpa.getName());
		Review_Score score = new Review_Score(jpa.getScore());
		
		return new Question(name, score);
	}
	
	public Question[] toDomain(List<QuestionJPA> jpas){
		for (int i = 0; i < jpas.size(); i++) {
			questions[i]=toDomain(jpas.get(i));
        }
		
		return questions;
	}

}
