package com.citrus.shared.domain.JobOffer;

import com.citrus.shared.domain.MotherCreator;

public class JobOfferSTATUS {

	   public static Integer random() {
	    	return MotherCreator.random().number().randomDigit();
	    }
}
