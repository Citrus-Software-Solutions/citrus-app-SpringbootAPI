package com.example.demo.infraestructure.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.Iservice.IJobOfferService;
import com.example.demo.application.service.JobOfferService;
import com.example.demo.domain.JobOffer;
import com.example.demo.infraestructure.database.JPAClasses.JobOfferJPA;
import com.example.demo.infraestructure.database.adapter.PersistanceAdapterJobOffer;
import com.example.demo.infraestructure.database.mapper.JobOfferMapperJPA;
import com.example.demo.infraestructure.database.repository.EmployerRepository;
import com.example.demo.infraestructure.database.repository.JobOfferRepository;
import com.example.demo.infraestructure.database.repository.LocationRepository;
import com.example.demo.infraestructure.api.DTO.JobOfferDTO;
import com.example.demo.infraestructure.api.mapper.JobOfferMapperDTO;
import com.example.demo.domain.valueObjects.Job_Status;
import com.example.demo.domain.valueObjects.User_Id;

@RestController
@RequestMapping("/JobOffer")
public class JobOfferRestController {
	
	@Autowired
	private IJobOfferService jobOfferService;
	
	@Autowired JobOfferMapperDTO mapperDTO;
    
	@Autowired private JobOfferMapperJPA mapperJPA;

	
	@RequestMapping(value="", method = RequestMethod.GET)
	 public List<JobOfferDTO> findAll(){
			return(mapperDTO.toDTO(jobOfferService.findJobOffer()));
  }
	
	@RequestMapping(value="/{employer_id}", method=RequestMethod.GET)
    public List<JobOfferDTO> findByIdJob_Offer(@PathVariable("employer_id") Long employer_id){
		return(mapperDTO.toDTO(jobOfferService.findJobOffer(new  User_Id(employer_id))));
 }
	@RequestMapping(value="ByStatus/{status}", method=RequestMethod.GET)
    public  List<JobOfferDTO> findByPublishedStatus(@PathVariable("status") String status){
		return(mapperDTO.toDTO(jobOfferService.findJobOffer(new  Job_Status(status))));
    }
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public JobOfferDTO newJobOffer(@RequestBody JobOfferJPA job_offer) {
		return(mapperDTO.toDTO(jobOfferService.newJobOffer(mapperJPA.toDomain(job_offer))));
		
	}
	 @RequestMapping(method=RequestMethod.PUT, value = "/{id}")
		public JobOfferDTO updateJob_Status(@PathVariable("id") Long id, @RequestBody JobOfferJPA status){
			return null;
		}
	

}

	
	


