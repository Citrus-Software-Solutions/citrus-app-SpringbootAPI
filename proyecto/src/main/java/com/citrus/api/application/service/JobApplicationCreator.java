package com.citrus.api.application.service;

import com.citrus.api.application.commands.CreateJobApplicationCommand;
import com.citrus.api.application.providers.JobApplicationRepo;
import com.citrus.api.domain.Application;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.JobOffer;


public class JobApplicationCreator {

	public JobApplicationCreator(JobApplicationRepo repo) {
		this.repo = repo;
	}
	
	final JobApplicationRepo repo;
	
	
	

	public void createJobApplication(CreateJobApplicationCommand command) {
		
		Application jobApplication = new Application(
				command.getId(),
				command.getStatus(),
				command.getDate(),
				new Employee (command.getEmployeeId()),
				new JobOffer(command.getJobOfferId())
				
				);
		
		repo.saveJobApplication(jobApplication);
	}

}
