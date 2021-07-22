package com.example.demo.domain;

import com.example.demo.domain.valueObjects.Application_Date;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.Application_Status;

public class Application {
	
	public Application(Application_Id id2, Application_Status status2, Application_Date date2, Employee employee2,
			JobOffer joboffer2) {
		super();
		this.date=date2;
		this.employee=employee2;
		this.id=id2;
		this.jobOffer=joboffer2;
		this.status=status2;
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