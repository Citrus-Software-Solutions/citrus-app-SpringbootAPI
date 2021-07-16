package com.example.demo.resources;

import java.sql.Date;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Employee;
import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Employee_Name;
import com.example.demo.domain.valueObjects.Gender;
import com.example.demo.domain.valueObjects.User_Id;

@Component
public class TestResourcesEmployee {

	User_Id id_ee = new User_Id(2);
	Employee_Name name_ee = new Employee_Name("Carlos", "Perez", "Gonzalez", "Rodriguez");
	Gender gender = new Gender("M");
	Date_Format birthdate = new Date_Format(Date.valueOf("2021-07-12"));
	
	public Employee em = new Employee(id_ee, name_ee, gender, birthdate);
}
