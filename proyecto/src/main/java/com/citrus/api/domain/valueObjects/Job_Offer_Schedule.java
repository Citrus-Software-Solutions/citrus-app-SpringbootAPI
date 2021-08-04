package com.citrus.api.domain.valueObjects;

import java.util.Date;

public class Job_Offer_Schedule {
	
	Date[] value;

	public Date[] getValue() {
		return value;
	} 

	public Job_Offer_Schedule(Date[] value) {
		this.value = value;
	}
}
