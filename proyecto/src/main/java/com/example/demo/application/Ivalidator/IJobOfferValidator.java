package com.example.demo.application.Ivalidator;

import com.example.demo.domain.JobOffer;

public interface IJobOfferValidator {
	
	public boolean agesAreOk(JobOffer jobOffer);
	
	public boolean dateIsOk(JobOffer jobOffer);
	
	public boolean isPublished(JobOffer jobOffer);
	
	public boolean jobOfferIsOk(JobOffer jobOffer);
	
	 public boolean isNotExpired(JobOffer jobOffer);
	
	public boolean haveAvailableVacans(JobOffer jobOffer);
	
	public boolean isAplicable(JobOffer jobOffer);
}

