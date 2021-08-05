package com.citrus.api.application.providers;

import java.util.List;

import com.citrus.api.domain.Interview;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.domain.valueObjects.Interview_Id;
import com.citrus.api.infraestructure.database.JPAClasses.InterviewJPA;

public interface InterviewRepo {

	List<Interview> findInterview();
	Interview findInterview(Interview_Id id);
	Interview saveInterview(Interview interview);
	List<Interview> findInterview(Employee_Id id);
	
}
