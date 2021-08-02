package com.citrus.api.infraestructure.database.JPAClasses;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;
import org.hibernate.validator.NotEmpty;

@Aggregate
@Entity
@Table(name="Interview")
public class InterviewJPA {

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getAccessURL() {
		return accessURL;
	}
	public void setAccessURL(String accessURL) {
		this.accessURL = accessURL;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getStaffMemberId() {
		return staffMemberId;
	}
	public void setStaffMemberId(Integer staffMemberId) {
		this.staffMemberId = staffMemberId;
	}
	public Integer getJobApplicationId() {
		return jobApplicationId;
	}
	public void setJobApplicationId(Integer jobApplicationId) {
		this.jobApplicationId = jobApplicationId;
	}
	@Id
	@AggregateIdentifier
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column private Integer id;

	@NotEmpty
	@Column(name="startdate") private Date startDate;
	
	@NotEmpty
    @Column private Integer duration;
	
	@NotEmpty
    @Column private String accessURL;
	
    @NotEmpty
    @Column private Integer status;

    @NotEmpty
    @Column(name="employee_id") private Integer employeeId;
    @NotEmpty
    @Column(name="staff_member_id") private Integer staffMemberId;
    @NotEmpty
    @Column(name="job_application_id") private Integer jobApplicationId;
	
    
    
}
