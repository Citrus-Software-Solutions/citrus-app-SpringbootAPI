package com.example.demo.infraestructure.database.mapper;

import com.example.demo.domain.Employee;
import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Employee_Name;
import com.example.demo.domain.valueObjects.Employer_Name;
import com.example.demo.domain.valueObjects.Gender;
import com.example.demo.domain.valueObjects.User_Id;
import com.example.demo.infraestructure.database.JPAClasses.EmployeeJPA;
import com.example.demo.infraestructure.database.JPAClasses.EmployerJPA;

public class EmployeeMapperJPA {
	
	public Employee toDomain(EmployeeJPA jpa){
		User_Id id = new User_Id(jpa.getId());
		Employee_Name name = new Employee_Name(jpa.getName(), jpa.getSecond_name(), jpa.getLastname(), jpa.getSecond_lastname());
		Gender gender= new Gender(jpa.getGender());
		Date_Format date= new Date_Format(jpa.getBirth_date());
		Employee employee = new Employee(id, name, gender, date);
		return employee;
		
	}

}
