package com.example.demo.RabbitMQ.Dto;

import com.example.demo.domain.Employee;
import com.example.demo.domain.JobOffer;
import com.example.demo.domain.valueObjects.Aplication_Id;
import com.example.demo.domain.valueObjects.Aplication_Status;
import com.example.demo.domain.valueObjects.Date_Format;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderStatus {

    private Order order;
    private String status;//progress,completed
    private String message;
    
    public OrderStatus() {}  
	public OrderStatus(Order order, String status, String message) {
			super();
			this.order = order;
			this.status = status;
			this.message = message;
		}
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
