package com.example.demo.infraestructure.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.Iservice.IJobApplication;
import com.example.demo.application.Iservice.IJobOfferService;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.Job_Offer_Status;
import com.example.demo.domain.valueObjects.User_Id;
import com.example.demo.infraestructure.api.DTO.ApplicationDTO;
import com.example.demo.infraestructure.api.DTO.JobOfferDTO;
import com.example.demo.infraestructure.api.mapper.JobApplicationMapperDTO;
import com.example.demo.infraestructure.api.mapper.JobOfferMapperDTO;
import com.example.demo.infraestructure.database.JPAClasses.ApplicationJPA;
import com.example.demo.infraestructure.database.JPAClasses.JobOfferJPA;
import com.example.demo.infraestructure.database.mapper.ApplicationMapperJPA;
import com.example.demo.infraestructure.database.mapper.JobOfferMapperJPA;

@RestController
@RequestMapping("/job-application")
public class JobApplicationRestController {
	
	@Autowired
	private IJobApplication jobApplicationService;
	@Autowired
	private JobApplicationMapperDTO mapperDTO;
	@Autowired
    private ApplicationMapperJPA mapperJPA;

	
	@RequestMapping(value="", method = RequestMethod.GET)
	 public List<ApplicationDTO> hey(){
			return(mapperDTO.toDTO(jobApplicationService.findJobApplication()));
  }
	
	@RequestMapping(value="/employee/{employee_id}", method=RequestMethod.GET)
    public List<ApplicationDTO> FindByIdEmployee(@PathVariable("employee_id") Long id){
		return(mapperDTO.toDTO(jobApplicationService.findJobApplication(new  User_Id(id))));
 }
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ApplicationDTO FindByIdJob_Application(@PathVariable("id") Long id){
		return(mapperDTO.toDTO(jobApplicationService.findJobApplication(new  Application_Id(id))));
 }
	
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public ApplicationDTO newJobApplication(@RequestBody ApplicationJPA job_appliaction) {
		return(mapperDTO.toDTO(jobApplicationService.newJobApplication(mapperJPA.toDomain(job_appliaction))));
	}

}
