package com.example.demo.application.Iservice;

import java.util.List;

import com.example.demo.domain.Application;
import com.example.demo.domain.JobOffer;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.Employee_Id;
import com.example.demo.infraestructure.database.JPAClasses.ApplicationJPA;

public interface IJobApplication {
	List<Application> findJobApplication();
	Application findJobApplication(Application_Id id);
	Application newJobApplication(ApplicationJPA jobApplication);
	List<Application> findJobApplication(Employee_Id employee);

}
