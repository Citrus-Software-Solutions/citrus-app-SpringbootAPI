package com.citrus.application.events;

import java.util.Date;

import com.citrus.api.domain.Application;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.StaffMember;
import com.citrus.api.domain.valueObjects.Date_Format;
import com.citrus.api.domain.valueObjects.Interview_AccessURL;
import com.citrus.api.domain.valueObjects.Interview_Duration;
import com.citrus.api.domain.valueObjects.Interview_Id;
import com.citrus.api.domain.valueObjects.Interview_Status;

public class InterviewCreatedEvent extends Event<String>{
	
	Employee employee;
	StaffMember staffMember;
	Application application;
	Date_Format startDate;
	Interview_Duration duration;
	Interview_AccessURL accessURL;
	Interview_Status status;
	
	public InterviewCreatedEvent(String id, Interview_Id id2, Employee employee, StaffMember staffMember,
			Application application, Date_Format startDate, Interview_Duration duration, Interview_AccessURL accessURL,
			Interview_Status status) {
		super(id);
		this.employee = employee;
		this.staffMember = staffMember;
		this.application = application;
		this.startDate = startDate;
		this.duration = duration;
		this.accessURL = accessURL;
		this.status = status;
	}


}
