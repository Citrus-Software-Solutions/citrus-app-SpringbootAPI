package com.example.demo.RabbitMQ.Dto;

import java.util.List;

import com.example.demo.infraestructure.api.DTO.LocationDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Prueba3 {
	
	private String pattern;
	private LocationDTO data;

    public Prueba3() {}    
    public Prueba3 (String pattern, LocationDTO data) {
    	super();
    	this.pattern = pattern;
    	this.data = data;
    }
	
	
	public LocationDTO getData() {
		return data;
	}

	public void setData(LocationDTO data) {
		this.data = data;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

}
