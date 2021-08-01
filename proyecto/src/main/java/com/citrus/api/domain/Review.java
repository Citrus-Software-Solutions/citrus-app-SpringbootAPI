package com.citrus.api.domain;

import com.citrus.api.domain.valueObjects.Review_Question;
import com.citrus.api.domain.valueObjects.Review_Score;
import com.citrus.api.domain.valueObjects.Review_Total_Score;

public class Review {
	
	Review_Question[] questions;
	Review_Score[] scores;
	Review_Total_Score totalScore;
	Employee employee;
	Employer employer;
	Application application;

}
