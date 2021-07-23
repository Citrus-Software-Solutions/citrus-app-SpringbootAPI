package com.example.demo.infraestructure.database.JPAClasses;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.NotEmpty;


@Entity
@Table(name="Interview")
public class InterviewJPA {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column private Integer id;

	@NotEmpty
	@Column private Date startDate;
	
	@NotEmpty
    @Column private Integer duration;
	
	@NotEmpty
    @Column private String accessURL;
	
    @NotEmpty
    @Column private Integer status;

    @NotEmpty
    @Column private Date date_application;

    @NotEmpty
    @Column(name="employee_id") private Integer employeeId;
    @NotEmpty
    @Column(name="staff_member_id") private Integer staffMemberId;
    @NotEmpty
    @Column(name="job_application_id") private Integer jobApplicationId;
	
}
