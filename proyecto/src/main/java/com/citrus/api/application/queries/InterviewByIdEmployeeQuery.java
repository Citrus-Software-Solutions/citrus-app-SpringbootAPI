package com.citrus.api.application.queries;

import com.citrus.api.domain.valueObjects.Employee_Id;

public class InterviewByIdEmployeeQuery {
	
	Employee_Id id;
	
	public InterviewByIdEmployeeQuery(Employee_Id id) {
		super();
		this.id=id;
	}

	public Employee_Id getId() {
		return id;
	}

	public void setId(Employee_Id id) {
		this.id = id;
	}

}
