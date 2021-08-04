package com.citrus.shared.domain.JobOffer;

import com.citrus.shared.domain.MotherCreator;

public class JobOfferDURATION {

	   public static Float random() {
	    	return (float) MotherCreator.random().number().randomDigit();
	    }
}
