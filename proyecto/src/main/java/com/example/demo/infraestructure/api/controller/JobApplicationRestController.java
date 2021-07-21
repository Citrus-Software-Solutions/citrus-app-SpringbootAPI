package com.example.demo.infraestructure.api.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.application.service.JobApplicationService;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.Employee_Id;
import com.example.demo.infraestructure.api.DTO.ApplicationDTO;
import com.example.demo.infraestructure.api.mapper.AddressMapperDTO;
import com.example.demo.infraestructure.api.mapper.ContactInformationMapperDTO;
import com.example.demo.infraestructure.api.mapper.EmployeeMapperDTO;
import com.example.demo.infraestructure.api.mapper.EmployerMapperDTO;
import com.example.demo.infraestructure.api.mapper.JobApplicationMapperDTO;
import com.example.demo.infraestructure.api.mapper.JobOfferMapperDTO;
import com.example.demo.infraestructure.api.mapper.ReferenceMapperDTO;
import com.example.demo.infraestructure.api.mapper.SkillMapperDTO;
import com.example.demo.infraestructure.api.mapper.WorkExperienceMapperDTO;
import com.example.demo.infraestructure.database.JPAClasses.ApplicationJPA;
import com.example.demo.infraestructure.database.adapter.PersistanceAdapterJobApplication;
import com.example.demo.infraestructure.database.mapper.ApplicationMapperJPA;

@RestController
@RequestMapping("/job-application")
public class JobApplicationRestController {
	
	
	final PersistanceAdapterJobApplication repo;
	
	AddressMapperDTO Address = new AddressMapperDTO();
	WorkExperienceMapperDTO work= new WorkExperienceMapperDTO(); 
	SkillMapperDTO skill= new SkillMapperDTO();
	ReferenceMapperDTO reference = new ReferenceMapperDTO();
	EmployeeMapperDTO employee = new EmployeeMapperDTO(Address, work, skill, reference);
	
	ContactInformationMapperDTO contact = new ContactInformationMapperDTO();
	EmployerMapperDTO employer = new EmployerMapperDTO(Address, skill, contact);
	
	JobOfferMapperDTO jobOfferDTO = new JobOfferMapperDTO(employee, Address, skill, employer);
	
	JobApplicationMapperDTO mapperDTO = new JobApplicationMapperDTO(employee, jobOfferDTO);
	
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