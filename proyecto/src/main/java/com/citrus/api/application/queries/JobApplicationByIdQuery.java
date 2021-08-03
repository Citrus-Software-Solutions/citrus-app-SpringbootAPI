package com.citrus.api.application.queries;

import com.citrus.api.domain.valueObjects.Application_Id;

public class JobApplicationByIdQuery {
	
	public JobApplicationByIdQuery(Application_Id id) {
		super();
		this.id = id;
	}

	public Application_Id getId() {
		return id;
	}

	Application_Id id;

}
