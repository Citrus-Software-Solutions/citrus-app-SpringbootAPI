package com.citrus.api.infraestructure.RabbitMQ.DTO;


import com.citrus.api.infraestructure.api.DTO.ApplicationDTO;

public class Application {

	String pattern;
	ApplicationDTO aplication;
	
	public Application(String pattern, ApplicationDTO aplication) {
		super();
		this.pattern = pattern;
		this.aplication = aplication;
	}


	public String getPattern() {
		return pattern;
	}


	public void setPattern(String pattern) {
		this.pattern = "Hola";
	}


	public ApplicationDTO getAplication() {
		return aplication;
	}


	public void setAplication(ApplicationDTO aplication) {
		this.aplication = aplication;
	}

}
