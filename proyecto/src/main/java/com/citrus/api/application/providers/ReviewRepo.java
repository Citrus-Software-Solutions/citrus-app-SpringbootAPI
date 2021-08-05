package com.citrus.api.application.providers;

import java.util.List;

import com.citrus.api.domain.Review;
import com.citrus.api.domain.valueObjects.Employer_Id;
import com.citrus.api.domain.valueObjects.Review_Id;
import com.citrus.api.infraestructure.database.JPAClasses.ReviewJPA;

public interface ReviewRepo {
	
	List<Review> findReview(Employer_Id id);
	Review findReview(Review_Id id);
	Review saveReview(Review review);
	List<Review> findReview();

}
