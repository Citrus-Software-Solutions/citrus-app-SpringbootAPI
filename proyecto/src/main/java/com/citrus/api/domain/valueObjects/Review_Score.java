package com.citrus.api.domain.valueObjects;

public class Review_Score {
	
	public Review_Score(Integer score) {
		this.value=score;
	}

	Integer value;

	public Integer getValue() {
		return value;
	}

}
