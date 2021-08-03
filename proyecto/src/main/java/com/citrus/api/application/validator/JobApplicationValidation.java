package com.citrus.api.application.validator;

import com.citrus.api.application.Ivalidator.IApplicationValidator;
import com.citrus.api.domain.Application;


public class JobApplicationValidation implements IApplicationValidator{

	/**private JobOfferValidation jobOfferValidator = new JobOfferValidation();
	**/
	public boolean JobApplicationIsOk(Application application) {
		//return (jobOfferValidator.isAplicable(application.getJoboffer()));
		return false;
	}
}
