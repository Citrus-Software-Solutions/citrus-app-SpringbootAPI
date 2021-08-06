package com.citrus.api.infraestructure.RabbitMQ.Dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Receiver {

	 private String pattern;
	 private List<data> data;
	 
	public String getPattern() {
		return pattern;
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
