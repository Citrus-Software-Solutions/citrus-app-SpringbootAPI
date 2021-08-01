package com.citrus.api.application.service;

import java.util.List;

import com.citrus.api.application.providers.InterviewRepo;
import com.citrus.api.domain.Interview;

public class InterviewFinder {
final InterviewRepo repo;
	
	public InterviewFinder (InterviewRepo repo) {
		this.repo = repo;
	}
	
	public List<Interview> findAllInterviews() {
		
		return repo.findInterview();
		
	}

}
