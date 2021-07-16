package com.example.demo;

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
import com.example.demo.application.Iservice.IJobApplication;
import com.example.demo.application.service.JobApplicationService;
import com.example.demo.domain.Application;
import com.example.demo.resources.TestResourcesJobApplication;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class JobApplicationUnitTest {

	@Mock
	private IJobApplication repo;
	
	@InjectMocks
	private JobApplicationService jobapplicationservice;
	
	@Autowired
	private TestResourcesJobApplication testResourcejobapplication;
	
	  @BeforeEach
	  void initUseCase() {
		  jobapplicationservice = new JobApplicationService(repo);
	  }
	  
	    @Test
	    public void savedJobApplicationService() throws ParseException{
			Application application = testResourcejobapplication.JobApplicationCreate();
			JobApplicationService mock = org.mockito.Mockito.mock(JobApplicationService.class);
			when(mock.newJobApplication(application)).thenReturn(application);
			Assertions.assertNotNull(application);
		}
}
