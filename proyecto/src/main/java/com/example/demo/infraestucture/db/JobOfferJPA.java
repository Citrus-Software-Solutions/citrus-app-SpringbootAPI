package com.example.demo.infraestucture.db;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_offer")
public class JobOfferJPA {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	@NotEmpty
	@Column
	private String name;
	@NotEmpty
	@Column
	private String description;
	@NotEmpty
	@Column
	private Long available_vacans;
	@NotEmpty
	@Column
	private Date date_begin;
	@NotEmpty
	@Column
	private Date date_end;
	@NotEmpty
	@Column
	private String status;
	@Column
	private String gender;
	@NotEmpty
	@Column
	private Float salary;
	@Column
	private Long min_age;
	@Column
	private Long max_age;
	@NotEmpty
	@Column
	private Long employerId;
	@NotEmpty
	@Column
	private Long location_id;
	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}

}
