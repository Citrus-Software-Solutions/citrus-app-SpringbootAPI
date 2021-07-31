package com.example.demo.infraestructure.database.mapper;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.domain.Application;
import com.example.demo.domain.Employee;
import com.example.demo.domain.JobOffer;
import com.example.demo.domain.valueObjects.Application_Date;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.Application_Status;
import com.example.demo.infraestructure.database.JPAClasses.ApplicationJPA;


@Service
public class ApplicationMapperJPA {
	
	
	public Application toDomain(ApplicationJPA jobapplication) {
		Employee employee = new Employee(jobapplication.getEmployee_id());
		JobOffer joboffer = new JobOffer(jobapplication.getId());
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
