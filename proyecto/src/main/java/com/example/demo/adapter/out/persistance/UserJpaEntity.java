package com.example.demo.adapter.out.persistance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="Users")
public class UserJpaEntity {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column private long id;
    @NotEmpty
    @Column private Long document;
    @NotEmpty
    @Column private String username;
    @NotEmpty
    @Column private String password;
    @NotEmpty
    @Column private String email;
    @NotEmpty
    @Column private String status;
    @NotEmpty
    @Column private Long location_id;
   
    public UserJpaEntity() {
    	super();
    }
    
	public UserJpaEntity(long id, @NotEmpty Long document, @NotEmpty String username, String password, String email, String status, Long location_id) {
		super();
		this.id = id;
		this.document = document;
		this.username = username;
		this.password = password;
		this.email = email;
		this.status = status;
		this.location_id = location_id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getDocument() {
		return document;
	}

	public void setDocument(Long document) {
		this.document = document;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Long location_id) {
		this.location_id = location_id;
	}
}
