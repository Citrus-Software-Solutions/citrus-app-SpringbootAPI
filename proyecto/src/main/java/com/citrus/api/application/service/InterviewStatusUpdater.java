package com.citrus.api.application.service;

import com.citrus.api.application.commands.UpdateStatusInterviewCommand;
import com.citrus.api.application.providers.InterviewRepo;
import com.citrus.api.domain.Interview;

public class InterviewStatusUpdater {
	
final InterviewRepo repo;
	
	public  InterviewStatusUpdater (InterviewRepo repo) {
		this.repo = repo;
	}
	
	public void updateStatusInterview(UpdateStatusInterviewCommand command) {
		Interview interview = repo.findInterview(command.getId());
		interview.setStatus(command.getStatus());
		repo.saveInterview(interview);
		
	}
}
