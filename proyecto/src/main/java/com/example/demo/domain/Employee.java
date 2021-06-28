package com.example.demo.domain;

import com.example.demo.domain.valueobjects.Date_Format;
import com.example.demo.domain.valueobjects.Document;
import com.example.demo.domain.valueobjects.Email;
import com.example.demo.domain.valueobjects.Employee_Name;
import com.example.demo.domain.valueobjects.Gender;
import com.example.demo.domain.valueobjects.Password;
import com.example.demo.domain.valueobjects.User_Id;
import com.example.demo.domain.valueobjects.User_Status;
import com.example.demo.domain.valueobjects.Username;

public class Employee extends User{
	
	public Employee(User_Id id, Document document, Username name, Password password, Email email, User_Status status,
			Location location) {
		super();
		// TODO Auto-generated constructor stub
	}

	private Employee_Name name;
	
	private Gender gender;
	
	private Date_Format birthdate;
			
	//public JobOffer createOffer() {
		
		//return;
	//};
	
	//public ArrayList<JobOffer> showAllOffers() {
	
			//return;
		//} 
	
	public void publishOffer(JobOffer job) {
		
		
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
