package com.citrus.shared.domain.JobOffer;

import com.citrus.shared.domain.MotherCreator;

public class JobOfferID {

    public static Integer random() {
    	return MotherCreator.random().number().randomDigit();
    }	
}
