package com.example.demo.application.service;

import java.util.Date;
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
	
	public Interview schedule(Interview interview) {
		return repo.saveInterview(interview);	
	};
	public List<Interview> findInterview(){
		return repo.findInterview();
	};
	public Interview findInterview(Interview_Id id) {
		return repo.findInterview(id);
	};
	public Interview rescheduleInterview(Interview interview, Date date) {
		Date_Format newDate = new Date_Format(date);
		interview.setStartDate(newDate);
		return repo.saveInterview(interview);
	};
	public Interview modifyStatusInterview(Interview interview, int status) {
		Interview_Status newStatus = new Interview_Status(status);
		interview.setStatus(newStatus);
		return repo.saveInterview(interview);
	}

	

}
