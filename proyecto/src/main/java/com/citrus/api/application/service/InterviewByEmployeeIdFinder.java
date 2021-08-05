package com.citrus.api.application.service;

import java.util.List;

import com.citrus.api.application.providers.InterviewRepo;
import com.citrus.api.application.queries.InterviewByIdEmployeeQuery;
import com.citrus.api.domain.Interview;

public class InterviewByEmployeeIdFinder {
	
	public InterviewByEmployeeIdFinder (InterviewRepo repo) {
		this.repo=repo;
	}
	
	final InterviewRepo repo;
	
	public List<Interview>  findInterviewByEmployee(InterviewByIdEmployeeQuery query){
		return repo.findInterview(query.getId());
		
		
	}
	

}
