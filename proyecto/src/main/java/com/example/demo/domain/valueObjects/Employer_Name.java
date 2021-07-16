package com.example.demo.domain.valueObjects;

public class Employer_Name {

	private String value;

	
	public Employer_Name(String name) {
		super();
		this.value=name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
