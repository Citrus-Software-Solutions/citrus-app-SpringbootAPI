package com.citrus.api.infraestructure.database.JPAClasses;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.validator.NotEmpty;
import java.util.Date;

@Entity
@Table(name="Application")
public class ApplicationJPA {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column private Integer id;

    @NotEmpty
    @Column private Integer status;

    @NotEmpty
    @Column private Date date_application;

    @NotEmpty
    @Column(name="employee_id") private Integer employeeId;
	
    @NotEmpty
    @Column private Integer job_offer_id;

    public ApplicationJPA(){
        super();
    }

	public ApplicationJPA(Integer id, Integer status, Date date_application, Integer employee_id, Integer job_offer_id) {
		super();
		this.id = id;
		this.status = status;
		this.date_application = date_application;
		this.employeeId = employee_id;
		this.job_offer_id = job_offer_id;
	}
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getDate_application() {
		return date_application;
	}

	public void setDate_application(Date date_application) {
		this.date_application = date_application;
	}

	public Integer getEmployee_id() {
		return employeeId;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employeeId = employee_id;
	}

	public Integer getJob_offer_id() {
		return job_offer_id;
	}

	public void setJob_offer_id(Integer job_offer_id) {
		this.job_offer_id = job_offer_id;
	}
	

}
