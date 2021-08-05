package com.citrus.api.application.service;

import com.citrus.api.application.commands.UpdateStatusApplicationCommand;
import com.citrus.api.application.providers.JobApplicationRepo;
import com.citrus.api.domain.Application;

public class JobApplicationApprover {
	
	final JobApplicationRepo repo;
	
	public JobApplicationApprover(JobApplicationRepo repo) {
		this.repo=repo;
		
	}
	
	public void ApproveApplication(UpdateStatusApplicationCommand command) {
		Application application = repo.findJobApplication(command.getId());
		application.setStatus(command.getStatus());
		repo.saveJobApplication(application);
		
	}

}
