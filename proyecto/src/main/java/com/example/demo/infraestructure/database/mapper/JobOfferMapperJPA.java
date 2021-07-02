
package com.example.demo.infraestructure.database.mapper;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Employer;
import com.example.demo.domain.JobOffer;
import com.example.demo.domain.Location;
import com.example.demo.domain.valueObjects.Age;
import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Gender;
import com.example.demo.domain.valueObjects.Job_Offer_Description;
import com.example.demo.domain.valueObjects.Job_Offer_Id;
import com.example.demo.domain.valueObjects.Job_Offer_Name;
import com.example.demo.domain.valueObjects.Job_Status;
import com.example.demo.domain.valueObjects.Price;
import com.example.demo.domain.valueObjects.Quota;
import com.example.demo.infraestructure.database.JPAClasses.EmployerJPA;
import com.example.demo.infraestructure.database.JPAClasses.JobOfferJPA;
import com.example.demo.infraestructure.database.JPAClasses.LocationJPA;
import com.example.demo.infraestructure.database.repository.EmployerRepository;
import com.example.demo.infraestructure.database.repository.JobOfferRepository;
import com.example.demo.infraestructure.database.repository.LocationRepository;

@Service
@Configurable
public class JobOfferMapperJPA {
	
	LocationMapperJPA locationMapper = new LocationMapperJPA();
	EmployerMapperJPA employerMapper = new EmployerMapperJPA();
	
	@Autowired
	EmployerRepository employerRepo;
	@Autowired
	LocationRepository locationRepo;
	@Autowired
	JobOfferRepository jobRepo;
	
	public JobOffer toDomain(JobOfferJPA jobOfferJPA) {
		EmployerJPA employerJPA = employerRepo.findById(jobOfferJPA.getEmployer_Id()).orElseThrow(EntityNotFoundException::new);
		LocationJPA locationJPA = locationRepo.findById(jobOfferJPA.getLocation_Id()).orElseThrow(EntityNotFoundException::new);
		Location location;
		Employer employer;
		Gender gender;
		Age min_age;
		Age max_age;
		
		location = (locationJPA==null) ? (null): locationMapper.toDomain(locationJPA);
		employer = (employerJPA==null) ? (null): employerMapper.toDomain(employerJPA);
		
		gender = (jobOfferJPA.getGender()==null) ? (null): new Gender(jobOfferJPA.getGender());
		min_age = (jobOfferJPA.getMin_Age()==null) ? (null): new Age(jobOfferJPA.getMin_Age());
		max_age = (jobOfferJPA.getMax_Age()==null) ? (null): new Age(jobOfferJPA.getMax_Age());
		Job_Offer_Id id = new Job_Offer_Id(jobOfferJPA.getId());
		Job_Offer_Name name = new Job_Offer_Name(jobOfferJPA.getName());
		Job_Offer_Description description = new Job_Offer_Description(jobOfferJPA.getDescription());
		Quota available_vacans = new Quota(jobOfferJPA.getAvailable_Vacans());
		Date_Format date_begin = new Date_Format(jobOfferJPA.getDate_Begin());
		Date_Format date_end = new Date_Format(jobOfferJPA.getDate_End());
		Price salary = new Price(jobOfferJPA.getSalary());
		Job_Status status = new Job_Status(jobOfferJPA.getStatus());
		return new JobOffer(id, name, description, available_vacans, date_begin, date_end, salary, status, gender,
				min_age, max_age, location, employer);

	}
	
	public JobOfferJPA toJPA(JobOffer jobOffer) {
		Long location;
		Long employer;
		String gender;
		Integer min_age;
		Integer max_age;
		
		location = (jobOffer.getLocation()==null) ? (null): jobOffer.getLocation().getId().getValue();
		employer = (jobOffer.getEmployer()==null) ? (null): jobOffer.getEmployer().getId().getValue();
		min_age = (jobOffer.getMin_age()==null) ? (null): jobOffer.getMin_age().getValue();
		max_age = (jobOffer.getMax_age()==null) ? (null): jobOffer.getMax_age().getValue();
		gender = (jobOffer.getGender()==null) ? (null): jobOffer.getGender().getGender();

		Long id = jobOffer.getId().getValue();
		String name = jobOffer.getName().getName();
		String description = jobOffer.getDescription().getDescription();
		Long available_vacans = jobOffer.getAvailable_vacans().getQuota();
		Date date_begin = (Date) jobOffer.getDate_begin().getValue();
		Date date_end =(Date) jobOffer.getDate_end().getValue();
		Float salary = jobOffer.getSalary().getPrice();
		String status = jobOffer.getStatus().getValue();
		return new JobOfferJPA(id, name, description, available_vacans, date_begin,date_end, 
				status, gender,salary, min_age,max_age, employer, location);

	}
	
	public List<JobOfferJPA> toJPAs(JobOffer jobOffer) {
		List<JobOfferJPA> list = new ArrayList<JobOfferJPA>();
		list.add(toJPA(jobOffer));
		return list;
	}
	
	public List<JobOffer> toDomain(List<JobOfferJPA> jpas){
		List<JobOffer> jobOffers = new ArrayList<JobOffer>();
		for (int i = 0; i < jpas.size(); i++) {
			jobOffers.add(toDomain(jpas.get(i)));
        }
		
		return jobOffers;
	}
	
}
