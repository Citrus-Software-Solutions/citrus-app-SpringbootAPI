package com.citrus.api.domain;

import com.citrus.api.domain.valueObjects.Application_Date;
import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.api.domain.valueObjects.Application_Status;

public class Application {

	public Application(Application_Id id, Application_Status status, Application_Date date, Employee employee,
			JobOffer joboffer) {
		super();
		this.date = date;
		this.employee = employee;
		this.id = id;
		this.jobOffer = joboffer;
		this.status = status;
	}

	public Application(Application_Id id) {
		this.id = id;
	}

	public Application() {
		super();
	}

	Application_Id id;
	Application_Date date;
	Employee employee;
	JobOffer jobOffer;
	Application_Status status;

	public Application_Id getId() {
		return id;
	}

	public void setId(Application_Id id) {
		this.id = id;
	}

	public Application_Date getDate() {
		return date;
	}

	public void setDate(Application_Date date) {
		this.date = date;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public JobOffer getJobOffer() {
		return jobOffer;
	}

	public void setJobOffer(JobOffer jobOffer) {
		this.jobOffer = jobOffer;
	}

	public Application_Status getStatus() {
		return status;
	}

	public void setStatus(Application_Status status) {
		this.status = status;
	}

}