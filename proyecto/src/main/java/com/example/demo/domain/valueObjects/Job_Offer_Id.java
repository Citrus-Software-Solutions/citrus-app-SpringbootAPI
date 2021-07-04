package com.example.demo.domain.valueObjects;

public class Job_Offer_Id {

	private Long value;
	
	public Job_Offer_Id(long id) {
		this.value = id;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}
}
