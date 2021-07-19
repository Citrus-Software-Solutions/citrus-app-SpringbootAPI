package com.example.demo.infraestructure.api.DTO;

public class ApplicationDTO {
	Integer id;
	String Application_Date;
	EmployeeDTO employee;
	JobOfferDTO jobOffer;
	Integer status;
	
	public ApplicationDTO(Integer id, String Date,
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

	public String getApplication_Date() {
		return Application_Date;
	}

	public void setApplication_Date(String application_Date) {
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
