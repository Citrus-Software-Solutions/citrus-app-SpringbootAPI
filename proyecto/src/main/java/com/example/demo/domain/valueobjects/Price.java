package com.example.demo.domain.valueObjects;

public class Price {
	
	private Float price;
	
	private String moneda = "usd";

	public Price(Float salary) {
		super();
		this.price = salary;
	}


	public Float getPrice() {
		return price;
	}


	public String getMoneda() {
		return moneda;
	}



}
