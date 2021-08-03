package com.citrus.api.application.queries;

import com.citrus.api.domain.valueObjects.Review_Id;

public class ReviewByIdQuery {
	
	public ReviewByIdQuery(Review_Id id) {
		super();
		this.id = id;
	}

	public Review_Id getId() {
		return id;
	}

	Review_Id id;

}
