package com.example.demo.infraestructure.database.adapter;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.application.Iservice.IInterview;

import com.example.demo.domain.Interview;

import com.example.demo.domain.valueObjects.Interview_Id;
import com.example.demo.infraestructure.database.JPAClasses.InterviewJPA;
import com.example.demo.infraestructure.database.mapper.InterviewMapperJPA;
import com.example.demo.infraestructure.database.repository.InterviewRepository;


@Service
public class PersistanceAdapterInterview implements IInterview{
	
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
