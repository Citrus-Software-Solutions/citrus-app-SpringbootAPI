package com.citrus.api.domain;

import com.citrus.api.domain.valueObjects.*;

public class Employer{
	Employer_Id id;
	Employer_Company_Name companyName;
	Address address;
	ContactInformation[] contacts;
	Employer_Logo logo;
	Skill[] skills;
	Special_Requirements specialRequeriments;
	Employer_Status status;
	public Employer(Employer_Id id) {
		super();
		this.id = id;
	}
	public Employer_Id getId() {
		return id;
	}
	public void setId(Employer_Id id) {
		this.id = id;
	}
	public Employer_Company_Name getCompanyName() {
		return companyName;
	}
	public void setCompanyName(Employer_Company_Name companyName) {
		this.companyName = companyName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ContactInformation[] getContacts() {
		return contacts;
	}
	public void setContacts(ContactInformation[] contacts) {
		this.contacts = contacts;
	}
	public Employer_Logo getLogo() {
		return logo;
	}
	public void setLogo(Employer_Logo logo) {
		this.logo = logo;
	}
	public Skill[] getSkills() {
		return skills;
	}
	public void setSkills(Skill[] skills) {
		this.skills = skills;
	}
	public Special_Requirements getSpecialRequeriments() {
		return specialRequeriments;
	}
	public void setSpecialRequeriments(Special_Requirements specialRequeriments) {
		this.specialRequeriments = specialRequeriments;
	}
	public Employer_Status getStatus() {
		return status;
	}
	public void setStatus(Employer_Status status) {
		this.status = status;
	}
	
	
}

