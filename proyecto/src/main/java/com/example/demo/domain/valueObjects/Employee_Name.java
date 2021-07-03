package com.example.demo.domain.valueObjects;

public class Employee_Name {
	
	private String name;
	
	private String secondname;
	
	private String lastname;
	
	private String secondLastname;
	
	public Employee_Name(String name, String secondn, String lastname, String slastname) {
		super();
		this.name=name;
		this.lastname=lastname;
		this.secondLastname=slastname;
		this.secondname=secondn;
	}

	public String getName() {
		return name;
	}


	public String getSecondname() {
		return secondname;
	}

	public String getLastname() {
		return lastname;
	}


	public String getSecondLastname() {
		return secondLastname;
	}
	

	

}
