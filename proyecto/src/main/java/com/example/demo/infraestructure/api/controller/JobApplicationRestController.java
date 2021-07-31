package com.example.demo.infraestructure.api.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.application.service.JobApplicationService;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.Employee_Id;
import com.example.demo.infraestructure.api.DTO.ApplicationDTO;
import com.example.demo.infraestructure.api.mapper.JobApplicationMapperDTO;
import com.example.demo.infraestructure.database.JPAClasses.ApplicationJPA;
import com.example.demo.infraestructure.database.adapter.PersistanceAdapterJobApplication;
import com.example.demo.infraestructure.database.mapper.ApplicationMapperJPA;
import com.example.demo.infraestructure.http.mapper.EmployeeMapperHTTP;
import com.example.demo.infraestructure.http.mapper.JobOfferMapperHTTP;

@RestController
@RequestMapping("/job-application")
public class JobApplicationRestController {
	
	
	final PersistanceAdapterJobApplication repo;
	
	
	
	RestTemplate resttemplate = new RestTemplate();
	JobOfferMapperHTTP jobOfferDTO = new JobOfferMapperHTTP(resttemplate);
	EmployeeMapperHTTP EmployeeDTO = new EmployeeMapperHTTP(resttemplate);
	JobApplicationMapperDTO mapperDTO = new JobApplicationMapperDTO( jobOfferDTO,EmployeeDTO );
	
	ApplicationMapperJPA mapperJPA =  new ApplicationMapperJPA();
	
	public JobApplicationRestController(PersistanceAdapterJobApplication repo) {
	super();
	this.repo = repo;
	}



	@RequestMapping(value="", method = RequestMethod.GET)
	 public List<ApplicationDTO> hey(){
		JobApplicationService jobApplicationService = new JobApplicationService(repo);
		
		return(mapperDTO.toDTO(jobApplicationService.findJobApplication()));
  }
	
	@RequestMapping(value="/employee/{employee_id}", method=RequestMethod.GET)
    public List<ApplicationDTO> FindByIdEmployee(@PathVariable("employee_id") Integer id){
		JobApplicationService jobApplicationService = new JobApplicationService(repo);
		return mapperDTO.toDTO(jobApplicationService.findJobApplication(new Employee_Id(id)));
 }
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ApplicationDTO FindByIdJob_Application(@PathVariable("id") Integer id){
		JobApplicationService jobApplicationService = new JobApplicationService(repo);
		return(mapperDTO.toDTO(jobApplicationService.findJobApplication(new  Application_Id(id))));
 }
	
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public ApplicationDTO newJobApplication(@RequestBody ApplicationJPA job_appliaction) {
		JobApplicationService jobApplicationService = new JobApplicationService(repo);
		return(mapperDTO.toDTO(jobApplicationService.newJobApplication(job_appliaction)));
	}

}