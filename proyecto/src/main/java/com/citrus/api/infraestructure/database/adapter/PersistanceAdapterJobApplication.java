package com.citrus.api.infraestructure.database.adapter;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.citrus.api.application.providers.JobApplicationRepo;
import com.citrus.api.domain.Application;
import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.infraestructure.database.JPAClasses.ApplicationJPA;
import com.citrus.api.infraestructure.database.mapper.ApplicationMapperJPA;
import com.citrus.api.infraestructure.database.repository.JobApplicationRepository;

@Service
public class PersistanceAdapterJobApplication implements JobApplicationRepo{
	
	public PersistanceAdapterJobApplication(JobApplicationRepository jobRepo) {
		this.jobRepo = jobRepo;
	}
	
	final JobApplicationRepository jobRepo;	
	
	@Autowired
	ApplicationMapperJPA mapper;
	@Override
	public List<Application> findJobApplication() {
		return (mapper.toDomain(jobRepo.findAll()));
	}
	@Override
	public Application findJobApplication(Application_Id id) {
		Integer apid = id.getValue();
		return mapper.toDomain(jobRepo.findById(apid).orElseThrow(EntityNotFoundException::new));
	}
	@Override
	public Application saveJobApplication(Application jobApplication) {
		ApplicationJPA result = jobRepo.save(mapper.toJPA(jobApplication));
		return mapper.toDomain(result);
	}
	@Override
	public List<Application> findJobApplication(Employee_Id employee) {
		return (mapper.toDomain(jobRepo.findByEmployeeId(employee.getValue())));
	}
	
}
