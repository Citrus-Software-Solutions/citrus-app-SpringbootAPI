package com.example.demo.domain;

import com.example.demo.domain.valueObjects.StaffMember_Id;
import com.example.demo.domain.valueObjects.Staff_Member_Name;
import com.example.demo.domain.valueObjects.Staff_Member_Title;

public class StaffMember {
	
	public StaffMember_Id getId() {
		return id;
	}
	
	public Staff_Member_Name getFirstName() {
		return firstName;
	}
	public void setFirstName(Staff_Member_Name firstName) {
		this.firstName = firstName;
	}
	public Staff_Member_Name getMiddleName() {
		return middleName;
	}
	public void setMiddleName(Staff_Member_Name middleName) {
		this.middleName = middleName;
	}
	public Staff_Member_Name getLastName() {
		return LastName;
	}
	public void setLastName(Staff_Member_Name lastName) {
		LastName = lastName;
	}
	public Staff_Member_Title getTitle() {
		return title;
	}
	public void setTitle(Staff_Member_Title title) {
		this.title = title;
	}
	StaffMember_Id id;
	Staff_Member_Name firstName;
	Staff_Member_Name middleName;
	Staff_Member_Name LastName;
	Staff_Member_Title title;
	
}
