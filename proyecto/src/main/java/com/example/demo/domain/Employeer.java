package com.example.demo.domain;

import com.example.demo.domain.valueobjects.User_Id;
import com.example.demo.domain.valueobjects.User_Status;
import com.example.demo.domain.valueobjects.Username;
import com.example.demo.domain.valueobjects.Document;
import com.example.demo.domain.valueobjects.Email;
import com.example.demo.domain.valueobjects.Employer_Name;
import com.example.demo.domain.valueobjects.Password;


public class Employeer extends User {

	public Employeer(User_Id id, Document document, Username name, Password password, Email email, User_Status status,
			Location location) {
		super();
		// TODO Auto-generated constructor stub
	}
	User_Id id;
	Employer_Name name;
	
	
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

