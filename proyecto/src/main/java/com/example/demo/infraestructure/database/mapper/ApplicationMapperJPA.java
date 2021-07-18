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
import com.example.demo.domain.valueObjects.Age;
import com.example.demo.domain.valueObjects.Application_Date;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.Application_Status;
import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Gender;
import com.example.demo.domain.valueObjects.Job_Offer_Description;
import com.example.demo.domain.valueObjects.Job_Offer_Id;
import com.example.demo.domain.valueObjects.Job_Offer_Title;
import com.example.demo.domain.valueObjects.Job_Offer_Status;
import com.example.demo.infraestructure.database.JPAClasses.ApplicationJPA;
import com.example.demo.infraestructure.database.repository.JobApplicationRepository;

@Service
@Configurable
public class ApplicationMapperJPA {
	
	
	public Application toDomain(ApplicationJPA jobapplication) {
		Employee employee = new Employee();
		JobOffer joboffer = new JobOffer();
		Application_Id id = new Application_Id(jobapplication.getId());
		Application_Status status = new Application_Status(jobapplication.getStatus());
		Application_Date date = new Application_Date(jobapplication.getDate_application().toString());
	
	return new Application(id, status, date, employee, joboffer);
	}
	
	
	public List<Application> toDomain(List<ApplicationJPA> jpas){
		List<Application> jobApplications = new ArrayList<Application>();
		for (int i = 0; i < jpas.size(); i++) {
			jobApplications.add(toDomain(jpas.get(i)));
        }
		
		return jobApplications;
	}

}
