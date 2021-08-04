package com.citrus.shared.domain.JobOffer;

import com.citrus.shared.domain.MotherCreator;

public class JobOfferTITLE {

    public static String random() {
    	return MotherCreator.random().job().title();
    }
}
