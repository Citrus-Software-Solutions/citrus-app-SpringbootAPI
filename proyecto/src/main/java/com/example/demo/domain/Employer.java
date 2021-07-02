package com.example.demo.domain;

import com.example.demo.domain.valueObjects.Employer_Name;
import com.example.demo.domain.valueObjects.User_Id;

public class Employer {

	
	User_Id id;
	Employer_Name name;
	
	
	public Employer(User_Id id, Employer_Name name) {
		super();
		this.id=id;
		this.name = name;
	}
	public Employer() {
		super();
	}
	public User_Id getId() {
		return id;
	}
	public void setId(User_Id id) {
		this.id = id;
	}
	public Employer_Name getName() {
		return name;
	}
	public void setName(Employer_Name name) {
		this.name = name;
	}
	
	
	
}

