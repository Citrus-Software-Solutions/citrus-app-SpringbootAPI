package com.example.demo.application.Ivalidator;

public interface IJobOfferValidator {

	public boolean AgeGood();
	
	public boolean GoodDate();
	
	public boolean IsPublished();
		
	public boolean GoodDatePublished();
	 
	public boolean IsAvailableVacans();
}
