package com.example.demo.infraestructure.database.mapper;

import com.example.demo.domain.Employer;
import com.example.demo.domain.valueObjects.Employer_Name;
import com.example.demo.domain.valueObjects.User_Id;
import com.example.demo.infraestructure.database.JPAClasses.EmployerJPA;

public class EmployerMapperJPA {
	
	public Employer toDomain(EmployerJPA jpa) {

		User_Id id = new User_Id(jpa.getId());
		Employer_Name name = new Employer_Name(jpa.getName());
		
		return new Employer(id,name);
		
	}

}
