package com.example.demo.application.service;

import java.util.List;

import com.example.demo.application.Iservice.IJobApplication;
import com.example.demo.domain.Application;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.Employee_Id;
import com.example.demo.infraestructure.database.JPAClasses.ApplicationJPA;

public class JobApplicationService {
	
	final IJobApplication repo;
	
	public JobApplicationService (IJobApplication repo) {
		this.repo = repo;
	}
	
	public List<Application> findJobApplication(){
		return repo.findJobApplication();	
	}
	
	public List<Application> findJobApplication(Employee_Id employee){
		return repo.findJobApplication(employee);
	}
	
	public Application findJobApplication(Application_Id id){
		return repo.findJobApplication(id);
	}
	
	public Application newJobApplication(ApplicationJPA jobApplication) {
		
		return repo.newJobApplication(jobApplication);
	}


}
