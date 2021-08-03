package com.citrus.application.events;

import java.util.List;

import com.citrus.api.domain.Application;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.Employer;
import com.citrus.api.domain.Question;
import com.citrus.api.domain.valueObjects.Review_Total_Score;

public class ReviewCreatedEvent extends Event<String>{
	List<Question> questions;
	Review_Total_Score totalScore;
	Employee employee;
	Employer employer;
	Application application;
	
	public ReviewCreatedEvent(String id, List<Question> questions, Review_Total_Score totalScore, Employee employee,
			Employer employer, Application application) {
		super(id);
		this.questions = questions;
		this.totalScore = totalScore;
		this.employee = employee;
		this.employer = employer;
		this.application = application;
	}
	
}
