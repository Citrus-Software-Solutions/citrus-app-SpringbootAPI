package com.example.demo.application.validator;

import com.example.demo.application.Ivalidator.IApplicationValidator;
import com.example.demo.domain.Application;

public abstract class JobApplicationValidation implements IApplicationValidator{

	public boolean JobApplicationPendingStatus(Application application) {
		return application.getStatus().getValue() == "Pending";
	}
}
