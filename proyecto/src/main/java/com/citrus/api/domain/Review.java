package com.citrus.api.domain;

import com.citrus.api.domain.valueObjects.Review_Question;
import com.citrus.api.domain.valueObjects.Review_Score;
import com.citrus.api.domain.valueObjects.Review_Total_Score;

public class Review {
	
	Question[] questions;
	Review_Total_Score totalScore;
	Employee employee;
	Employer employer;
	Application application;
	public Question[] getQuestions() {
		return questions;
	}
	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}
	public Review_Total_Score getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(Review_Total_Score totalScore) {
		this.totalScore = totalScore;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	
	

}
