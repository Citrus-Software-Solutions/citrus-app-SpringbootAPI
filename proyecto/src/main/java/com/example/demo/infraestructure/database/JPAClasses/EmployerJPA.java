package com.example.demo.infraestructure.database.JPAClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Employer")
public class EmployerJPA {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column private long id;

    @NotEmpty
	@NotNull
    @Column private String name;
    
    @Column private long user_id;
    
    public EmployerJPA() {
    	super();
    }

	public EmployerJPA(long id, @NotEmpty String name, @NotEmpty long user_id) {
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