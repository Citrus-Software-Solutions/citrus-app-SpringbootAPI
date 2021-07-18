package com.example.demo.infraestructure.api.DTO;
import java.util.Date;

import com.example.demo.domain.Address;
import com.example.demo.domain.Reference;
import com.example.demo.domain.Skill;
import com.example.demo.domain.WorkExperience;
import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Employee_EducationLevel;
import com.example.demo.domain.valueObjects.Employee_Name;
import com.example.demo.domain.valueObjects.Employee_SSN;
import com.example.demo.domain.valueObjects.Employee_Status;
import com.example.demo.domain.valueObjects.Employee_rating;
import com.example.demo.domain.valueObjects.Gender;
import com.example.demo.domain.valueObjects.Phone_Number;

public class EmployeeDTO {
	
	String firstName;
	String middleName;
	String LastName;
	String phoneNumber;
	Date dateOfBirth;
	String ssn;
	Integer educationLevel;
	Float rating;
	Integer status;
	//AddressJPA address;
	//WorkExperienceJPA[] workExperience;
	//SkillJPA[] skills;
	//ReferenceJPA[] references;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public Integer getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(Integer educationLevel) {
		this.educationLevel = educationLevel;
	}
	public Float getRating() {
		return rating;
	}
	public void setRating(Float rating) {
		this.rating = rating;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	/**public AddressJPA getAddress() {
		return address;
	}
	public void setAddress(AddressJPA address) {
		this.address = address;
	}
	public WorkExperienceJPA[] getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(WorkExperienceJPA[] workExperience) {
		this.workExperience = workExperience;
	}
	public SkillJPA[] getSkills() {
		return skills;
	}
	public void setSkills(SkillJPA[] skills) {
		this.skills = skills;
	}
	public ReferenceJPA[] getReferences() {
		return references;
	}
	public void setReferences(ReferenceJPA[] references) {
		this.references = references;
	}**/

	
	

}
