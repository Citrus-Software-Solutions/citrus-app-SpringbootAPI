package com.citrus.api.application.service;

import java.util.List;

import com.citrus.api.application.providers.JobApplicationRepo;
import com.citrus.api.application.queries.JobApplicationByEmployeeQuery;
import com.citrus.api.domain.Application;

public class JobApplicationByEmployeeFinder {
	
	public JobApplicationByEmployeeFinder(JobApplicationRepo repo) {
		this.repo = repo;
	}
	
	final JobApplicationRepo repo;
	
	
	public List<Application> findApplicationByEmployee(JobApplicationByEmployeeQuery query){
		return repo.findJobApplication(query.getEmployee());
	}
	
	
}
