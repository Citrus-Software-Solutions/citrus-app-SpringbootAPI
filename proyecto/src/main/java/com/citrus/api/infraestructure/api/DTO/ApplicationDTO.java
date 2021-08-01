package com.citrus.api.infraestructure.api.DTO;

import java.util.Date;

public class ApplicationDTO {
	Integer id;
	Date Application_Date;
	EmployeeDTO employee;
	JobOfferDTO jobOffer;
	Integer status;
	
	public ApplicationDTO(Integer id, Date Date,
			EmployeeDTO employee, JobOfferDTO joboffer,
			Integer status) {
		super();
		this.id = id;
		this.Application_Date=Date;
		this.employee=employee;
		this.jobOffer=joboffer;
		this.status=status;	
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getApplication_Date() {
		return Application_Date;
	}

	public void setApplication_Date(Date application_Date) {
		Application_Date = application_Date;
	}

	public EmployeeDTO getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeDTO employee) {
		this.employee = employee;
	}

	public JobOfferDTO getJobOffer() {
		return jobOffer;
	}

	public void setJobOffer(JobOfferDTO jobOffer) {
		this.jobOffer = jobOffer;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	

}
