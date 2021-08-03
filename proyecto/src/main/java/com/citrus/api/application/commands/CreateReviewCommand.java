package com.citrus.api.application.commands;


import java.util.List;

import com.citrus.api.domain.Application;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.Employer;
import com.citrus.api.domain.Question;
import com.citrus.api.domain.valueObjects.Review_Id;
import com.citrus.api.domain.valueObjects.Review_Total_Score;

public class CreateReviewCommand {
	
	public CreateReviewCommand(Review_Id id, List <Question> questions, Review_Total_Score totalScore, Employee employee,
			Employer employer, Application application) {
		super();
		this.id = id;
		this.questions = questions;
		this.totalScore = totalScore;
		this.employee = employee;
		this.employer = employer;
		this.application = application;
	}
	public Review_Id getId() {
		return id;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public Review_Total_Score getTotalScore() {
		return totalScore;
	}
	public Employee getEmployee() {
		return employee;
	}
	public Employer getEmployer() {
		return employer;
	}
	public Application getApplication() {
		return application;
	}
	Review_Id id;
	List<Question> questions;
	Review_Total_Score totalScore;
	Employee employee;
	Employer employer;
	Application application;

}
