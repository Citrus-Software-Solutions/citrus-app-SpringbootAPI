package com.example.demo.domain.valueObjects;

public class Application_Date {
	
	public Application_Date(String string) {
		this.value=string;
	}

	String value;

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
