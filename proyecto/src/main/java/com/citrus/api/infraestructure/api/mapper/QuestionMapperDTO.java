package com.citrus.api.infraestructure.api.mapper;

import com.citrus.api.domain.Question;
import com.citrus.api.infraestructure.api.DTO.QuestionDTO;

public class QuestionMapperDTO {
	
	public QuestionDTO toDTO(Question question) {
		QuestionDTO questiondto = new QuestionDTO();
		questiondto.setName((question.getQuestion()== null)? null:question.getQuestion().getValue());
		questiondto.setScore((question.getScore()== null)? null:question.getScore().getValue());
		return questiondto;
	}
	
	public QuestionDTO[] toDTO(Question[] question) {
		QuestionDTO[] dtos = null;
		for (int i = 0; i < question.length; i++) {
			dtos[i]=toDTO(question[i]);
        }
		
		return dtos;
		
	}

}
