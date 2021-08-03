package com.citrus.api.domain.valueObjects;

import java.util.Date;

public class Application_Date {
	
	public Application_Date(Date value) {
		this.value=value;
	}


	Date value;

	public void setValue(Date value) {
		this.value = value;
	}

	public Date getValue() {
		return value;
	}

}
