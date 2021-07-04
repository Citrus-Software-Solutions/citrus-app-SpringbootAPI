package com.example.demo.application.validator;

import java.time.LocalDate;
import java.time.ZoneId;

import com.example.demo.application.Ivalidator.IJobOfferValidator;
import com.example.demo.domain.JobOffer;

public class JobOfferValidation implements IJobOfferValidator{
	
	private JobOffer Joboffer;
	
	public JobOfferValidation(JobOffer Joboffer) {
		this.Joboffer = Joboffer;
	}
	
	public boolean AgeGood() {
		if (Joboffer.getMin_age().getValue() < Joboffer.getMax_age().getValue()) {
			return true;
		}
		return false;
	}
	
	public boolean GoodDate() {
		
		if (Joboffer.getDate_begin().getValue().before(Joboffer.getDate_end().getValue()))
			return true;
		else return false;
	}
	
	public boolean IsPublished() {
		return Joboffer.getStatus().getValue() == "Published";
	}
	
		
	
	 public boolean GoodDatePublished() {
		if((Joboffer.getStatus().getValue() == "Published") && ((LocalDate.now().isBefore(Joboffer.getDate_begin().getValue().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())))){
			return true;
		}
		return false;
	 }
	 
	 
	public boolean IsAvailableVacans() {
		if( Joboffer.getAvailable_vacans().getQuota() > 0 && Joboffer.getAvailable_vacans().getQuota() != null)
			return true;
		else return false;
	}
}
