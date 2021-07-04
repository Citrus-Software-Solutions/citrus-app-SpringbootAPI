package com.example.demo.application.port.in;

import com.example.demo.domain.Application;


public class JobApplicationValidation {

	private JobOfferValidation jobOfferValidator = new JobOfferValidation();
	

	public boolean JobApplicationIsOk(Application jobApplication) {
		return (jobOfferValidator.isAplicable(jobApplication.getJoboffer()));
	}
}
