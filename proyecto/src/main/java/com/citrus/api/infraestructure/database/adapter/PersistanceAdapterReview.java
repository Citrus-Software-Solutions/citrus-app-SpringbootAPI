package com.citrus.api.infraestructure.database.adapter;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citrus.api.application.providers.ReviewRepo;
import com.citrus.api.domain.Question;
import com.citrus.api.domain.Review;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.domain.valueObjects.Employer_Id;
import com.citrus.api.domain.valueObjects.Review_Id;
import com.citrus.api.domain.valueObjects.Review_Total_Score;
import com.citrus.api.infraestructure.database.JPAClasses.ReviewJPA;
import com.citrus.api.infraestructure.database.mapper.QuestionMapperJPA;
import com.citrus.api.infraestructure.database.mapper.ReviewMapperJPA;
import com.citrus.api.infraestructure.database.repository.QuestionRepository;
import com.citrus.api.infraestructure.database.repository.ReviewRepository;

@Service
public class PersistanceAdapterReview implements ReviewRepo{
	
	public PersistanceAdapterReview(ReviewRepository reviewRepo, QuestionRepository questionRepo) {
		this.reviewRepo = reviewRepo;
		this.questionRepo = questionRepo;
	}
	
	final ReviewRepository reviewRepo;
	final QuestionRepository questionRepo;	

	@Autowired
	ReviewMapperJPA mapper;
	
	@Autowired
	QuestionMapperJPA qMapper;
	
	@Override
	public List<Review> findReview(Employer_Id id) {
		return mapper.toDomain(reviewRepo.findByEmployerId(id.getValue()));
		
	}
	
	@Override
	public List<Review> findReview() {
		return mapper.toDomain(reviewRepo.findAll());
		
	}
	
	@Override
	public Review findReview(Review_Id id) {
		return mapper.toDomain(reviewRepo.findById(id.getValue()).orElseThrow(EntityNotFoundException::new));
	}

	@Override
	public Review saveReview(Review review) {
		
		Integer id = review.getId().getValue();
		List<Question> question = review.getQuestions();
		
		int score = 0;
		for (int i = 0; i < question.size(); i++) {
			score = score + question.get(i).getScore().getValue();
        }
		
		review.setTotalScore(new Review_Total_Score(score));
		ReviewJPA jpa = reviewRepo.save(mapper.toJPA(review));
		id= (jpa).getId();
		for (int i = 0; i < question.size(); i++) {
			questionRepo.save(qMapper.toJPA(question.get(i), id));
        }
		return mapper.toDomain(jpa);
		
	}

}
