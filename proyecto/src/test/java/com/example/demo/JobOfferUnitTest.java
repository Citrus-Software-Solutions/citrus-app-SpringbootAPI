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
import com.example.demo.application.Iservice.IJobOfferService;
import com.example.demo.application.service.JobOfferService;
import com.example.demo.domain.JobOffer;
import com.example.demo.resources.TestResourcesJobOffer;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class JobOfferUnitTest {

	@Mock
	private IJobOfferService repo;
	
	@InjectMocks
	private JobOfferService jobofferservice;
	
	@Autowired
	private TestResourcesJobOffer testResourcejoboffer;
	
	  @BeforeEach
	  void initUseCase() {
		  jobofferservice = new JobOfferService(repo);
	  }

	 
    @Test
    public void savedJobOfferService() throws ParseException{
		JobOffer joboffer = testResourcejoboffer.JobOfferCreate();
		JobOfferService mock = org.mockito.Mockito.mock(JobOfferService.class);
		when(mock.newJobOffer(joboffer)).thenReturn(joboffer);
		Assertions.assertNotNull(joboffer);
	}

}
