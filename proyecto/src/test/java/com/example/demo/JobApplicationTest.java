package com.example.demo;

import java.sql.Date;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.application.Iservice.IJobApplication;
import com.example.demo.infraestructure.api.controller.JobApplicationRestController;
import com.example.demo.infraestructure.database.JPAClasses.JobApplicationJPA;


@RunWith(MockitoJUnitRunner.class)
public class JobApplicationTest {

	@Mock
	private IJobApplication jobapplicationinterface;
	
	@Mock
	private JobApplicationRestController jobapplicationcontroller;
	
	@Mock
	private JobApplicationJPA jobapplicationjpa;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(jobapplicationcontroller);
	}
	
	@Test
	public void AllData() {
		Long id;
		String status;
		Date date_application;
		Long employee_id;
		Long location_id;
	}
}
