package com.citrus.api.infraestructure.database.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citrus.api.domain.Application;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.Employer;
import com.citrus.api.domain.Interview;
import com.citrus.api.domain.Question;
import com.citrus.api.domain.Review;
import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.domain.valueObjects.Employer_Id;
import com.citrus.api.domain.valueObjects.Review_Id;
import com.citrus.api.domain.valueObjects.Review_Total_Score;
import com.citrus.api.infraestructure.database.JPAClasses.QuestionJPA;
import com.citrus.api.infraestructure.database.JPAClasses.ReviewJPA;
import com.citrus.api.infraestructure.database.repository.QuestionRepository;
import com.citrus.api.infraestructure.database.repository.ReviewRepository;

@Service
public class ReviewMapperJPA {
	QuestionMapperJPA questionMapper = new QuestionMapperJPA();
	
	@Autowired 
	ReviewRepository reviewRepo;
	
	@Autowired 
	QuestionRepository questionRepo;
	
	public Review toDomain(ReviewJPA jpa) {
		
		List<QuestionJPA> questionjpa = questionRepo.findByReviewId(jpa.getId());
		
		List<Question> questions = questionMapper.toDomain(questionjpa);
		
		
		
		Review review = new Review(
				new Review_Id(jpa.getId()),
				questions,
				new Review_Total_Score(jpa.getTotalscore()),
				new Employee(new Employee_Id(jpa.getEmployeeId())),
				new Employer(new Employer_Id(jpa.getEmployerId())),
				new Application (new Application_Id(jpa.getJobApplicationId()))
				);
		
		
		return review;
	
		
	}
	
	public ReviewMapperJPA(QuestionMapperJPA questionMapper, ReviewRepository reviewRepo,
			QuestionRepository questionRepo) {
		super();
		this.questionMapper = questionMapper;
		this.reviewRepo = reviewRepo;
		this.questionRepo = questionRepo;
	}
	
	public ReviewMapperJPA() {
		super();
	}


	public List<Review> toDomain(List<ReviewJPA> jpas){
		
		List<Review> Reviews = new ArrayList<Review>();
		for (int i = 0; i < jpas.size(); i++) {
			Reviews.add(toDomain(jpas.get(i)));
        }
		
		return Reviews;
	}
	
	public ReviewJPA toJPA(Review domain) {
		
		ReviewJPA jpa = new ReviewJPA(
				domain.getId().getValue(),
				domain.getTotalScore().getValue(),
				domain.getEmployee().getId().getValue(),
				domain.getEmployer().getId().getValue(),
				domain.getApplication().getId().getValue()
				);
		return jpa;
		
	}

}
