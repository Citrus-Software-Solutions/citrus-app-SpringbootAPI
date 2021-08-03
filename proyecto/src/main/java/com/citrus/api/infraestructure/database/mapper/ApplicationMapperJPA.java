package com.citrus.api.infraestructure.database.mapper;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.citrus.api.application.commands.CreateJobApplicationCommand;
import com.citrus.api.domain.Application;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.JobOffer;
import com.citrus.api.domain.valueObjects.Application_Date;
import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.api.domain.valueObjects.Application_Status;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.domain.valueObjects.Job_Offer_Id;
import com.citrus.api.infraestructure.database.JPAClasses.ApplicationJPA;


@Service
public class ApplicationMapperJPA {
	
	
	public Application toDomain(ApplicationJPA jobapplication) {
		System.out.println(jobapplication.getEmployee_id()); 
		Employee employee = new Employee(new Employee_Id (jobapplication.getEmployee_id()));
		JobOffer joboffer = new JobOffer();
		Application_Id id = new Application_Id(jobapplication.getId());
		Application_Status status = new Application_Status(jobapplication.getStatus());
		Application_Date date = new Application_Date(jobapplication.getDate_application());
	
	return new Application(id, status, date, employee, joboffer);
	}
	
	

	public CreateJobApplicationCommand toCommand(ApplicationJPA jpa) {
		CreateJobApplicationCommand command = new CreateJobApplicationCommand(
				new Application_Id (jpa.getId()), 
				new Application_Date (jpa.getDate_application()), 
				new Employee_Id (jpa.getEmployee_id()), 
				new Job_Offer_Id (jpa.getJob_offer_id()),
				new Application_Status(jpa.getStatus()) 
				);
		return command;
	}
	
	
	public ApplicationJPA toJPA (Application application) {
		ApplicationJPA jpa = new ApplicationJPA(
				application.getId().getValue(),
				application.getStatus().getValue(),
				application.getDate().getValue(),
				application.getEmployee().getId().getValue(),
				application.getJobOffer().getId().getValue()
				);
		return jpa;
	}
	
	
	public List<Application> toDomain(List<ApplicationJPA> jpas){
		List<Application> jobApplications = new ArrayList<Application>();
		for (int i = 0; i < jpas.size(); i++) {
			jobApplications.add(toDomain(jpas.get(i)));
        }
		
		return jobApplications;
	}

}
