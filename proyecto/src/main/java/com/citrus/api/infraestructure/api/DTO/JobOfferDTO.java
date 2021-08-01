package com.citrus.api.infraestructure.api.DTO;

import java.util.Date;



public class JobOfferDTO {
	
	Integer id;
	String title;
	EmployerDTO employer;
	Date deadline;
	String[] sprecialRequirements;
	Float duration;
	Float hourlyRate;
	EmployeeDTO employee;
	Integer status;
	AddressDTO location;
	Date[] schedules;
	SkillDTO[] skills;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public EmployerDTO getEmployer() {
		return employer;
	}
	public void setEmployer(EmployerDTO employer) {
		this.employer = employer;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public String[] getSprecialRequirements() {
		return sprecialRequirements;
	}
	public void setSprecialRequirements(String[] sprecialRequirements) {
		this.sprecialRequirements = sprecialRequirements;
	}
	public Float getDuration() {
		return duration;
	}
	public void setDuration(Float duration) {
		this.duration = duration;
	}
	public Float getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(Float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public EmployeeDTO getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeDTO employee) {
		this.employee = employee;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public AddressDTO getLocation() {
		return location;
	}
	public void setLocation(AddressDTO location) {
		this.location = location;
	}
	public Date[] getSchedules() {
		return schedules;
	}
	public void setSchedules(Date[] schedules) {
		this.schedules = schedules;
	}
	public SkillDTO[] getSkills() {
		return skills;
	}
	public void setSkills(SkillDTO[] skills) {
		this.skills = skills;
	}
	
	


}
