package com.example.demo.domain.valueObjects;


public class Application_Status {
	
	public Application_Status(Integer status) {
		this.value = status;
	}

	Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	

}
