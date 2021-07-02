package com.example.demo.application.Iservice;

import java.util.List;

import com.example.demo.domain.JobOffer;
import com.example.demo.domain.valueObjects.Job_Status;
import com.example.demo.domain.valueObjects.User_Id;


public interface IJobOfferService {
	List<JobOffer> findJobOffer();
	List<JobOffer> findJobOffer(User_Id employer);
	JobOffer newJobOffer(JobOffer jobOffer);
	List<JobOffer> findJobOffer(Job_Status status);
	JobOffer updateJob(JobOffer jobOffer, Job_Status status);
}
