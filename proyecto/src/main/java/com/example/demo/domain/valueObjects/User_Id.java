package com.example.demo.domain.valueObjects;

public class User_Id {

	private Long value;

	public User_Id(long id) {
		super();
		this.value=id;
	}


	public Long getValue() {
		return value;
	}


	public void setValue(Long value) {
		this.value = value;
	}

}
