package com.citrus.api.infraestructure.database.JPAClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.NotEmpty;

@Entity
@Table(name="review")
public class ReviewJPA {
	public ReviewJPA(Integer id, Integer totalscore, Integer employeeId, Integer employerId, Integer jobApplicationId) {
		super();
		this.id = id;
		this.totalscore = totalscore;
		this.employeeId = employeeId;
		this.employerId = employerId;
		this.jobApplicationId = jobApplicationId;
	}
	
	public ReviewJPA() {
		super();
		
	}

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column private Integer id;
	
	@Column private Integer totalscore;
	
	@NotEmpty
    @Column(name="employee_id") private Integer employeeId;
	
	@NotEmpty
    @Column(name="employer_id") private Integer employerId;
	
	@NotEmpty
    @Column(name="job_application_id") private Integer jobApplicationId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTotalscore() {
		return totalscore;
	}

	public void setTotalscore(Integer totalscore) {
		this.totalscore = totalscore;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getEmployerId() {
		return employerId;
	}

	public void setEmployerId(Integer employerId) {
		this.employerId = employerId;
	}

	public Integer getJobApplicationId() {
		return jobApplicationId;
	}

	public void setJobApplicationId(Integer jobApplicationId) {
		this.jobApplicationId = jobApplicationId;
	}

	

}
