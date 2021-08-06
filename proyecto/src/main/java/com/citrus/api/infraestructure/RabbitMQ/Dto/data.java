package com.citrus.api.infraestructure.RabbitMQ.Dto;

import com.citrus.api.infraestructure.api.DTO.EmployerDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class data {

	public Integer id;
	public String title;
	public Integer duration;
	public EmployerDTO employer;
}
