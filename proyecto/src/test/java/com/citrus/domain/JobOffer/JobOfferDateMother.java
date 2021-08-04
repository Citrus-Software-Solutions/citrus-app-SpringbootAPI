package com.citrus.domain.JobOffer;

import java.util.Date;

import com.citrus.api.domain.valueObjects.Date_Format;
import com.citrus.shared.domain.JobOffer.JobOfferDATE;

public class JobOfferDateMother {

    public static Date_Format create(Date value) {
        return new Date_Format(value);
    }

    public static Date_Format random() {
        return create(JobOfferDATE.random());
    }
}
