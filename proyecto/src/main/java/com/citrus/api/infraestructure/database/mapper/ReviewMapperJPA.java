package com.citrus.api.infraestructure.database.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.citrus.api.domain.Employee;
import com.citrus.api.domain.Employer;
import com.citrus.api.domain.Review;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.domain.valueObjects.Review_Total_Score;
import com.citrus.api.infraestructure.database.JPAClasses.QuestionJPA;
import com.citrus.api.infraestructure.database.JPAClasses.ReviewJPA;
import com.citrus.api.infraestructure.database.repository.QuestionRepository;
import com.citrus.api.infraestructure.database.repository.ReviewRepository;

public class ReviewMapperJPA {
	QuestionMapperJPA questionMapper = new QuestionMapperJPA();
	
	@Autowired 
	ReviewRepository reviewRepo;
	
	@Autowired 
	QuestionRepository questionRepo;
	
	/*public Review toDomain(ReviewJPA review) {
		List<QuestionJPA> questionjpa = questionRepo.findByApplicationId(review.getJobApplicationId());
		
		Review_Total_Score totalScore = new Review_Total_Score(review.getTotalscore());
		Employee_Id empID = new Employee_Id(review.getEmployeeId());
		Employee employee = new Employee(empID);
		
		Employee_Id emprID = new Employee_Id(review.getEmployerId());
		Employer employer = new Employer(emprID);
		
		
		
	}*/

}
