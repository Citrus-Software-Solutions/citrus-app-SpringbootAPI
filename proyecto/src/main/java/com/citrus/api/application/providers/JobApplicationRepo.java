package com.citrus.api.application.providers;

import java.util.List;

import com.citrus.api.domain.Application;
import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.infraestructure.database.JPAClasses.ApplicationJPA;

public interface JobApplicationRepo {
	List<Application> findJobApplication();
	Application findJobApplication(Application_Id id);
	Application saveJobApplication(Application jobApplication);
	List<Application> findJobApplication(Employee_Id employee);

}
