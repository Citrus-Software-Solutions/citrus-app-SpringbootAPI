package com.citrus.api.domain;

import com.citrus.api.domain.valueObjects.*;

public class Employee {
	
	Employee_Id id;
	Employee_Name firstName;
	Employee_Name middleName;
	Employee_Name LastName;
	Phone_Number phoneNumber;
	Date_Format dateOfBirth;
	Employee_SSN ssn;
	Address address;
	Employee_EducationLevel educationLevel;
	WorkExperience[] workExperience;
	Skill[] skills;
	Reference[] references;
	Employee_rating rating;
	Employee_Status status;
	
	

	
	public Employee(Employee_Id id, Employee_Name firstName, Employee_Name middleName, Employee_Name lastName,
			Phone_Number phoneNumber, Date_Format dateOfBirth, Employee_SSN ssn, Address address,
			Employee_EducationLevel educationLevel, WorkExperience[] workExperience, Skill[] skills,
			Reference[] references, Employee_rating rating, Employee_Status status) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		LastName = lastName;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.ssn = ssn;
		this.address = address;
		this.educationLevel = educationLevel;
		this.workExperience = workExperience;
		this.skills = skills;
		this.references = references;
		this.rating = rating;
		this.status = status;
	}
	public Employee(Employee_Id id) {
		super();
		this.id = id;
	}
	public Employee() {
		super();
	}
	public Employee_Id getId() {
		return id;
	}
	public void setId(Employee_Id id) {
		this.id = id;
	}
	public Employee_Name getFirstName() {
		return firstName;
	}
	public void setFirstName(Employee_Name firstName) {
		this.firstName = firstName;
	}
	public Employee_Name getMiddleName() {
		return middleName;
	}
	public void setMiddleName(Employee_Name middleName) {
		this.middleName = middleName;
	}
	public Employee_Name getLastName() {
		return LastName;
	}
	public void setLastName(Employee_Name lastName) {
		LastName = lastName;
	}
	public Phone_Number getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Phone_Number phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date_Format getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date_Format dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Employee_SSN getSsn() {
		return ssn;
	}
	public void setSsn(Employee_SSN ssn) {
		this.ssn = ssn;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee_EducationLevel getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(Employee_EducationLevel educationLevel) {
		this.educationLevel = educationLevel;
	}
	public WorkExperience[] getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(WorkExperience[] workExperience) {
		this.workExperience = workExperience;
	}
	public Skill[] getSkills() {
		return skills;
	}
	public void setSkills(Skill[] skills) {
		this.skills = skills;
	}
	public Reference[] getReferences() {
		return references;
	}
	public void setReferences(Reference[] references) {
		this.references = references;
	}
	public Employee_rating getRating() {
		return rating;
	}
	public void setRating(Employee_rating rating) {
		this.rating = rating;
	}
	public Employee_Status getStatus() {
		return status;
	}
	public void setStatus(Employee_Status status) {
		this.status = status;
	}
	
	
	

}
