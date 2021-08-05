package com.citrus.api.application.service;

import com.citrus.api.application.commands.CreateInterviewCommand;
import com.citrus.api.application.providers.InterviewRepo;
import com.citrus.api.domain.Application;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.Interview;
import com.citrus.api.domain.StaffMember;
import com.citrus.api.infraestructure.database.JPAClasses.InterviewJPA;


public class InterviewCreator {
	
final InterviewRepo repo;
	
	public InterviewCreator (InterviewRepo repo) {
		this.repo = repo;
	}
	
	public InterviewJPA createInterview(CreateInterviewCommand command) {
		
		Interview interview = new Interview
				(command.getId(),
						new Employee(command.getEmployeeId()),
						new StaffMember(command.getStaffMemberId()),   
						new Application(command.getApplicationId()),
						command.getStartDate(),
						command.getDuration(),
						command.getAccessURL(),
						command.getStatus()
				);
		return repo.saveInterview(interview);	
	}

}
