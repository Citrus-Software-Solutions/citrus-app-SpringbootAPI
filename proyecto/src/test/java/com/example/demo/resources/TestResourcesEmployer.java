package com.example.demo.resources;


import org.springframework.stereotype.Component;
import com.example.demo.domain.Employer;
import com.example.demo.domain.valueObjects.Employer_Name;
import com.example.demo.domain.valueObjects.User_Id;

@Component
public class TestResourcesEmployer {
	
			User_Id id_e = new User_Id(2);
			Employer_Name name_e = new Employer_Name("Micro");
			
			public Employer emp =  new Employer(id_e,name_e);

}
