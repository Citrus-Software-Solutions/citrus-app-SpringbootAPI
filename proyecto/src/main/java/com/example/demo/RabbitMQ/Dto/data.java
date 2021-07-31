package com.example.demo.RabbitMQ.Dto;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class data {

    private Integer id;
    private String company_name;
    private address address;
    private List<contacts> contacts;
    private List<skills> skills;
    private String special_requirements;
    private Integer status;
    
    public data() {}    
    public data (Integer id, String company_name, String data, address address, List<contacts> contacts, List<skills> skills, String special_requirements, Integer status) {
    	super();
    	this.id = id;
    	this.company_name = company_name;
    	this.address = address;
    	this.contacts = contacts;
    	this.skills = skills;
    	this.special_requirements = special_requirements;
    	this.status = status;
    }
    
	public Integer getid() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	
	public String getcompany_name() {
		return company_name;
	}
	public void setcompany_name(String company_name) {
		this.company_name = company_name;
	}

	public address getaddress() {
		return address;
	}

	public void setaddress(address address) {
		this.address = address;
	}
	
	public List<contacts> getcontacts() {
		return contacts;
	}

	public void setcontacts(List<contacts> contacts) {
		this.contacts = contacts;
	}
	
	public List<skills> getskills() {
		return skills;
	}

	public void setskills(List<skills> skills) {
		this.skills = skills;
	}
	
	public String getSpecial_requirements() {
		return special_requirements;
	}

	public void setSpecial_requirements(String special_requirements) {
		this.special_requirements = special_requirements;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
