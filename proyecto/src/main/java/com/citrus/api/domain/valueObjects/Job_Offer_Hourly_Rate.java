package com.citrus.api.domain.valueObjects;

import java.math.BigDecimal;

public class Job_Offer_Hourly_Rate {
	
	public Job_Offer_Hourly_Rate(Float value) {
		super();
		this.value = value;
	}

	Float value;

	public Float getValue() {
		return value;
	}

}
