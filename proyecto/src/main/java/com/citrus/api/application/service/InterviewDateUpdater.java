package com.citrus.api.application.service;

import com.citrus.api.application.commands.UpdateDateInterviewCommand;
import com.citrus.api.application.providers.InterviewRepo;
import com.citrus.api.domain.Interview;

public class InterviewDateUpdater {
	
final InterviewRepo repo;
	
	public InterviewDateUpdater (InterviewRepo repo) {
		this.repo = repo;
	}
	
	public void updateDateInterview(UpdateDateInterviewCommand command) {
		Interview interview = repo.findInterview(command.getId());
		interview.setStartDate(command.getStartDate());
		repo.saveInterview(interview);
		
	}
}
