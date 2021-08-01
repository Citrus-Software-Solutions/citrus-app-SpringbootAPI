package com.citrus.api.application.commands;

import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.api.domain.valueObjects.Date_Format;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.domain.valueObjects.Interview_AccessURL;
import com.citrus.api.domain.valueObjects.Interview_Duration;
import com.citrus.api.domain.valueObjects.Interview_Id;
import com.citrus.api.domain.valueObjects.Interview_Status;
import com.citrus.api.domain.valueObjects.StaffMember_Id;

public class CreateInterviewCommand {

	
	
	public CreateInterviewCommand(Interview_Id id, Employee_Id employeeId, StaffMember_Id staffMemberId,
			Application_Id applicationId, Date_Format startDate, Interview_Duration duration,
			Interview_AccessURL accessURL, Interview_Status status) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.staffMemberId = staffMemberId;
		this.applicationId = applicationId;
		this.startDate = startDate;
		this.duration = duration;
		this.accessURL = accessURL;
		this.status = status;
	}
	public Interview_Id getId() {
		return id;
	}
	public Employee_Id getEmployeeId() {
		return employeeId;
	}
	public StaffMember_Id getStaffMemberId() {
		return staffMemberId;
	}
	public Application_Id getApplicationId() {
		return applicationId;
	}
	public Date_Format getStartDate() {
		return startDate;
	}
	public Interview_Duration getDuration() {
		return duration;
	}
	public Interview_AccessURL getAccessURL() {
		return accessURL;
	}
	public Interview_Status getStatus() {
		return status;
	}
	Interview_Id id;
	Employee_Id employeeId;
	StaffMember_Id staffMemberId;
	Application_Id applicationId;
	Date_Format startDate;
	Interview_Duration duration;
	Interview_AccessURL accessURL;
	Interview_Status status;
	
}
