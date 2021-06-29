package com.example.demo.infraestucture.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.application.repository.JobOfferRepository;
import com.example.demo.domain.JobOffer;
import com.example.demo.domain.valueobjects.Job_Offer_Id;
import com.example.demo.domain.valueobjects.Job_Status;
import com.example.demo.domain.valueobjects.User_Id;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class JobOfferJPARepository implements JobOfferRepository{
	
	@Autowired	
	private SpringDataJobOfferRepository jobOfferRepository;
	private JobOfferJPAMapper jobOfferMapper;

	@Override
	public List<JobOffer> findAll() {
		return jobOfferMapper.toDomain(jobOfferRepository.findAll());
	}
	@Override
	public List<JobOffer> findByEmployerId(User_Id id) {
		return jobOfferMapper.toDomain(jobOfferRepository.findByEmployerId(id.getValue()));
	}
	@Override
	public JobOffer save(JobOffer jobOffer) {
		return jobOfferMapper.toDomain(jobOfferRepository.save(jobOfferMapper.toDbo(jobOffer)));
	}
	@Override
	public List<JobOffer> findByStatus(Job_Status status) {
		return jobOfferMapper.toDomain(jobOfferRepository.findByStatus(status.getValue()));
	}
	@Override
	public JobOffer updateStatus(Job_Offer_Id id, Job_Status status) {
		if (status != null && jobOfferRepository.existsById(id.getValue())){
			JobOfferJPA oldStatus = jobOfferRepository.getOne(id.getValue());
			oldStatus.setStatus("Published");
			return jobOfferMapper.toDomain(jobOfferRepository.save(oldStatus));
		}
		return null;
	}
	

}




	
	

