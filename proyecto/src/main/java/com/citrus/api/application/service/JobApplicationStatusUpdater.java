package com.citrus.api.application.service;

import com.citrus.api.application.commands.UpdateStatusJobApplicationCommand;
import com.citrus.api.application.providers.JobApplicationRepo;
import com.citrus.api.domain.Application;

public class JobApplicationStatusUpdater {
	
	final JobApplicationRepo repo;
	
	public JobApplicationStatusUpdater(JobApplicationRepo repo) {
		this.repo = repo;
	}
	
	public void updateStatusApplication(UpdateStatusJobApplicationCommand command) {
		Application application = repo.findJobApplication(command.getId());
		application.setStatus(command.getStatus());
		repo.saveJobApplication(application);
	}

}
