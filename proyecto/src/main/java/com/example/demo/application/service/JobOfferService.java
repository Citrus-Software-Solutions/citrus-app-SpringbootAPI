package com.example.demo.application.service;

import java.util.List;

import com.example.demo.application.Iservice.IJobOfferService;
import com.example.demo.domain.JobOffer;
import com.example.demo.domain.valueObjects.Job_Offer_Id;
import com.example.demo.domain.valueObjects.Job_Status;
import com.example.demo.domain.valueObjects.User_Id;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JobOfferService {
	
	private IJobOfferService repo;
	
	public JobOfferService(IJobOfferService repo){
		this.repo = repo;
	}
	
	public List<JobOffer> findJobOffer(){
		return repo.findJobOffer();
	}
	public List<JobOffer> findJobOffer(User_Id employer){
		return repo.findJobOffer(employer);
	}
	public JobOffer findJobOffer(Job_Offer_Id id){
		return repo.findJobOffer(id);
	}
	public JobOffer newJobOffer(JobOffer jobOffer){
		return repo.newJobOffer(jobOffer);
	}
	public List<JobOffer> findJobOffer(Job_Status status) {
		return repo.findJobOffer(status);
	}
	public JobOffer updateJobOfferStatus(JobOffer jobOffer, Job_Status status) {
		jobOffer.setStatus(status);
		return repo.updateJobOfferStatus(jobOffer, status);
	}

}
