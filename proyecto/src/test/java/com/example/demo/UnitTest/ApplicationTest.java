package com.example.demo.UnitTest;

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
import com.citrus.api.application.service.JobApplicationCreator;
import com.citrus.api.domain.Application;
import com.example.demo.resources.TestResourcesApplication;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

	@Mock
	private JobApplicationRepo repo;
	
	@InjectMocks
	private JobApplicationCreator application;
	
	@Autowired
	private TestResourcesApplication testResourceapplication;
	
	  @BeforeEach
	  void initUseCase() {
		  application = new JobApplicationCreator(repo);
	  }
	  
	 @Test
	 public void savedJobOfferService() throws ParseException{
		 Application app = testResourceapplication.JobApplicationCreate();
		 JobApplicationCreator mock = org.mockito.Mockito.mock(JobApplicationCreator.class);
		 when(mock.createJobApplication(app)).thenReturn(app);
		 Assertions.assertNotNull(app);
	 }
}
