package com.example.demo.adapter.out.persistance;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.NotEmpty;

@Entity
@Table(name = "job_offer")
public class Job_OfferJpa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long id;
    @NotEmpty
    @Column private String name;
    @NotEmpty
    @Column private String description;
    @NotEmpty
    @Column private Long available_vacans;
    @NotEmpty
    @Column private Date date_begin;
    @NotEmpty
    @Column private Date date_end;
    @Column private String gender;
    @NotEmpty
    @Column private Float salary;
    @Column private Long min_age;
    @Column private Long max_age;
    @NotEmpty
    @Column private Long employerId;
    @NotEmpty
    @Column private Long location_id;

    public Job_OfferJpa() {
    	super();
    }
    
    public Job_OfferJpa(String name, String description, Long available_vacans, Date date_begin, Date date_end, String gender, Float salary, Long min_age, Long max_age, Long employerId, Long location_id) {
        this.name = name;
        this.description = description;
        this.available_vacans = available_vacans;
        this.date_begin = date_begin;
        this.date_end = date_end;
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
    
    public Long getMin_Age() {
        return min_age;
    }
 
    public void setMin_Age(Long min_age) {
        this.min_age = min_age;
    }
 
    public Long getMax_Age() {
        return max_age;
    }
 
    public void setMax_Age(Long max_age) {
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
