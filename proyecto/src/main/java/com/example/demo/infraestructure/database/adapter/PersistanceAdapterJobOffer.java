package com.example.demo.infraestructure.database.adapter;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.application.Iservice.IJobOfferService;
import com.example.demo.domain.JobOffer;
import com.example.demo.domain.valueObjects.Job_Offer_Id;
import com.example.demo.domain.valueObjects.Job_Offer_Name;
import com.example.demo.domain.valueObjects.Job_Status;
import com.example.demo.domain.valueObjects.User_Id;
import com.example.demo.infraestructure.database.JPAClasses.EmployerJPA;
import com.example.demo.infraestructure.database.JPAClasses.JobOfferJPA;
import com.example.demo.infraestructure.database.JPAClasses.LocationJPA;
import com.example.demo.infraestructure.database.mapper.JobOfferMapperJPA;
import com.example.demo.infraestructure.database.repository.EmployerRepository;
import com.example.demo.infraestructure.database.repository.JobOfferRepository;
import com.example.demo.infraestructure.database.repository.LocationRepository;

@Service
@Configurable
public class PersistanceAdapterJobOffer implements IJobOfferService{

	
	@Autowired
	JobOfferRepository jobRepo;
	@Autowired
	LocationRepository locationRepo;
	@Autowired
	EmployerRepository employerRepo;
	@Autowired
	JobOfferMapperJPA jobOfferMapper;
	@Override
	public List<JobOffer> findJobOffer() {		
		return (jobOfferMapper.toDomain(jobRepo.findAll()));
	}
	@Override
	
	public List<JobOffer> findJobOffer(User_Id id) {
		Long idEmployer = id.getValue();
		return(jobOfferMapper.toDomain(jobRepo.findByEmployerId(idEmployer)));
	}
	@Override
	public JobOffer newJobOffer(JobOffer jobOffer) {
		JobOfferJPA result = jobRepo.save(jobOfferMapper.toJPA(jobOffer));
		return jobOfferMapper.toDomain(result);
	}
	@Override
	public List<JobOffer> findJobOffer(Job_Status s) {
		String status = s.getValue();
		return(jobOfferMapper.toDomain(jobRepo.findByStatus(status)));
	}
	@Override
	public JobOffer updateJobOfferStatus(JobOffer jobOffer, Job_Status status) {
		jobOffer.setStatus(status);
		JobOfferJPA result = jobRepo.save(jobOfferMapper.toJPA(jobOffer));
		return jobOfferMapper.toDomain(result);
	}
	@Override
	public JobOffer findJobOffer(Job_Offer_Id id) {
		return jobOfferMapper.toDomain(jobRepo.findById(id.getValue()).orElseThrow(EntityNotFoundException::new));
	}

}
