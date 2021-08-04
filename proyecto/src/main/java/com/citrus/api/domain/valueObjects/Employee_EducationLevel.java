package com.citrus.api.domain.valueObjects;

public class Employee_EducationLevel {
	
	public void setValue(Integer value) {
		this.value = value;
	}

	Integer value;

	public Integer getValue() {
		return this.value;
	}
	
	public Employee_EducationLevel(int value) {
		this.value = value;
	}

}
