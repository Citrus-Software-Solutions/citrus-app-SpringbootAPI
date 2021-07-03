package com.example.demo.application.service;

import java.util.List;

import com.example.demo.application.Iservice.IJobApplication;
import com.example.demo.domain.Application;
import com.example.demo.domain.valueObjects.Aplication_Id;
import com.example.demo.domain.valueObjects.User_Id;

public class JobApplicationService {
	
	private IJobApplication repo;
	
	public JobApplicationService (IJobApplication repo) {
		this.repo = repo;
	}
	
	public List<Application> findJobApplication(){
		return repo.findJobApplication();	
	}
	
	public List<Application> findJobOffer(User_Id employee){
		return repo.findJobApplication(employee);
	}
	
	public Application findJobApplication(Aplication_Id id){
		return repo.findJobApplication(id);
	}
	
	public Application newJobApplication(Application jobApplication) {
		
		return repo.newJobApplication(jobApplication);
	}

}
