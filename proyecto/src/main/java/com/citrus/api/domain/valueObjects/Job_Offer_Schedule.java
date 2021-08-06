package com.citrus.api.domain.valueObjects;

import java.util.Date;

public class Job_Offer_Schedule {
	
	public Job_Offer_Schedule(Date value) {
		super();
		this.value = value;
	}

	Date value;
	public Date getValue() {
		return value;
	} 

}
