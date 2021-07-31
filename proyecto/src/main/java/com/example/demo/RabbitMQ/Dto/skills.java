package com.example.demo.RabbitMQ.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class skills {

    private String name;
    private Integer category;
    
    public skills() {} 
    public skills(String name, Integer category) {
 	   super();
 	   this.name = name;
 	   this.category = category;
    }
    
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public Integer getcategory() {
		return category;
	}
	public void setcategory(Integer category) {
		this.category = category;
	}
}
