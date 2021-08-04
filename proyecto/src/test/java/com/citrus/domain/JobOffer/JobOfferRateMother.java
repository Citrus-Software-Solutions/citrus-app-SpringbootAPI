package com.citrus.domain.JobOffer;

import com.citrus.api.domain.valueObjects.Job_Offer_Hourly_Rate;
import com.citrus.shared.domain.JobOffer.JobOfferRATE;

public class JobOfferRateMother {

    public static Job_Offer_Hourly_Rate create(Float integer) {
        return new Job_Offer_Hourly_Rate(integer);
    }

    public static Job_Offer_Hourly_Rate random() {
        return create(JobOfferRATE.random());
    }
}
