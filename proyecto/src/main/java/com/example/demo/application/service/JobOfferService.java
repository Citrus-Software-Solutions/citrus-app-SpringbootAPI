package com.example.demo.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.application.repository.JobOfferRepository;
import com.example.demo.domain.JobOffer;
import com.example.demo.domain.valueobjects.Job_Offer_Id;
import com.example.demo.domain.valueobjects.Job_Status;
import com.example.demo.domain.valueobjects.User_Id;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Service
@Slf4j
public class JobOfferService {
	
	@Autowired
	private JobOfferRepository jobOfferRepository;
	
	public List<JobOffer> findJobOffer() {
		return jobOfferRepository.findAll();
	};
	public List<JobOffer> findJobOffer(User_Id id) {
		return jobOfferRepository.findByEmployerId(id);
	};
	public JobOffer saveJobOffer(JobOffer jobOffer){
		return jobOfferRepository.save(jobOffer);
	};
	public List<JobOffer> findJobOfferByStatus(Job_Status status){
		return jobOfferRepository.findByStatus(status);
	};
	public JobOffer updateJobOfferStatus(Job_Offer_Id id, Job_Status status){
		return jobOfferRepository.updateStatus(id, status);
	};	
	
}
