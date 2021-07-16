package com.example.demo.infraestructure.api.DTO;
import java.util.Date;

import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Employee_Name;
import com.example.demo.domain.valueObjects.Gender;
import com.example.demo.domain.valueObjects.User_Id;

public class EmployeeDTO {
	
	public EmployeeDTO (Long id, String name,String secondname, String lastname,
			String secondlastname,Date birthdate, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.secondname = secondname;
		this.lastname = lastname;
		this.secondLastName = secondlastname;
		this.birthdate = birthdate;
		this.gender = gender;
		
	}
	
	public EmployeeDTO() {
		super();
		
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

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public long id;
	
	private String name;
	
	private String secondname;
	
	private String lastname;
	
	private String secondLastName;
	
	private String gender;
	
	private Date birthdate;
	
	

}
