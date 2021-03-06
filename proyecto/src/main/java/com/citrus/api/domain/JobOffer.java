package com.citrus.api.domain;

import com.citrus.api.domain.valueObjects.Date_Format;
import com.citrus.api.domain.valueObjects.Job_Offer_Duration;
import com.citrus.api.domain.valueObjects.Job_Offer_Hourly_Rate;
import com.citrus.api.domain.valueObjects.Job_Offer_Id;
import com.citrus.api.domain.valueObjects.Job_Offer_Schedule;
import com.citrus.api.domain.valueObjects.Job_Offer_Status;
import com.citrus.api.domain.valueObjects.Job_Offer_Title;
import com.citrus.api.domain.valueObjects.Special_Requirements;

public class JobOffer {
	public JobOffer(Job_Offer_Id id, Job_Offer_Title title, Employer employer, Address location, Date_Format deadline,
			Job_Offer_Schedule schedules, Skill[] skills, Special_Requirements sprecialRequirements,
			Job_Offer_Duration duration, Job_Offer_Hourly_Rate hourlyRate, Employee employee, Job_Offer_Status status) {
		super();
		this.id = id;
		this.title = title;
		this.employer = employer;
		this.location = location;
		this.deadline = deadline;
		this.schedules = schedules;
		this.skills = skills;
		this.sprecialRequirements = sprecialRequirements;
		this.duration = duration;
		this.hourlyRate = hourlyRate;
		this.employee = employee;
		this.status = status;
	}
	Job_Offer_Id id;
	Job_Offer_Title title;
	Employer employer;
	Address location;
	Date_Format deadline;
	Job_Offer_Schedule schedules;
	Skill[] skills;
	Special_Requirements sprecialRequirements;
	Job_Offer_Duration duration;
	Job_Offer_Hourly_Rate hourlyRate;
	Employee employee;
	Job_Offer_Status status;
	
	public JobOffer(Job_Offer_Id jobOfferId) {
		this.id = jobOfferId;
	}
	public JobOffer() {
		super();
	}
	public Job_Offer_Id getId() {
		return id;
	}
	public void setId(Job_Offer_Id id) {
		this.id = id;
	}
	public Job_Offer_Title getTitle() {
		return title;
	}
	public void setTitle(Job_Offer_Title title) {
		this.title = title;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	public Address getLocation() {
		return location;
	}
	public void setLocation(Address location) {
		this.location = location;
	}
	public Date_Format getDeadline() {
		return deadline;
	}
	public void setDeadline(Date_Format deadline) {
		this.deadline = deadline;
	}
	public 	Job_Offer_Schedule getSchedules() {
		return schedules;
	}
	public void setSchedules(Job_Offer_Schedule schedules) {
		this.schedules = schedules;
	}
	public Skill[] getSkills() {
		return skills;
	}
	public void setSkills(Skill[] skills) {
		this.skills = skills;
	}
	public Special_Requirements getSprecialRequirements() {
		return sprecialRequirements;
	}
	public void setSprecialRequirements(Special_Requirements sprecialRequirements) {
		this.sprecialRequirements = sprecialRequirements;
	}
	public Job_Offer_Duration getDuration() {
		return duration;
	}
	public void setDuration(Job_Offer_Duration duration) {
		this.duration = duration;
	}
	public Job_Offer_Hourly_Rate getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(Job_Offer_Hourly_Rate hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Job_Offer_Status getStatus() {
		return status;
	}
	public void setStatus(Job_Offer_Status status) {
		this.status = status;
	}
	
	
}
