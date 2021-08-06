package com.citrus.api.infraestructure.RabbitMQ.Dto;

import java.util.List;

import com.citrus.api.infraestructure.api.DTO.ApplicationDTO;

public class ApplicationMessage {
	
	public String patern;
	public List<ApplicationDTO> data;
	
	public ApplicationMessage() {}
	public ApplicationMessage(String patern,List<ApplicationDTO> data ) {
		super();
		this.data=data;
		this.patern=patern;
	}

}
