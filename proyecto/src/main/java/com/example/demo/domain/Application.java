package com.example.demo.domain;

import com.example.demo.domain.valueObjects.*;

public class Application {

	private Aplication_Id id; // global identity
	
	private Aplication_Status status;
	
	private Date_Format date;
	
	private Employee employee;
	
	private JobOffer joboffer;
	
	public Application( Aplication_Id id, Aplication_Status status, Date_Format date,
		 Employee employee, JobOffer job) {
		super();
		this.id = id;
		this.status =status;
		this.date = date;
		this.employee= employee;
		this.joboffer = job;
		
	}
	
	public Application () {
		super();
	}

	public Aplication_Id getId() {
		return id;
	}

	public void setId(Aplication_Id id) {
		this.id = id;
	}

	public Aplication_Status getStatus() {
		return status;
	}

	public void setStatus(Aplication_Status status) {
		this.status = status;
	}

	public Date_Format getDate() {
		return date;
	}

	public void setDate(Date_Format date) {
		this.date = date;
	}


	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public JobOffer getJoboffer() {
		return joboffer;
	}

	public void setJoboffer(JobOffer joboffer) {
		this.joboffer = joboffer;
	}
	



}