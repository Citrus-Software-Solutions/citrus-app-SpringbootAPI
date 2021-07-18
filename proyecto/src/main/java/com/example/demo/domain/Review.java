package com.example.demo.domain;

import com.example.demo.domain.valueObjects.Review_Question;
import com.example.demo.domain.valueObjects.Review_Score;
import com.example.demo.domain.valueObjects.Review_Total_Score;

public class Review {
	
	Review_Question[] questions;
	Review_Score[] scores;
	Review_Total_Score totalScore;
	Employee employee;
	Employer employer;
	Application application;

}
