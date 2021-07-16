package com.example.demo.resources;


import java.sql.Date;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Employer;
import com.example.demo.domain.JobOffer;
import com.example.demo.domain.Location;
import com.example.demo.domain.valueObjects.Age;
import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Employer_Name;
import com.example.demo.domain.valueObjects.Gender;
import com.example.demo.domain.valueObjects.Job_Offer_Description;
import com.example.demo.domain.valueObjects.Job_Offer_Id;
import com.example.demo.domain.valueObjects.Job_Offer_Name;
import com.example.demo.domain.valueObjects.Job_Status;
import com.example.demo.domain.valueObjects.Location_Id;
import com.example.demo.domain.valueObjects.Location_Name;
import com.example.demo.domain.valueObjects.Location_Type;
import com.example.demo.domain.valueObjects.Price;
import com.example.demo.domain.valueObjects.Quota;
import com.example.demo.domain.valueObjects.User_Id;

@Component
public class TestResourcesJobOffer {
	
	User_Id id_e = new User_Id(2);
	Employer_Name name_e = new Employer_Name("Micro");
	
	public Employer emp =  new Employer(id_e,name_e);
	
	Location_Id id = new Location_Id((long) 2);
	Location_Name name = new Location_Name("Calle Los Ruices");
	Location_Type type = new Location_Type("Specific Direction");
	
	 public Location loc = new Location (id, name, type);
	 
				Age min_age = new Age(null);
				Age max_age = new Age(null);
				Gender gender = new Gender("F");
				Job_Offer_Id id_o = new Job_Offer_Id(2);
				Job_Offer_Name name_o = new Job_Offer_Name("Software Developer");
				Job_Offer_Description description = new Job_Offer_Description("Trabajo para una persona que quiere ampliar conocimientos");
				Quota available_vacans = new Quota((long) 3);
				Date_Format date_begin = new Date_Format(Date.valueOf("2021-07-11"));
				Date_Format date_end = new Date_Format(Date.valueOf("2021-07-17"));
				Price salary = new Price((float) 300.3);
				Job_Status status = new Job_Status("Hidden");
				
				public JobOffer jo = new JobOffer(id_o, name_o, description, available_vacans, date_begin, date_end, salary, status, gender,
						min_age, max_age,loc, emp);
				
			public JobOffer JobOfferCreate(){

			 return new JobOffer(id_o, name_o, description, available_vacans, date_begin, date_end, salary, status, gender,
						min_age, max_age,loc, emp);
				}

}
