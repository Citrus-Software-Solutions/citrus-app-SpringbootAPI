package com.example.demo.domain;

import com.example.demo.domain.valueObjects.*;

public class Employee {

	private User_Id id;
	
	private Employee_Name name;
	
	private Gender gender;
	
	private Date_Format birthdate;
	
	public Employee(User_Id id,Employee_Name ename,Gender gender,Date_Format birthdate) {
		super();
		this.birthdate=birthdate;
		this.gender=gender;
		this.name=ename;
		this.id= id;
	}

	public User_Id getId() {
		return id;
	}

	public void setId(User_Id id) {
		this.id = id;
	}

	public Employee_Name getName() {
		return name;
	}

	public void setName(Employee_Name name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date_Format getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date_Format birthdate) {
		this.birthdate = birthdate;
	}
	
	

}
