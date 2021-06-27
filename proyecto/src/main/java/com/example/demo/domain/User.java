package com.example.demo.domain;


//import javax.validation.constraints.NotBlank;



import com.example.demo.domain.valueobjects.User_Id;
import com.example.demo.domain.valueobjects.Document;
import com.example.demo.domain.valueobjects.Username;
import com.example.demo.domain.valueobjects.Password;
import com.example.demo.domain.valueobjects.Email;
import com.example.demo.domain.valueobjects.User_Status;

public class User {
	private User_Id id; // global identity
	private Document document;
	private Username username;
	private Password password;
	private Email email;
	private User_Status status;
	private Location location;
	
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
	public Username getUsername() {
		return username;
	}
	public void setUsername(Username username) {
		this.username = username;
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
