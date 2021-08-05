package com.citrus.api.infraestructure.database.adapter;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citrus.api.application.providers.InterviewRepo;
import com.citrus.api.domain.Interview;
import com.citrus.api.domain.valueObjects.Interview_Id;
import com.citrus.api.infraestructure.database.JPAClasses.InterviewJPA;
import com.citrus.api.infraestructure.database.mapper.InterviewMapperJPA;
import com.citrus.api.infraestructure.database.repository.InterviewRepository;


@Service
public class PersistanceAdapterInterview implements InterviewRepo{
	
	public PersistanceAdapterInterview(InterviewRepository interviewRepo) {
		this.interviewRepo = interviewRepo;
	}
	
	final InterviewRepository interviewRepo;
	@Autowired
	InterviewMapperJPA mapper;

	@Override
	public List<Interview> findInterview() {
		return (mapper.toDomain(interviewRepo.findAll()));
	}

	@Override
	public Interview findInterview(Interview_Id id) {
		return(mapper.toDomain(interviewRepo.findById(id.getValue()).orElseThrow(EntityNotFoundException::new)));
	}

	@Override
	public Interview saveInterview(Interview interview) {	
		InterviewJPA result = interviewRepo.save(mapper.toJPA(interview));
		return mapper.toDomain(result);
	}	
	
	
	
}
