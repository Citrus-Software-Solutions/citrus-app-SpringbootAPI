package com.example.demo.infraestructure.database.adapter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.example.demo.application.Iservice.IJobApplication;
import com.example.demo.domain.Application;
import com.example.demo.domain.valueObjects.Aplication_Id;
import com.example.demo.domain.valueObjects.User_Id;
import com.example.demo.infraestructure.database.JPAClasses.JobApplicationJPA;
import com.example.demo.infraestructure.database.JPAClasses.JobOfferJPA;
import com.example.demo.infraestructure.database.mapper.JobApplicationMapperJPA;
import com.example.demo.infraestructure.database.mapper.JobOfferMapperJPA;
import com.example.demo.infraestructure.database.repository.EmployeeRepository;
import com.example.demo.infraestructure.database.repository.JobApplicationRepository;
import com.example.demo.infraestructure.database.repository.JobOfferRepository;
import com.example.demo.infraestructure.database.repository.LocationRepository;

@Service
@Configurable
public class PersistanceAdapterJobApplication implements IJobApplication{
	
	@Autowired
	JobApplicationRepository jobRepo;
	@Autowired
	JobApplicationMapperJPA jobApplicationMapper;
	@Override
	public List<Application> findJobApplication() {
		return (jobApplicationMapper.toDomain(jobRepo.findAll()));
	}
	@Override
	public Application findJobApplication(Aplication_Id id) {
		Long apid = id.getValue();
		return (jobApplicationMapper.toDomain(jobRepo.getById(apid)));
	}
	@Override
	public Application newJobOffer(Application jobApplication) {
		JobApplicationJPA result = jobRepo.save(jobApplicationMapper.toJPA(jobApplication));
		return jobApplicationMapper.toDomain(result);
	}
	
}
