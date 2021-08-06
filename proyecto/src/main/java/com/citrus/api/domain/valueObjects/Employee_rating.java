package com.citrus.api.domain.valueObjects;

import java.math.BigDecimal;

public class Employee_rating {
	
	public Employee_rating(Float value) {
		super();
		this.value = value;
	}

	Float value;

	public Float getValue() {
		
		return value;
	}

}
