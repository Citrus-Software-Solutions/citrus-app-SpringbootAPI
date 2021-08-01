package com.citrus.api.application.service;

import java.util.List;

import com.citrus.api.application.providers.JobApplicationRepo;
import com.citrus.api.domain.Application;

public class JobApplicationFinder {
	
	public JobApplicationFinder(JobApplicationRepo repo) {
		this.repo = repo;
	}
	
	final JobApplicationRepo repo;
	
	public List<Application> findAllApplications(){
		return repo.findJobApplication();
	}

}
