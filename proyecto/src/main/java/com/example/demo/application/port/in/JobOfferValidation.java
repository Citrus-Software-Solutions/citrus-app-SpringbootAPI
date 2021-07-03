package com.example.demo.application.port.in;

import java.time.LocalDate;

import com.example.demo.infraestructure.api.DTO.JobOfferDTO;

public class JobOfferValidation {
	
	private JobOfferDTO JobOfferDto;
	
	public JobOfferValidation(JobOfferDTO JobOfferDto) {
		this.JobOfferDto = JobOfferDto;
	}
	
	public boolean AgeGood() {
		return JobOfferDto.getMin_age() < JobOfferDto.getMax_age();
	}
	
	public boolean GoodDate() {
		
		if (JobOfferDto.getDate_begin().before(JobOfferDto.getDate_end()))
			return true;
		else return false;
	}
	
	public boolean IsPublished() {
		return JobOfferDto.getStatus() == "Published";
	}
	
/*	public boolean GoodDatePublished() {
		if((JobOfferDto.getStatus() == "Published") && ((LocalDate.now().isBefore(JobOfferDto.getDate_begin()).toDate()))))
	}*/

}
