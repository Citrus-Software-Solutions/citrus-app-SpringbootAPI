package com.citrus.api.infraestructure.api.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.citrus.api.domain.Question;
import com.citrus.api.domain.Review;
import com.citrus.api.infraestructure.api.DTO.QuestionDTO;

@Service
public class QuestionMapperDTO {
	
	public QuestionDTO toDTO(Question question) {
		QuestionDTO questiondto = new QuestionDTO();
		questiondto.setName((question.getQuestion()== null)? null:question.getQuestion().getValue());
		questiondto.setScore((question.getScore()== null)? null:question.getScore().getValue());
		return questiondto;
	}
	
	public List<QuestionDTO> toDTO(List<Question> question) {
		List<QuestionDTO> dtos = new ArrayList<QuestionDTO>();
		
		for (int i = 0; i < question.size(); i++) {
			dtos.add(toDTO(question.get(i)));
        }
		
		return dtos;
		
	}


}
