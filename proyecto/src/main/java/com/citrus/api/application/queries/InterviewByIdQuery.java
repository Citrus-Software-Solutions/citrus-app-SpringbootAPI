package com.citrus.api.application.queries;

import com.citrus.api.domain.valueObjects.Interview_Id;

public class InterviewByIdQuery {
	
	public InterviewByIdQuery(Interview_Id id) {
		super();
		this.id = id;
	}

	public Interview_Id getId() {
		return id;
	}

	Interview_Id id;
	
}
