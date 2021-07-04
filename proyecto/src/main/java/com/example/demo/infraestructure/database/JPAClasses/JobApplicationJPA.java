package com.example.demo.infraestructure.database.JPAClasses;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.validator.NotEmpty;
import java.util.Date;

@Entity
@Table(name="Job_Application")
public class JobApplicationJPA {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column private long id;

    @NotEmpty
    @Column private String status;

    @NotEmpty
    @Column private Date date_application;

    @NotEmpty
    @Column(name="employee_id") private Long employeeId;
	
    @NotEmpty
    @Column private Long job_offer_id;

    public JobApplicationJPA(){
        super();
    }

	public JobApplicationJPA(long id, String status, Date date_application, Long employee_id, Long job_offer_id) {
		super();
		this.id = id;
		this.status = status;
		this.date_application = date_application;
		this.employeeId = employee_id;
		this.job_offer_id = job_offer_id;
	}
	
	public JobApplicationJPA(String status, Date date_application, Long employee_id, Long job_offer_id) {
		super();
		this.status = status;
		this.date_application = date_application;
		this.employeeId = employee_id;
		this.job_offer_id = job_offer_id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate_application() {
		return date_application;
	}

	public void setDate_application(Date date_application) {
		this.date_application = date_application;
	}

	public Long getEmployee_id() {
		return employeeId;
	}

	public void setEmployee_id(Long employee_id) {
		this.employeeId = employee_id;
	}

	public Long getJob_offer_id() {
		return job_offer_id;
	}

	public void setJob_offer_id(Long job_offer_id) {
		this.job_offer_id = job_offer_id;
	}
	

}
