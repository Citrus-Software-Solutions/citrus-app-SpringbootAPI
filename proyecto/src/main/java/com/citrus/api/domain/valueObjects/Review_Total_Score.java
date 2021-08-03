package com.citrus.api.domain.valueObjects;

import java.math.BigDecimal;

public class Review_Total_Score {
	
	public Review_Total_Score(Integer totalscore) {
		this.value= totalscore;
	}

	Integer value;

	public Integer getValue() {
		return value;
	}
	

}
