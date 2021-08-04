package com.citrus.shared.domain.JobOffer;

import com.citrus.shared.domain.MotherCreator;

public class JobOfferRequerements {

    public static String[] random() {
    	return MotherCreator.random().toString().split("value");
    }
}
