package com.example.demo.domain;

import com.example.demo.domain.valueObjects.Application_Date;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.Application_Status;

public class Application {
	
	Application_Id id;
	Application_Date date;
	Employee employee;
	JobOffer jobOffer;
	Application_Status status;

}