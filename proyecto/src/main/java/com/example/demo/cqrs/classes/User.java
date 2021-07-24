package com.example.demo.cqrs.classes;

import java.util.Set;

public class User {
	private String userid;
    private String firstName;
    private String lastName;
    private Set<Contact> contacts;
    private Set<Address> addresses;
    
    public User(String userId, String firstName, String lastName) {
		this.userid = userId;
		this.firstName = firstName;
		this.lastName = lastName;
    }
	// getters and setters
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Set<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
    
}
