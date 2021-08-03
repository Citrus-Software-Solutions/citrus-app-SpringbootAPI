package com.citrus.api.infraestructure.database.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.citrus.api.application.commands.CreateInterviewCommand;
import com.citrus.api.application.queries.JobApplicationByIdQuery;
import com.citrus.api.application.service.JobApplicationByIdFinder;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.Interview;
import com.citrus.api.domain.StaffMember;
import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.api.domain.valueObjects.Date_Format;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.domain.valueObjects.Interview_AccessURL;
import com.citrus.api.domain.valueObjects.Interview_Duration;
import com.citrus.api.domain.valueObjects.Interview_Id;
import com.citrus.api.domain.valueObjects.Interview_Status;
import com.citrus.api.domain.valueObjects.StaffMember_Id;
import com.citrus.api.infraestructure.database.JPAClasses.InterviewJPA;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterJobApplication;

@Service
public class InterviewMapperJPA {
	
	final PersistanceAdapterJobApplication repo;
	public InterviewMapperJPA(PersistanceAdapterJobApplication repo) {
		super();
		this.repo = repo;
		}
	
	
	
	public Interview toDomain(InterviewJPA jpa) {
		JobApplicationByIdFinder finder = new JobApplicationByIdFinder(repo);
		Interview domain = new Interview();
		domain.setAccessURL(new Interview_AccessURL(jpa.getAccessURL()));
		domain.setApplication(finder.findApplicationById(new JobApplicationByIdQuery(new Application_Id (jpa.getJobApplicationId()))));
		domain.setDuration(new Interview_Duration(jpa.getDuration()));
		domain.setEmployee(new Employee(new Employee_Id(jpa.getEmployeeId())));
		domain.setId(new Interview_Id(jpa.getId()));
		domain.setStaffMember(new StaffMember(new StaffMember_Id(jpa.getStaffMemberId())));
		domain.setStartDate(new Date_Format(jpa.getStartDate()));
		domain.setStatus(new Interview_Status(jpa.getStatus()));
		return domain;
	}
	
	public CreateInterviewCommand toCommand(InterviewJPA jpa) {
		System.out.println("Employee"+jpa.getEmployeeId()); 
		CreateInterviewCommand command =  new CreateInterviewCommand(
				new Interview_Id(jpa.getId()),
				new Employee_Id(jpa.getEmployeeId()),
				new StaffMember_Id(jpa.getStaffMemberId()),
				new Application_Id(jpa.getJobApplicationId()),
				new Date_Format(jpa.getStartDate()),
				new Interview_Duration(jpa.getDuration()),
				new Interview_AccessURL(jpa.getAccessURL()),
				new Interview_Status(jpa.getStatus())	
				);
		return command;
		
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
