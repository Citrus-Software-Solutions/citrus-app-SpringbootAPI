package com.citrus.api.infraestructure.database.JPAClasses;

import java.util.List;

import com.citrus.api.infraestructure.api.DTO.QuestionDTO;

public class ReviewRB {
	
	Integer totalscore;
	
	Integer employeeId;
	
	Integer employerId;
	
	Integer applicationId;
	
	List<QuestionJPA> questions;
	
	Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTotalscore() {
		return totalscore;
	}

	public void setTotalscore(Integer totalscore) {
		this.totalscore = totalscore;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getEmployerId() {
		return employerId;
	}

	public void setEmployerId(Integer employerId) {
		this.employerId = employerId;
	}

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public List<QuestionJPA> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionJPA> questions) {
		this.questions = questions;
	}

}
