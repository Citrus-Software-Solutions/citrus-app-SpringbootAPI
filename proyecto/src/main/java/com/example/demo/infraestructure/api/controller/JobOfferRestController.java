package com.example.demo.infraestructure.api.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.Iservice.IJobOfferService;
import com.example.demo.infraestructure.database.JPAClasses.JobOfferJPA;
import com.example.demo.infraestructure.database.mapper.JobOfferMapperJPA;
import com.example.demo.infraestructure.api.DTO.JobOfferDTO;
import com.example.demo.infraestructure.api.mapper.JobOfferMapperDTO;
import com.example.demo.domain.valueObjects.Job_Status;
import com.example.demo.domain.valueObjects.User_Id;

@RestController
@RequestMapping("/JobOffer")
public class JobOfferRestController {
	
	@Autowired
	private IJobOfferService jobOfferService;
	
	@Autowired private JobOfferMapperDTO mapperDTO;
    
	@Autowired private JobOfferMapperJPA mapperJPA;

	//finds all job offers
	@RequestMapping(value="", method = RequestMethod.GET)
	 public List<JobOfferDTO> findAll(){
			return(mapperDTO.toDTO(jobOfferService.findJobOffer()));
  }
	//finds job offers by employer id
	@RequestMapping(value="/{employer_id}", method=RequestMethod.GET)
    public List<JobOfferDTO> findByIdJob_Offer(@PathVariable("employer_id") Long employer_id){
		return(mapperDTO.toDTO(jobOfferService.findJobOffer(new  User_Id(employer_id))));
 }
	//finds job offer by status
	@RequestMapping(value="/ByStatus/{status}", method=RequestMethod.GET)
    public  List<JobOfferDTO> findByPublishedStatus(@PathVariable("status") String status){
		return(mapperDTO.toDTO(jobOfferService.findJobOffer(new  Job_Status(status))));
    }
	
	//create a new job offer
	@RequestMapping(value="", method=RequestMethod.POST)
	public JobOfferDTO newJobOffer(@RequestBody JobOfferJPA jobOffer) {
		return(mapperDTO.toDTO(jobOfferService.newJobOffer(mapperJPA.toDomain(jobOffer))));
		
	}
	//set status of a job offer
	 @RequestMapping(method=RequestMethod.PUT, value = "/SetStatus/{status}")
		public JobOfferDTO updateJob_Status(@RequestBody JobOfferJPA jobOffer, @PathVariable("status") String status){
		return(mapperDTO.toDTO(jobOfferService.updateJobOfferStatus(mapperJPA.toDomain(jobOffer), new Job_Status(status))));
	 }
	

}

	
	


