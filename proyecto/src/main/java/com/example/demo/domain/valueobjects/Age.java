package com.example.demo.domain.valueObjects;


public class Age {
	
	public Age(Integer age) {
		super();
		this.age = age;
	}

	public Integer getValue() {
		return age;
	}

	private Integer age;

}
