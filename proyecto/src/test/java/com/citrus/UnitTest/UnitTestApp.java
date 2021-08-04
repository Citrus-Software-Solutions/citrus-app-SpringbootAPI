package com.citrus.UnitTest;


import static org.mockito.Mockito.when;

import java.text.ParseException;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.citrus.api.application.commands.CreateJobApplicationCommand;
import com.citrus.api.application.providers.JobApplicationRepo;
import com.citrus.api.application.service.JobApplicationByIdFinder;
import com.citrus.api.application.service.JobApplicationCreator;
import com.citrus.api.domain.Application;
import com.citrus.domain.Application.ApplicationMother;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitTestApp {

	@Mock
	private JobApplicationRepo repo;
	
	@InjectMocks
	private JobApplicationCreator jobapplicationservice;
	
	
	  @BeforeEach
	  void initUseCase() {
		  jobapplicationservice = new JobApplicationCreator(repo);
		  
	  }
	
	
		@Test
	    public void savedJobApplicationService() throws ParseException{
			Application application = ApplicationMother.create();
			JobApplicationRepo mock = org.mockito.Mockito.mock(JobApplicationRepo.class);
			when(mock.saveJobApplication(application)).thenReturn(application);
			Assertions.assertNotNull(application);
		}
}
