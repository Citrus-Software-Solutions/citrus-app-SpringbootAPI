package com.example.demo.domain;

import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Interview_AccessURL;
import com.example.demo.domain.valueObjects.Interview_Duration;
import com.example.demo.domain.valueObjects.Interview_Id;
import com.example.demo.domain.valueObjects.Interview_Status;

public class Interview {
	
	public Interview_Id getId() {
		return id;
	}
	public void setId(Interview_Id id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public StaffMember getStaffMember() {
		return staffMember;
	}
	public void setStaffMember(StaffMember staffMember) {
		this.staffMember = staffMember;
	}
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public Date_Format getStartDate() {
		return startDate;
	}
	public void setStartDate(Date_Format startDate) {
		this.startDate = startDate;
	}
	public Interview_Duration getDuration() {
		return duration;
	}
	public void setDuration(Interview_Duration duration) {
		this.duration = duration;
	}
	public Interview_AccessURL getAccessURL() {
		return accessURL;
	}
	public void setAccessURL(Interview_AccessURL accessURL) {
		this.accessURL = accessURL;
	}
	public Interview_Status getStatus() {
		return status;
	}
	public void setStatus(Interview_Status status) {
		this.status = status;
	}
	Interview_Id id;
	Employee employee;
	StaffMember staffMember;
	Application application;
	Date_Format startDate;
	Interview_Duration duration;
	Interview_AccessURL accessURL;
	Interview_Status status;

}
