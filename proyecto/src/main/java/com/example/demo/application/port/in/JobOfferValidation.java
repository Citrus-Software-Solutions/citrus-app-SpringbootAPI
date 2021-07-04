package com.example.demo.application.port.in;

import java.time.LocalDate;
import java.time.ZoneId;

import com.example.demo.infraestructure.api.DTO.JobOfferDTO;

public class JobOfferValidation {
	
	private JobOfferDTO Jobofferdto;
	
	public JobOfferValidation(JobOfferDTO Jobofferdto) {
		this.Jobofferdto = Jobofferdto;
	}
	
	public boolean AgeGood() {
		return Jobofferdto.getMin_age() < Jobofferdto.getMax_age();
	}
	
	public boolean GoodDate() {
		
		if (Jobofferdto.getDate_begin().before(Jobofferdto.getDate_end()))
			return true;
		else return false;
	}
	
	public boolean IsPublished() {
		return Jobofferdto.getStatus() == "Published";
	}
	
		
	
	 public boolean GoodDatePublished() {
		if((Jobofferdto.getStatus() == "Published") && ((LocalDate.now().isBefore(Jobofferdto.getDate_begin().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())))){
			return true;
		}
		return false;
	 }
	 
	 
	public boolean IsAvailableVacans() {
		if( Jobofferdto.getAvailable_vacans() > 0 && Jobofferdto.getAvailable_vacans() != null)
			return true;
		else return false;
	}
}
