package com.citrus.api.infraestructure.api.DTO;

import java.util.Date;

public class ApplicationInterviewDTO {
	
	Integer id;
	Date Application_Date;
	JobOfferDTO JobOffer;
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
	public JobOfferDTO getJob_Offer() {
		return JobOffer;
	}
	public void setJob_Offer(JobOfferDTO job_Offer) {
		JobOffer = job_Offer;
	}

	public ApplicationInterviewDTO(Integer id2, Date date, JobOfferDTO jobOffer2) {
		super();
		this.id = id2;
		this.Application_Date=date;
		this.JobOffer=jobOffer2;
	}
	

}
