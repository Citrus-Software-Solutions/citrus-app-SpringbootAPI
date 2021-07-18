package com.example.demo.application.Iservice;

import java.util.List;

import com.example.demo.domain.Application;
import com.example.demo.domain.JobOffer;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.User_Id;

public interface IJobApplication {
	List<Application> findJobApplication();
	Application findJobApplication(Application_Id id);
	List<Application> findJobApplication(User_Id employee);
	Application newJobApplication(Application jobApplication);

}
