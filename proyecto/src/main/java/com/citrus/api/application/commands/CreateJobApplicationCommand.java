package com.citrus.api.application.commands;

import com.citrus.api.domain.valueObjects.Application_Date;
import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.api.domain.valueObjects.Application_Status;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.domain.valueObjects.Job_Offer_Id;

public class CreateJobApplicationCommand {
	
	public CreateJobApplicationCommand(Application_Id id, Application_Date date, Employee_Id employeeId, Job_Offer_Id jobOfferId,
			Application_Status status) {
		super();
		this.id = id;
		this.date = date;
		this.employeeId = employeeId;
		this.jobOfferId = jobOfferId;
		this.status = status;
	}
	public Application_Id getId() {
		return id;
	}
	public Application_Date getDate() {
		return date;
	}
	public Employee_Id getEmployeeId() {
		return employeeId;
	}
	public Job_Offer_Id getJobOfferId() {
		return jobOfferId;
	}
	public Application_Status getStatus() {
		return status;
	}
	Application_Id id;
	Application_Date date;
	Employee_Id employeeId;
	Job_Offer_Id jobOfferId;
	Application_Status status;

}
