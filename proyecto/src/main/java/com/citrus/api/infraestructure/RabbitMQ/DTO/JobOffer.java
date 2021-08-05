package com.citrus.api.infraestructure.RabbitMQ.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JobOffer {

	private String pattern;
    private List<data> data;
	public String getPattern() {
		return pattern;
	}
	
    public JobOffer() {}    
    public JobOffer (String pattern, List<data> data) {
    	super();
    	this.pattern = pattern;
    	this.data = data;
    }
	
	
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public List<data> getData() {
		return data;
	}
	public void setData(List<data> data) {
		this.data = data;
	}
}
