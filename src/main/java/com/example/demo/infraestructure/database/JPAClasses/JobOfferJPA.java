package com.example.demo.infraestructure.database.JPAClasses;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "job_offer")
public class JobOfferJPA {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long id;

    @NotEmpty
    @Column private String name;

    @NotEmpty
    @Size(min = 10, message = "The description should have atleast 10 characters.")
    @Column private String description;

    @NotEmpty
    @NotNull
    @Column private Long available_vacans;

    @NotEmpty
    @NotNull
    @Column private Date date_begin;

    @NotEmpty
    @NotNull
    @Column private Date date_end;

    @NotEmpty
    @NotNull
    @Column private String status;

    
    @Column private String gender;
    @NotEmpty
    @NotNull
    @Column private Float salary;
    @Column private Integer min_age;
    @Column private Integer max_age;
    
    @NotEmpty
    @Column private Long employerId;
    @NotEmpty
    @Column private Long location_id;

    public JobOfferJPA() {
    	super();
    }
    
    public JobOfferJPA(String name, String description, Long available_vacans, Date date_begin, Date date_end, String status, String gender, Float salary, Integer min_age, Integer max_age, Long employerId, Long location_id) {
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
        this.employerId = employerId;
        this.location_id = location_id;
    }
    
    public JobOfferJPA(Long id, String name, String description, Long available_vacans, Date date_begin, Date date_end, String status, String gender, Float salary, Integer min_age, Integer max_age, Long employerId, Long location_id) {
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
        this.employerId = employerId;
        this.location_id = location_id;
    }
    
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
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
 
    public Long getAvailable_Vacans() {
        return available_vacans;
    }
 
    public void setAvailable_Vacans(Long available_vacans) {
        this.available_vacans = available_vacans;
    }
    
    public Date getDate_Begin() {
        return date_begin;
    }
 
    public void setDate_Begin(Date date_begin) {
        this.date_begin = date_begin;
    }
 
    public Date getDate_End() {
        return date_end;
    }
 
    public void setDate_End(Date date_end) {
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
    
    public Integer getMin_Age() {
        return min_age;
    }
 
    public void setMin_Age(Integer min_age) {
        this.min_age = min_age;
    }
 
    public Integer getMax_Age() {
        return max_age;
    }
 
    public void setMax_Age(Integer max_age) {
        this.max_age = max_age;
    }
    
    public Long getEmployer_Id() {
        return employerId;
    }
 
    public void setEmployer_Id(Long employerId) {
        this.employerId = employerId;
    }
 
    public Long getLocation_Id() {
        return location_id;
    }
 
    public void setLocation_Id(Long location_id) {
        this.location_id = location_id;
    }
}
