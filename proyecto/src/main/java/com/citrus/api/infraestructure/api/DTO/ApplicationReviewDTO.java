package com.citrus.api.infraestructure.api.DTO;

import java.util.Date;

public class ApplicationReviewDTO {
	Integer id;
	Date Application_Date;
	public ApplicationReviewDTO(Integer id2, Date date) {
		this.id=id2;
		this.Application_Date=date;
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
	
	

}
