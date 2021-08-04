package com.citrus.domain.Application;

import com.citrus.api.domain.Application;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.JobOffer;
import com.citrus.api.domain.valueObjects.Application_Date;
import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.api.domain.valueObjects.Application_Status;
import com.citrus.domain.Employee.EmployeeMother;
import com.citrus.domain.JobOffer.JobOfferMother;

public class ApplicationMother {

	public static Application create(Application_Id id, Application_Status status, Application_Date date, Employee employee,
			JobOffer joboffer) {
		return new Application(id, status, date, employee, joboffer);
	}
	
	public static Application create() {
		return create(ApplicationIdMother.random(), ApplicationStatusMother.random(), ApplicationDateMother.random(), EmployeeMother.create(), JobOfferMother.create());
	}
}
