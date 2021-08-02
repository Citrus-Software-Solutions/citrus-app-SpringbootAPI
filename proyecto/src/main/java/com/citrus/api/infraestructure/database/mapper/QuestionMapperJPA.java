package com.citrus.api.infraestructure.database.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.citrus.api.domain.Question;
import com.citrus.api.domain.valueObjects.Question_Id;
import com.citrus.api.domain.valueObjects.Review_Question;
import com.citrus.api.domain.valueObjects.Review_Score;
import com.citrus.api.infraestructure.database.JPAClasses.QuestionJPA;

@Service
public class QuestionMapperJPA {
	
	private Question[] questions;

	public Question toDomain (QuestionJPA jpa) {
		

		return new Question(
				new Review_Question(jpa.getName()),
				new Review_Score(jpa.getScore()),
				new Question_Id(jpa.getId())
				);
	}
	
	public Question[] toDomain(List<QuestionJPA> jpas){
		for (int i = 0; i < jpas.size(); i++) {
			questions[i]=toDomain(jpas.get(i));
        }
		
		return questions;
	}
	
	public QuestionJPA toJPA(Question domain, Integer reviewId) {
		QuestionJPA jpa = new QuestionJPA(
				domain.getId().getValue(),
				domain.getQuestion().getValue(),
				domain.getScore().getValue(),
				reviewId
				);
		
		return jpa;
	}

}
