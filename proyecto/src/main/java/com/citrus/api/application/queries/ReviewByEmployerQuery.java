package com.citrus.api.application.queries;

import com.citrus.api.domain.valueObjects.Employer_Id;

public class ReviewByEmployerQuery {
	
	public ReviewByEmployerQuery(Employer_Id id) {
		super();
		this.id = id;
	}

	public Employer_Id getId() {
		return id;
	}

	Employer_Id id;
	
	

}
