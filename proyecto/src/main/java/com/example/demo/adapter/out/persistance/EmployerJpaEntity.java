package com.example.demo.adapter.out.persistance;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="Employer")
public class EmployerJpaEntity {
    /*
    CREATE TABLE Employer (
    id serial PRIMARY KEY,
    name VARCHAR (25) NOT NULL,
    user_id integer not null,
    constraint Fk_fk_user FOREIGN KEY (user_id) REFERENCES Users (id) ON DELETE CASCADE
    );
    */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column private long id;
    @NotEmpty
    @Column private String name;
    @NotEmpty
    @Column private long user_id;
    
    public EmployerJpaEntity() {
    	super();
    }

	public EmployerJpaEntity(long id, @NotEmpty String name, @NotEmpty long user_id) {
		super();
		this.id = id;
		this.name = name;
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

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
    
    
}
