package com.citrus.api.infraestructure.api.DTO;
import java.util.Date;

public class EmployeeDTO {
	
	Integer id;
	String firstName;
	String middleName;
	String LastName;
	String phoneNumber;
	Date dateOfBirth;
	String ssn;
	Integer educationLevel;
	Float rating;
	Integer status;
	AddressDTO address;
	WorkExperienceDTO[] workExperience;
	SkillDTO[] skills;
	ReferenceDTO[] references;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	
	
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	public WorkExperienceDTO[] getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(WorkExperienceDTO[] workExperience) {
		this.workExperience = workExperience;
	}
	public SkillDTO[] getSkills() {
		return skills;
	}
	public void setSkills(SkillDTO[] skills) {
		this.skills = skills;
	}
	public ReferenceDTO[] getReferences() {
		return references;
	}
	public void setReferences(ReferenceDTO[] references) {
		this.references = references;
	}

	
	

}
