package com.example.demo.RabbitMQ.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class contacts {

    private String full_name;
    private String job_title;
    private Integer phone_number;
    private String email;
    
    public contacts() {} 
    public contacts(String full_name, String job_title, Integer phone_number, String email) {
 	   super();
 	   this.full_name = full_name;
 	   this.job_title = job_title;
 	   this.phone_number = phone_number;
 	   this.email = email;
    }
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public Integer getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(Integer phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
