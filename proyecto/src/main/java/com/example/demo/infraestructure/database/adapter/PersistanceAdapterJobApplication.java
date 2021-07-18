package com.example.demo.infraestructure.database.adapter;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.example.demo.application.Iservice.IJobApplication;
import com.example.demo.domain.Application;
import com.example.demo.domain.valueObjects.Application_Id;
import com.example.demo.domain.valueObjects.User_Id;
import com.example.demo.infraestructure.database.JPAClasses.ApplicationJPA;
import com.example.demo.infraestructure.database.JPAClasses.JobOfferJPA;
import com.example.demo.infraestructure.database.mapper.ApplicationMapperJPA;
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
	ApplicationMapperJPA jobApplicationMapper;
	@Override
	public List<Application> findJobApplication() {
		return (jobApplicationMapper.toDomain(jobRepo.findAll()));
	}
	@Override
	public Application findJobApplication(Application_Id id) {
		Long apid = id.getValue();
		return jobApplicationMapper.toDomain(jobRepo.findById(apid).orElseThrow(EntityNotFoundException::new));
	}
	@Override
	public Application newJobApplication(Application jobApplication) {
		ApplicationJPA result = jobRepo.save(jobApplicationMapper.toJPA(jobApplication));
		return jobApplicationMapper.toDomain(result);
	}
	@Override
	public List<Application> findJobApplication(User_Id employee) {
		long employeeid = employee.getValue();
		return (jobApplicationMapper.toDomain(jobRepo.findByEmployeeId(employeeid)));
	}
	
}
