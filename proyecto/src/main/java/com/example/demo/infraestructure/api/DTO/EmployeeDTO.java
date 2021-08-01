package com.example.demo.infraestructure.api.DTO;
import java.util.Date;

public class EmployeeDTO {
	
	public Integer id;
	public String first_name;
	public String middle_name;
	public String last_name;
	public String phone_number;

	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}
	public String getMiddleName() {
		return middle_name;
	}
	public void setMiddleName(String middleName) {
		this.middle_name = middleName;
	}
	public String getLastName() {
		return last_name;
	}
	public void setLastName(String lastName) {
		last_name = lastName;
	}
	public String getPhoneNumber() {
		return phone_number;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phone_number = phoneNumber;
	}

}
