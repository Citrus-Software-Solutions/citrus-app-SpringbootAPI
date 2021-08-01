package com.citrus.api.application.queries;

import com.citrus.api.domain.valueObjects.Employee_Id;

public class JobApplicationByEmployeeQuery {
	
	public JobApplicationByEmployeeQuery(Employee_Id employee) {
		super();
		this.employee = employee;
	}

	public Employee_Id getEmployee() {
		return employee;
	}

	Employee_Id employee;

}
