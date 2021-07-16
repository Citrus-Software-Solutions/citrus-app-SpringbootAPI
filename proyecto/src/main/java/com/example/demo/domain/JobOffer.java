package com.example.demo.domain;

import com.example.demo.domain.valueObjects.Age;
import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Gender;
import com.example.demo.domain.valueObjects.Job_Offer_Description;
import com.example.demo.domain.valueObjects.Job_Offer_Id;
import com.example.demo.domain.valueObjects.Job_Offer_Name;
import com.example.demo.domain.valueObjects.Job_Status;
import com.example.demo.domain.valueObjects.Price;
import com.example.demo.domain.valueObjects.Quota;

public class JobOffer {
	
	public JobOffer() {
		super();
	}
	
	public JobOffer(Job_Offer_Id id, Job_Offer_Name name, Job_Offer_Description description, Quota available_vacans,
			Date_Format date_begin, Date_Format date_end, Price salary, Job_Status status, Gender gender, Age min_age,
			Age max_age, Location location, Employer employer) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.available_vacans = available_vacans;
		this.date_begin = date_begin;
		this.date_end = date_end;
		this.salary = salary;
		this.status = status;
		this.gender = gender;
		this.min_age = min_age;
		this.max_age = max_age;
		this.location = location;
		this.employer = employer;
	}

	private Job_Offer_Id id;
	
	private Job_Offer_Name name;
	
	private Job_Offer_Description description;
	
	private Quota available_vacans;
	
	private Date_Format date_begin;
	
	private Date_Format date_end;
	
	private Price salary;
	
	private Job_Status status;
	
	private Gender gender;
	
	private Age min_age;
	
	private Age max_age;
	
	private Location location;

	private Employer employer;
	
	
	public Job_Offer_Id getId() {
		return id;
	}

	public void setId(Job_Offer_Id id) {
		this.id = id;
	}

	public Job_Offer_Name getName() {
		return name;
	}

	public void setName(Job_Offer_Name name) {
		this.name = name;
	}

	public Job_Offer_Description getDescription() {
		return description;
	}

	public void setDescription(Job_Offer_Description description) {
		this.description = description;
	}

	public Quota getAvailable_vacans() {
		return available_vacans;
	}

	public void setAvailable_vacans(Quota available_vacans) {
		this.available_vacans = available_vacans;
	}

	public Date_Format getDate_begin() {
		return date_begin;
	}

	public void setDate_begin(Date_Format date_begin) {
		this.date_begin = date_begin;
	}

	public Date_Format getDate_end() {
		return date_end;
	}

	public void setDate_end(Date_Format date_end) {
		this.date_end = date_end;
	}

	public Price getSalary() {
		return salary;
	}

	public void setSalary(Price salary) {
		this.salary = salary;
	}
	
	public Job_Status getStatus() {
		return status;
	}

	public void setStatus(Job_Status status) {
		this.status = status;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Age getMin_age() {
		return min_age;
	}

	public void setMin_age(Age min_age) {
		this.min_age = min_age;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Age getMax_age() {
		return max_age;
	}

	public void setMax_age(Age max_age) {
		this.max_age = max_age;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	
	

}
