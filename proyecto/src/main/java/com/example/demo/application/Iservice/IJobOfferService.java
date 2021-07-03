package com.example.demo.application.Iservice;

import java.util.List;

import com.example.demo.domain.JobOffer;
import com.example.demo.domain.valueObjects.Job_Offer_Id;
import com.example.demo.domain.valueObjects.Job_Status;
import com.example.demo.domain.valueObjects.User_Id;


public interface IJobOfferService {
	List<JobOffer> findJobOffer();
	List<JobOffer> findJobOffer(User_Id employer);
	JobOffer findJobOffer(Job_Offer_Id id);
	JobOffer newJobOffer(JobOffer jobOffer);
	List<JobOffer> findJobOffer(Job_Status status);
	JobOffer updateJobOfferStatus(JobOffer jobOffer, Job_Status status);
}
