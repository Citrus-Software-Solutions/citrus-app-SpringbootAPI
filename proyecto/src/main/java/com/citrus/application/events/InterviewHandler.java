package com.citrus.application.events;

import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import com.citrus.api.domain.Application;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.StaffMember;
import com.citrus.api.domain.valueObjects.Date_Format;
import com.citrus.api.domain.valueObjects.Interview_AccessURL;
import com.citrus.api.domain.valueObjects.Interview_Duration;
import com.citrus.api.domain.valueObjects.Interview_Status;

@Aggregate
public class InterviewHandler {

	@AggregateIdentifier
	private String id;
	
	private Employee employee;
	private StaffMember staffMember;
	private Application application;
	private Date_Format startDate;
	private Interview_Duration duration;
	private Interview_AccessURL accessURL;
	private Interview_Status status;
	
	public InterviewHandler() {}
	
	//atCommandHandler
	//public InterviewHandler() aqui iria el comando de ser necesario
	
	@EventSourcingHandler
	protected void on(InterviewCreatedEvent interviewCreatedEvent) {
		this.status = String.valueOf(interviewCreatedEvent.status);  //esto es un value object
	}
}
