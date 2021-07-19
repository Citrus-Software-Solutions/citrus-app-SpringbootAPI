package com.example.demo.domain;

import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Job_Offer_Duration;
import com.example.demo.domain.valueObjects.Job_Offer_Hourly_Rate;
import com.example.demo.domain.valueObjects.Job_Offer_Id;
import com.example.demo.domain.valueObjects.Job_Offer_Title;
import com.example.demo.domain.valueObjects.Job_Offer_Status;
import com.example.demo.domain.valueObjects.Special_Requirements;

public class JobOffer {
	Job_Offer_Id id;
	Job_Offer_Title title;
	Employer employer;
	Address location;
	Date_Format deadline;
	Date_Format[] schedules;
	Skill[] skills;
	Special_Requirements sprecialRequirements;
	Job_Offer_Duration duration;
	Job_Offer_Hourly_Rate hourlyRate;
	Employee employee;
	Job_Offer_Status status;
}
