package com.example.demo.infraestructure.api.DTO;

public class EmployerDTO {
	
	public EmployerDTO (Long id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	
	public EmployerDTO () {
		super();
	}
	
	public Long id;
    public String name;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
