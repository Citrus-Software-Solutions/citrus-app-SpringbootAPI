package com.citrus.api.application.Ivalidator;

import com.citrus.api.domain.Application;

public interface IApplicationValidator {
	
	public boolean JobApplicationIsOk(Application application);
}