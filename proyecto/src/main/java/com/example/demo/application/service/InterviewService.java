package com.example.demo.application.service;

import java.sql.Date;
import java.util.List;

import com.example.demo.application.Iservice.IInterview;
import com.example.demo.domain.Interview;
import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Interview_Id;
import com.example.demo.domain.valueObjects.Interview_Status;

public class InterviewService {
	
	final IInterview repo;
	
	public InterviewService (IInterview repo) {
		this.repo = repo;
	}
	
	Interview schedule(Interview interview) {
		return repo.saveInterview(interview);	
	};
	List<Interview> findInterview(){
		return repo.findInterview();
	};
	Interview findInterview(Interview_Id id) {
		return repo.findInterview(id);
	};
	Interview rescheduleInterview(Interview interview, Date date) {
		Date_Format newDate = new Date_Format(date);
		interview.setStartDate(newDate);
		return repo.saveInterview(interview);
	};
	Interview modifyStatusInterview(Interview interview, Number status) {
		Interview_Status newStatus = new Interview_Status(status);
		interview.setStatus(newStatus);
		return repo.saveInterview(interview);
	};

}
