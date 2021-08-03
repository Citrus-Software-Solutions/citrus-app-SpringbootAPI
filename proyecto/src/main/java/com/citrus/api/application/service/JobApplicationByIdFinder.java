package com.citrus.api.application.service;

import com.citrus.api.application.providers.JobApplicationRepo;
import com.citrus.api.application.queries.JobApplicationByIdQuery;
import com.citrus.api.domain.Application;

public class JobApplicationByIdFinder {
	
	public JobApplicationByIdFinder(JobApplicationRepo repo) {
		this.repo = repo;
	}
	
	final JobApplicationRepo repo;
	
	public Application findApplicationById(JobApplicationByIdQuery query) {
		return repo.findJobApplication(query.getId());
	}

}
