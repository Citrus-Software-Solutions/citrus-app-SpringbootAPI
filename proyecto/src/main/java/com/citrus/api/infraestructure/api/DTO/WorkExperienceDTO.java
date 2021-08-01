package com.citrus.api.infraestructure.api.DTO;

public class WorkExperienceDTO {
	
	String jobTitle;
	String companyName;
	Integer category;
	
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}
}
