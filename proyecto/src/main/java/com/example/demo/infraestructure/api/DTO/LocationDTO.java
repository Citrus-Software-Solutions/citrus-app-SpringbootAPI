package com.example.demo.infraestructure.api.DTO;

public class LocationDTO {
	
	public LocationDTO(long id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		
	}
	
	public LocationDTO() {
		super();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long id;
	public String name;
	public String type;

}
