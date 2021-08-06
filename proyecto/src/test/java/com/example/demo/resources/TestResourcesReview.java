package com.example.demo.resources;

import java.util.ArrayList;
import java.util.List;

import com.citrus.api.application.commands.CreateReviewCommand;
import com.citrus.api.domain.Application;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.Employer;
import com.citrus.api.domain.Question;
import com.citrus.api.domain.Review;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.domain.valueObjects.Employer_Id;
import com.citrus.api.domain.valueObjects.Review_Id;
import com.citrus.api.domain.valueObjects.Review_Total_Score;

public class TestResourcesReview {
	
	TestResourcesApplication res = new TestResourcesApplication();
	
//////////////////////
	Review_Id id_r = new Review_Id(2);
	List<Question> qs = new ArrayList<Question>();
	Review_Total_Score totalScore_r = new Review_Total_Score(10);
	Employee employee = new Employee(new Employee_Id (1));
	Employer employer = new Employer(new Employer_Id(3));
	Application application  = res.JobApplicationCreate();
	
	public Review createReview() {
		return new Review(id_r, qs, totalScore_r, employee, employer, application);
	}
	public CreateReviewCommand createReviewCommandCreate() {
		return new CreateReviewCommand(id_r, qs, totalScore_r, employee, employer, application);
	}

}
