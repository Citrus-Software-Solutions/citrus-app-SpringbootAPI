package com.example.demo;

import static org.mockito.Mockito.lenient;

import java.text.ParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.citrus.api.application.commands.CreateJobApplicationCommand;
import com.citrus.api.application.providers.JobApplicationRepo;
import com.citrus.api.application.service.JobApplicationCreator;
import com.citrus.api.domain.Application;
import com.example.demo.resources.TestResourcesApplication;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes={com.citrus.api.ProyectoApplication.class})
public class ApplicationUnitTest {

	@Mock
	private JobApplicationRepo repo;
	
	@InjectMocks
	private JobApplicationCreator application;
	
	TestResourcesApplication resource = new TestResourcesApplication ();
	
	  @BeforeEach
	  void initUseCase() {
		  application = new JobApplicationCreator(repo);
	  }
	  
	 @Test
	 public void savedJobOfferService() throws ParseException{
         Application app = resource.JobApplicationCreate();
         CreateJobApplicationCommand command = resource.CreateJobApplicationCommandCreate();
         JobApplicationCreator mock = org.mockito.Mockito.mock(JobApplicationCreator.class);
         lenient().when(mock.createJobApplication(command)).thenReturn(app);
         Assertions.assertNotNull(app);
	 }
}
