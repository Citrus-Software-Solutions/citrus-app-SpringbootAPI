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

import com.citrus.api.application.commands.CreateReviewCommand;
import com.citrus.api.application.providers.ReviewRepo;
import com.citrus.api.application.service.ReviewCreator;
import com.citrus.api.domain.Review;
import com.example.demo.resources.TestResourcesReview;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes={com.citrus.api.ProyectoApplication.class})
public class CreateReviewUnitTest {

	@Mock
	private ReviewRepo repo;
	
	@InjectMocks
	private ReviewCreator review;
	
	TestResourcesReview resource = new TestResourcesReview ();
	
	  @BeforeEach
	  void initUseCase() {
		  review = new ReviewCreator(repo);
	  }
	  
	 @Test
	 public void savedReviewService() throws ParseException{
         Review rvw = resource.createReview();
         CreateReviewCommand command = resource.createReviewCommandCreate();
         ReviewCreator mock = org.mockito.Mockito.mock(ReviewCreator.class);
         lenient().when(mock.createReview(command)).thenReturn(rvw);
         Assertions.assertNotNull(rvw);
	 }
}
