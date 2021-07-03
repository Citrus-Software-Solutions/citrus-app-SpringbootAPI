package com.example.demo.application.Iservice;

import java.util.List;

import com.example.demo.domain.Application;
import com.example.demo.domain.valueObjects.Aplication_Id;
import com.example.demo.domain.valueObjects.User_Id;

public interface IJobApplication {
	List<Application> findJobApplication();
	Application findJobApplication(Aplication_Id id);
	Application newJobOffer(Application jobApplication);

}
