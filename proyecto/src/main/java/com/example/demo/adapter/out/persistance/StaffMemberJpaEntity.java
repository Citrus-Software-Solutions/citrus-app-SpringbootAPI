package com.example.demo.adapter.out.persistance;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.NotEmpty;

@Entity
@Table(name="Staff_Member")
public class StaffMemberJpaEntity {
    /*CREATE TABLE Staff_Member (
    id serial PRIMARY KEY,
    name VARCHAR (15) NOT NULL,
    gender varchar (2) NOT NULL CHECK (gender = 'M' or gender = 'F'),
    
    second_name varchar (25),
    lastname VARCHAR (25) NOT NULL,
    second_lastname varchar (25) NOT NULL,
    birth_date date NOT NULL,
    user_id integer not null,
    constraint Fk_fk_user FOREIGN KEY (user_id) REFERENCES Users (id) ON DELETE CASCADE
);  */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long id;
    @NotEmpty
    @Column private String name;
    @NotEmpty
    @Column private String gender;
    @NotEmpty
    @Column private String second_name;
    @NotEmpty
    @Column private String lastname;
    @NotEmpty
    @Column private String second_lastname;
    @NotEmpty
    @NotNull
    @Column private Date birth_date;
    @NotEmpty 
    @NotNull
    @Column private long user_id;

    public StaffMemberJpaEntity() {
    	super();
    }

	public StaffMemberJpaEntity(long id, String name, String gender, String second_name, String lastname,
			String second_lastname, @NotNull Date birth_date, @NotNull long user_id) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.second_name = second_name;
		this.lastname = lastname;
		this.second_lastname = second_lastname;
		this.birth_date = birth_date;
		this.user_id = user_id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSecond_name() {
		return second_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSecond_lastname() {
		return second_lastname;
	}

	public void setSecond_lastname(String second_lastname) {
		this.second_lastname = second_lastname;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
    
    
}
