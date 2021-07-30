package com.example.demo.infraestructure.database.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.application.service.JobApplicationService;
import com.example.demo.domain.Application;
import com.example.demo.domain.Interview;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.Date_Format;
import com.example.demo.domain.valueObjects.Interview_AccessURL;
import com.example.demo.domain.valueObjects.Interview_Duration;
import com.example.demo.domain.valueObjects.Interview_Id;
import com.example.demo.domain.valueObjects.Interview_Status;
import com.example.demo.infraestructure.database.JPAClasses.ApplicationJPA;
import com.example.demo.infraestructure.database.JPAClasses.InterviewJPA;
import com.example.demo.infraestructure.database.adapter.PersistanceAdapterJobApplication;

@Service
public class InterviewMapperJPA {
	
	final PersistanceAdapterJobApplication repo;
	public InterviewMapperJPA(PersistanceAdapterJobApplication repo) {
		super();
		this.repo = repo;
		}
	
	
	
	public Interview toDomain(InterviewJPA jpa) {
		JobApplicationService jobApplicationService = new JobApplicationService(repo);
		Interview domain = new Interview();
		domain.setAccessURL(new Interview_AccessURL(jpa.getAccessURL()));
		domain.setApplication(jobApplicationService.findJobApplication(new Application_Id (jpa.getJobApplicationId())));
		domain.setDuration(new Interview_Duration(jpa.getDuration()));
		domain.setEmployee(null);
		domain.setId(new Interview_Id(jpa.getId()));
		domain.setStaffMember(null);
		domain.setStartDate(new Date_Format(jpa.getStartDate()));
		domain.setStatus(new Interview_Status(jpa.getStatus()));
		
		
		
		return domain;
	}
	
	public InterviewJPA toJPA(Interview domain) {

		InterviewJPA jpa = new InterviewJPA();
		
		jpa.setAccessURL(domain.getAccessURL().getValue());
		jpa.setDuration(domain.getDuration().getValue());
		jpa.setEmployeeId(domain.getEmployee().getId().getValue());
		jpa.setId(domain.getId().getValue());
		jpa.setJobApplicationId(domain.getApplication().getId().getValue());
		jpa.setStaffMemberId(domain.getStaffMember().getId().getValue());
		jpa.setStartDate(domain.getStartDate().getValue());
		jpa.setStatus(domain.getStatus().getValue());
		
		return jpa;
		
	}
	
	
	public List<Interview> toDomain(List<InterviewJPA> jpas){
		List<Interview> Interviews = new ArrayList<Interview>();
		for (int i = 0; i < jpas.size(); i++) {
			Interviews.add(toDomain(jpas.get(i)));
        }
		
		return Interviews;
	}
	

}
