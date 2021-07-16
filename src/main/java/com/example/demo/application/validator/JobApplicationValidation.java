package com.example.demo.application.validator;

import com.example.demo.application.Ivalidator.IApplicationValidator;
import com.example.demo.domain.Application;


public class JobApplicationValidation implements IApplicationValidator{

	private JobOfferValidation jobOfferValidator = new JobOfferValidation();
	
	public boolean JobApplicationIsOk(Application application) {
		return (jobOfferValidator.isAplicable(application.getJoboffer()));
	}
}
