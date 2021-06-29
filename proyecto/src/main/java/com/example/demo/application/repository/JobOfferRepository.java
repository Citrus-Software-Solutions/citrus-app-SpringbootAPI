package com.example.demo.application.repository;

import com.example.demo.domain.JobOffer;
import com.example.demo.domain.valueobjects.Job_Offer_Id;
import com.example.demo.domain.valueobjects.Job_Status;
import com.example.demo.domain.valueobjects.User_Id;

import java.util.List;



public interface JobOfferRepository {

	List<JobOffer> findAll();
	List<JobOffer> findByEmployerId(User_Id id);
	JobOffer save(JobOffer jobOffer);
	List<JobOffer> findByStatus(Job_Status status);
	JobOffer updateStatus(Job_Offer_Id id, Job_Status status);
   

}