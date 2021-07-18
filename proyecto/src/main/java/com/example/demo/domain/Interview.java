package com.example.demo.domain;

import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Interview_AccessURL;
import com.example.demo.domain.valueObjects.Interview_Duration;
import com.example.demo.domain.valueObjects.Interview_Id;
import com.example.demo.domain.valueObjects.Interview_Status;

public class Interview {
	
	Interview_Id id;
	Employee employee;
	StaffMember staffMember;
	Application application;
	Date_Format startDate;
	Interview_Duration duration;
	Interview_AccessURL accessURL;
	Interview_Status status;

}
