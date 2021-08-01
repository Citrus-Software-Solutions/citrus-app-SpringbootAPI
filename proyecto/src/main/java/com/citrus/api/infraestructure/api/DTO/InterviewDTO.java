package com.citrus.api.infraestructure.api.DTO;

import java.util.Date;

public class InterviewDTO {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EmployeeDTO getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeDTO employee) {
		this.employee = employee;
	}
	public ApplicationDTO getApplication() {
		return application;
	}
	public void setApplication(ApplicationDTO application) {
		this.application = application;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getAccessURL() {
		return accessURL;
	}
	public void setAccessURL(String accessURL) {
		this.accessURL = accessURL;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	int id;
	EmployeeDTO employee;
	StaffMemberDTO staffMember;
	ApplicationDTO application;
	Date startDate;
	int duration;
	String accessURL;
	int status;


}
