package com.example.demo.infraestructure.api.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.service.InterviewService;
import com.example.demo.application.service.JobApplicationService;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.Employee_Id;
import com.example.demo.domain.valueObjects.Interview_Id;
import com.example.demo.infraestructure.api.DTO.ApplicationDTO;
import com.example.demo.infraestructure.api.DTO.InterviewDTO;
import com.example.demo.infraestructure.api.mapper.AddressMapperDTO;
import com.example.demo.infraestructure.api.mapper.ContactInformationMapperDTO;
import com.example.demo.infraestructure.api.mapper.EmployeeMapperDTO;
import com.example.demo.infraestructure.api.mapper.EmployerMapperDTO;
import com.example.demo.infraestructure.api.mapper.InterviewMapperDTO;
import com.example.demo.infraestructure.api.mapper.JobApplicationMapperDTO;
import com.example.demo.infraestructure.api.mapper.JobOfferMapperDTO;
import com.example.demo.infraestructure.api.mapper.ReferenceMapperDTO;
import com.example.demo.infraestructure.api.mapper.SkillMapperDTO;
import com.example.demo.infraestructure.api.mapper.WorkExperienceMapperDTO;
import com.example.demo.infraestructure.database.JPAClasses.ApplicationJPA;
import com.example.demo.infraestructure.database.JPAClasses.InterviewJPA;
import com.example.demo.infraestructure.database.adapter.PersistanceAdapterInterview;
import com.example.demo.infraestructure.database.adapter.PersistanceAdapterJobApplication;
import com.example.demo.infraestructure.database.mapper.ApplicationMapperJPA;
import com.example.demo.infraestructure.database.mapper.InterviewMapperJPA;

@RestController
@RequestMapping("/interview")
public class InterviewRestController {
	
	
	final PersistanceAdapterInterview repo;
	
	public InterviewRestController(PersistanceAdapterInterview repo) {
	super();
	this.repo = repo;
	}
	
	@Autowired
	InterviewMapperDTO mapperDTO;
	@Autowired
	InterviewMapperJPA mapperJPA;
	
	

	@RequestMapping(value="", method = RequestMethod.GET)
	 public List<InterviewDTO> findInterviews(){
		InterviewService interviewService = new InterviewService(repo);
		return(mapperDTO.toDTO(interviewService.findInterview()));
  }
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public InterviewDTO newInterview(@RequestBody InterviewJPA interview) {
		InterviewService interviewService = new InterviewService(repo);
		return(mapperDTO.toDTO(interviewService.schedule(mapperJPA.toDomain(interview))));
	}
	
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
    public InterviewDTO findByIdInterview(@PathVariable("id") Integer id){
		InterviewService interviewService = new InterviewService(repo);
		return(mapperDTO.toDTO(interviewService.findInterview(new Interview_Id(id))));
 }
	@RequestMapping(value="/{id}/date/{date}", method=RequestMethod.PUT)
    public InterviewDTO rescheduleInterview(@PathVariable("id") Integer id, Date date){
		InterviewService interviewService = new InterviewService(repo);
		return(mapperDTO.toDTO(interviewService.rescheduleInterview(interviewService.findInterview(new Interview_Id(id)), date)));
 }
	@RequestMapping(value="/{id}/status/{status}", method=RequestMethod.PUT)
    public InterviewDTO modifyStatus(@PathVariable("id") Integer id, int status){
		InterviewService interviewService = new InterviewService(repo);
		return(mapperDTO.toDTO(interviewService.modifyStatusInterview(interviewService.findInterview(new Interview_Id(id)), status)));
 }	

}