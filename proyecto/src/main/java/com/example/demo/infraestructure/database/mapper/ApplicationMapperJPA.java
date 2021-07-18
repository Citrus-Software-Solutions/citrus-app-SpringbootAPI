package com.example.demo.infraestructure.database.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EntityNotFoundException;

import org.hibernate.validator.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Application;
import com.example.demo.domain.Employee;
import com.example.demo.domain.Employer;
import com.example.demo.domain.JobOffer;
import com.example.demo.domain.Location;
import com.example.demo.domain.valueObjects.Age;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.Application_Status;
import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Gender;
import com.example.demo.domain.valueObjects.Job_Offer_Description;
import com.example.demo.domain.valueObjects.Job_Offer_Id;
import com.example.demo.domain.valueObjects.Job_Offer_Title;
import com.example.demo.domain.valueObjects.Job_Offer_Status;
import com.example.demo.domain.valueObjects.Price;
import com.example.demo.domain.valueObjects.Quota;
import com.example.demo.infraestructure.database.JPAClasses.EmployeeJPA;
import com.example.demo.infraestructure.database.JPAClasses.EmployerJPA;
import com.example.demo.infraestructure.database.JPAClasses.ApplicationJPA;
import com.example.demo.infraestructure.database.JPAClasses.JobOfferJPA;
import com.example.demo.infraestructure.database.JPAClasses.LocationJPA;
import com.example.demo.infraestructure.database.repository.EmployeeRepository;
import com.example.demo.infraestructure.database.repository.EmployerRepository;
import com.example.demo.infraestructure.database.repository.JobApplicationRepository;
import com.example.demo.infraestructure.database.repository.JobOfferRepository;
import com.example.demo.infraestructure.database.repository.LocationRepository;

@Service
@Configurable
public class ApplicationMapperJPA {
	
	EmployeeMapperJPA employeeMapper = new EmployeeMapperJPA();
	JobOfferMapperJPA jobOfferMapper = new JobOfferMapperJPA();
	LocationMapperJPA locationMapper = new LocationMapperJPA();
	EmployerMapperJPA employerMapper = new EmployerMapperJPA();
	
	@Autowired
	EmployeeRepository employeeRepo;
	@Autowired
	JobApplicationRepository jobApplicationRepo;
	@Autowired
	EmployerRepository employerRepo;
	@Autowired
	LocationRepository locationRepo;
	@Autowired
	JobOfferRepository jobOfferRepo;
	
	public Application toDomain(ApplicationJPA jobapplication) {
		EmployeeJPA employeeJPA = employeeRepo.findById(jobapplication.getEmployee_id()).orElseThrow(EntityNotFoundException::new);
		JobOfferJPA jobOfferJPA = jobOfferRepo.findById(jobapplication.getJob_offer_id()).orElseThrow(EntityNotFoundException::new);
		
		Application_Status status = new Application_Status(jobapplication.getStatus());
		Date_Format date = new Date_Format(jobapplication.getDate_application());
		Employee employee;
		Application_Id id = new Application_Id(jobapplication.getId());
		
		employee = (employeeJPA==null) ? (null): employeeMapper.toDomain(employeeJPA);
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
		Job_Offer_Id idjb = new Job_Offer_Id(jobOfferJPA.getId());
		Job_Offer_Title name = new Job_Offer_Title(jobOfferJPA.getName());
		Job_Offer_Description description = new Job_Offer_Description(jobOfferJPA.getDescription());
		Quota available_vacans = new Quota(jobOfferJPA.getAvailable_Vacans());
		Date_Format date_begin = new Date_Format(jobOfferJPA.getDate_Begin());
		Date_Format date_end = new Date_Format(jobOfferJPA.getDate_End());
		Price salary = new Price(jobOfferJPA.getSalary());
		Job_Offer_Status statusjb = new Job_Offer_Status(jobOfferJPA.getStatus());
		JobOffer joboffer = new JobOffer(idjb, name, description, available_vacans, date_begin, date_end, salary, statusjb, gender,
				min_age, max_age, location, employer);
	
	return new Application(id, status, date, employee, joboffer);
	}
	
	public ApplicationJPA toJPA(Application app) {
		String status;
		Date date;
		Long id;
		Long employee_id;
	    Long job_offer_id;
		
	    employee_id = (app.getEmployee()==null) ? (null): app.getEmployee().getId().getValue();
	    job_offer_id = (app.getJoboffer()==null) ? (null): app.getJoboffer().getId().getValue();
	    id = (app.getId()==null) ? (null): app.getId().getValue();
	    date = (app.getDate()==null) ? (null): app.getDate().getValue();
	    status = (app.getStatus()==null) ? (null): app.getStatus().getValue();
	    
	    return new ApplicationJPA (id, status,date, employee_id, job_offer_id);
	}
	
	public List<ApplicationJPA> toJPAs(Application jobApplication) {
		List<ApplicationJPA> list = new ArrayList<ApplicationJPA>();
		list.add(toJPA(jobApplication));
		return list;
	}
	
	public List<Application> toDomain(List<ApplicationJPA> jpas){
		List<Application> jobApplications = new ArrayList<Application>();
		for (int i = 0; i < jpas.size(); i++) {
			jobApplications.add(toDomain(jpas.get(i)));
        }
		
		return jobApplications;
	}

}
