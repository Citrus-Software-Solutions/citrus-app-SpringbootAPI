package com.example.demo.infraestructure.database.mapper;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.domain.Employer;
import com.example.demo.domain.valueObjects.Employer_Company_Name;
import com.example.demo.domain.valueObjects.User_Id;
import com.example.demo.infraestructure.database.JPAClasses.EmployerJPA;

public class EmployerMapperJPA {
	
	public Employer toDomain(@Valid @RequestBody EmployerJPA jpa) {

		User_Id id = new User_Id(jpa.getId());
		Employer_Company_Name name = new Employer_Company_Name(jpa.getName());
		
		return new Employer(id,name);
		
	}

}
