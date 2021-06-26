package domain;

import javax.persistence.Entity;

//import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import domain.valueobjects.User_Id;
import domain.valueobjects.Document;
import domain.valueobjects.Username;
import domain.valueobjects.Password;
import domain.valueobjects.Email;
import domain.valueobjects.User_Status;


public class User {
	private User_Id id; 
	private Document document;
	private Username name;
	private Password password;
	private Email email;
	private User_Status status;
	private Location location;


	public User(User_Id id, 
				Document document,
				Username name,
				Password password,
				Email email,
				User_Status status,
				Location location)
	{
		super();
		this.id= id;
		this.document=document;
		this.name=name;
		this.password=password;
		this.email=email;
		this.status=status;
		this.location=location;
	}


	public User_Id getId() {
		return id;
	}


	public void setId(User_Id id) {
		this.id = id;
	}


	public Document getDocument() {
		return document;
	}


	public void setDocument(Document document) {
		this.document = document;
	}


	public Username getName() {
		return name;
	}


	public void setName(Username name) {
		this.name = name;
	}


	public Password getPassword() {
		return password;
	}


	public void setPassword(Password password) {
		this.password = password;
	}


	public Email getEmail() {
		return email;
	}


	public void setEmail(Email email) {
		this.email = email;
	}


	public User_Status getStatus() {
		return status;
	}


	public void setStatus(User_Status status) {
		this.status = status;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}

	

}
