package com.example.demo.infraestructure.api.DTO;

import java.util.Date;

import com.example.demo.domain.Employer;
import com.example.demo.domain.Location;



public class JobOfferDTO {
	
	
	public JobOfferDTO(Long id, String name, String description, Long available_vacans, Date date_begin, Date date_end,
			String status, String gender, Float salary, Integer min_age, Integer max_age, EmployerDTO employer,
			LocationDTO location) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.available_vacans = available_vacans;
		this.date_begin = date_begin;
		this.date_end = date_end;
		this.status = status;
		this.gender = gender;
		this.salary = salary;
		this.min_age = min_age;
		this.max_age = max_age;
		this.employer = employer;
		this.location = location;
	}
	
	public JobOfferDTO() {
		super();
	}

	Long id;
    String name;
    String description;
    Long available_vacans;
    Date date_begin;
    Date date_end;
    String status;
    String gender;
    Float salary;
    Integer min_age;
    Integer max_age;
    EmployerDTO employer;
    LocationDTO location;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getAvailable_vacans() {
		return available_vacans;
	}
	public void setAvailable_vacans(Long available_vacans) {
		this.available_vacans = available_vacans;
	}
	public Date getDate_begin() {
		return date_begin;
	}
	public void setDate_begin(Date date_begin) {
		this.date_begin = date_begin;
	}
	public Date getDate_end() {
		return date_end;
	}
	public void setDate_end(Date date_end) {
		this.date_end = date_end;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public Integer getMin_age() {
		return min_age;
	}
	public void setMin_age(Integer min_age) {
		this.min_age = min_age;
	}
	public Integer getMax_age() {
		return max_age;
	}
	public void setMax_age(Integer max_age) {
		this.max_age = max_age;
	}
	public EmployerDTO getEmployer() {
		return employer;
	}
	public void setEmployer(EmployerDTO employer) {
		this.employer = employer;
	}
	public LocationDTO getLocation() {
		return location;
	}
	public void setLocation(LocationDTO location) {
		this.location = location;
	}
	

}
