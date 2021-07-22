package com.example.demo.infraestructure.api.DTO;

import java.awt.Image;

public class EmployerDTO {
	
	String companyName;
	AddressDTO address;
	ContactInformationDTO[] contactInformation;
	String logo;
	SkillDTO[] skills;
	String[] specialRequirements;
	Integer status;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	public ContactInformationDTO[] getContactInformation() {
		return contactInformation;
	}
	public void setContactInformation(ContactInformationDTO[] contactInformation) {
		this.contactInformation = contactInformation;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public SkillDTO[] getSkills() {
		return skills;
	}
	public void setSkills(SkillDTO[] skills) {
		this.skills = skills;
	}
	public String[] getSpecialRequirements() {
		return specialRequirements;
	}
	public void setSpecialRequirements(String[] specialRequirements) {
		this.specialRequirements = specialRequirements;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	

}
