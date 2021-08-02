package com.citrus.api.infraestructure.api.DTO;

import java.util.List;

public class ReviewDTO {
	
    List<QuestionDTO> questions;
	Integer totalScore;
	EmployeeDTO employee;
	EmployerDTO employer;
	ApplicationReviewDTO application;
	public List<QuestionDTO> getQuestions() {
		return questions;
	}
	public void setQuestions(List<QuestionDTO> questions) {
		this.questions = questions;
	}
	public Integer getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}
	public EmployeeDTO getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeDTO employee) {
		this.employee = employee;
	}
	public EmployerDTO getEmployer() {
		return employer;
	}
	public void setEmployer(EmployerDTO employer) {
		this.employer = employer;
	}
	public ApplicationReviewDTO getApplication() {
		return application;
	}
	public void setApplication(ApplicationReviewDTO application) {
		this.application = application;
	}

	
	

}
