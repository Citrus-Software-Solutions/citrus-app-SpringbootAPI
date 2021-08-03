package com.citrus.api.application.service;

import com.citrus.api.application.providers.InterviewRepo;
import com.citrus.api.application.queries.InterviewByIdQuery;
import com.citrus.api.domain.Interview;

public class InterviewByIdFinder {
	
final InterviewRepo repo;
	
	public InterviewByIdFinder (InterviewRepo repo) {
		this.repo = repo;
	}
	
	public Interview findInterviewById(InterviewByIdQuery query) {
		
		return repo.findInterview(query.getId());
		
	}

}
