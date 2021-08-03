package com.citrus.application.events;

import java.util.List;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;

import com.citrus.api.application.commands.CreateInterviewCommand;
import com.citrus.api.application.commands.CreateReviewCommand;
import com.citrus.api.domain.Application;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.Employer;
import com.citrus.api.domain.Question;
import com.citrus.api.domain.valueObjects.Review_Total_Score;

public class ReviewHandler {
	
	@AggregateIdentifier
	private String id;
	
	List<Question> questions;
	Review_Total_Score totalScore;
	Employee employee;
	Employer employer;
	Application application;
	
	public ReviewHandler() {}
	
	@CommandHandler
	public ReviewHandler(CreateReviewCommand createReviewCommand) {
		AggregateLifecycle.apply(new ReviewCreatedEvent(createReviewCommand.id,
														createReviewCommand.employeeId,
														createReviewCommand.staffMemberId,
														createReviewCommand.applicationId,
														createReviewCommand.startDate,
														createReviewCommand.duration,
														createReviewCommand.accessURL,
														createReviewCommand.status));
	}
	
	@EventSourcingHandler
	protected void on(ReviewCreatedEvent reviewCreatedEvent) {
		this.id = reviewCreatedEvent.id;  //este?
		this.id = "Created";              //o este????
		this.questions = reviewCreatedEvent.questions;
		this.totalScore = reviewCreatedEvent.totalScore;
		this.employee = reviewCreatedEvent.employee;
		this.employer = reviewCreatedEvent.employer;
		this.application = reviewCreatedEvent.application;
		
	}

}
	

