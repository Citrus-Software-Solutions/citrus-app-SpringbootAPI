package com.example.demo.application.port.in;

import java.time.LocalDate;
import java.time.ZoneId;

import com.example.demo.domain.JobOffer;


public class JobOfferValidation {
	
	

	public boolean agesAreOk(JobOffer jobOffer) {
		return jobOffer.getMin_age().getValue() < jobOffer.getMax_age().getValue();
	}
	
	public boolean dateIsOk(JobOffer jobOffer) {
		if (jobOffer.getDate_begin().getValue().before(jobOffer.getDate_end().getValue()))
			return true;
		else return false;
	}
	
	public boolean isPublished(JobOffer jobOffer) {
		return jobOffer.getStatus().getValue() == "Published";
	}
	
	public boolean jobOfferIsOk(JobOffer jobOffer) {
		return agesAreOk(jobOffer) && dateIsOk(jobOffer);
	}
	
	 public boolean isNotExpired(JobOffer jobOffer) {
		if( ((LocalDate.now().isBefore(jobOffer.getDate_begin().getValue().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())))){
			return true;
		}
		return false;
	 }
	
	 
	public boolean haveAvailableVacans(JobOffer jobOffer) {
		if(jobOffer.getAvailable_vacans().getQuota() != null && jobOffer.getAvailable_vacans().getQuota() > 0)
			return true;
		return false;
	}
	
	public boolean isAplicable(JobOffer jobOffer) {
		if(haveAvailableVacans(jobOffer) && isNotExpired(jobOffer))
			return true;
		return false;
	}
}
