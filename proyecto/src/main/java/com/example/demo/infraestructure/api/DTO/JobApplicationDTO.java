package com.example.demo.infraestructure.api.DTO;

import java.util.Date;

public class JobApplicationDTO {
	
	public JobApplicationDTO (long id, String status, Date date
			, EmployeeDTO employee, JobOfferDTO job) {
		super();
		this.id=id;
		this.status=status;
		this.date=date;
		this.employee=employee;
		this.joboffer=job;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public EmployeeDTO getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeDTO employee) {
		this.employee = employee;
	}

	public JobOfferDTO getJoboffer() {
		return joboffer;
	}

	public void setJoboffer(JobOfferDTO joboffer) {
		this.joboffer = joboffer;
	}

	public JobApplicationDTO() {
		super();
	}
	
	long id; // global identity
	
	String status;
	
	Date date;
	
	EmployeeDTO employee;
	
	JobOfferDTO joboffer;
}
