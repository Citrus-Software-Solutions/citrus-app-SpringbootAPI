package com.citrus.api.infraestructure.database.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citrus.api.application.commands.CreateReviewCommand;
import com.citrus.api.application.queries.JobApplicationByIdQuery;
import com.citrus.api.application.service.JobApplicationByIdFinder;
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
import com.citrus.api.infraestructure.database.JPAClasses.ApplicationJPA;
import com.citrus.api.infraestructure.database.JPAClasses.QuestionJPA;
import com.citrus.api.infraestructure.database.JPAClasses.ReviewJPA;
import com.citrus.api.infraestructure.database.JPAClasses.ReviewRB;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterJobApplication;
import com.citrus.api.infraestructure.database.repository.JobApplicationRepository;
import com.citrus.api.infraestructure.database.repository.QuestionRepository;
import com.citrus.api.infraestructure.database.repository.ReviewRepository;

@Service
public class ReviewMapperJPA {
	QuestionMapperJPA questionMapper = new QuestionMapperJPA();
	ApplicationMapperJPA applicationMapper = new ApplicationMapperJPA();
	
	@Autowired 
	ReviewRepository reviewRepo;
	
	@Autowired 
	JobApplicationRepository applicationRepo;
	
	@Autowired 
	QuestionRepository questionRepo;
	
	public Review toDomain(ReviewJPA jpa) {
		List<QuestionJPA> questionjpa = questionRepo.findByReviewId(jpa.getId());
		ApplicationJPA applijpa = applicationRepo.findById(jpa.getJobApplicationId()).orElseThrow(EntityNotFoundException::new);
		List<Question> questions = questionMapper.toDomain(questionjpa);

		
		Review review = new Review(
				new Review_Id(jpa.getId()),
				questions,
				new Review_Total_Score(jpa.getTotalscore()),
				new Employee(new Employee_Id(jpa.getEmployeeId())),
				new Employer(new Employer_Id(jpa.getEmployerId())),
				applicationMapper.toDomain(applijpa)
				
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

	public CreateReviewCommand toCommand(ReviewRB review) {
		CreateReviewCommand comand = new CreateReviewCommand(
				new Review_Id(review.getId()),
				questionMapper.toDomain(review.getQuestions()),
				new Review_Total_Score (review.getTotalscore()),
				new Employee(new Employee_Id(review.getEmployeeId())),
				new Employer(new Employer_Id(review.getEmployerId())),
				new Application(new Application_Id(review.getApplicationId()))
				);
		return comand;
	}

}
