package com.citrus.shared.domain.JobOffer;

import java.util.Date;

import com.citrus.shared.domain.MotherCreator;

public class JobOfferDATE {

    public static Date random() {
        return MotherCreator.random().date().birthday();
    }
}
