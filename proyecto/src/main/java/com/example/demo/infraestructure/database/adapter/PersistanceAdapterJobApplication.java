package com.example.demo.infraestructure.database.adapter;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import com.example.demo.application.Iservice.IJobApplication;
import com.example.demo.domain.Application;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.Employee_Id;
import com.example.demo.infraestructure.database.JPAClasses.ApplicationJPA;
import com.example.demo.infraestructure.database.mapper.ApplicationMapperJPA;
import com.example.demo.infraestructure.database.repository.JobApplicationRepository;

@Service
public class PersistanceAdapterJobApplication implements IJobApplication{
	
	public PersistanceAdapterJobApplication(JobApplicationRepository jobRepo) {
		this.jobRepo = jobRepo;
	}
	
	final JobApplicationRepository jobRepo;	
	
	@Autowired
	ApplicationMapperJPA jobApplicationMapper;
	@Override
	public List<Application> findJobApplication() {
		return (jobApplicationMapper.toDomain(jobRepo.findAll()));
	}
	@Override
	public Application findJobApplication(Application_Id id) {
		Integer apid = id.getValue();
		return jobApplicationMapper.toDomain(jobRepo.findById(apid).orElseThrow(EntityNotFoundException::new));
	}
	@Override
	public Application newJobApplication(ApplicationJPA jobApplication) {
		ApplicationJPA result = jobRepo.save(jobApplication);
		return jobApplicationMapper.toDomain(result);
	}
	@Override
	public List<Application> findJobApplication(Employee_Id employee) {
		return (jobApplicationMapper.toDomain(jobRepo.findByEmployeeId(employee.getValue())));
	}
	
}
