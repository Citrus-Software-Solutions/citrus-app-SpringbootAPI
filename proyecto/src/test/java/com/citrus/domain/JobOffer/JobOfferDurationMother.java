package com.citrus.domain.JobOffer;

import com.citrus.api.domain.valueObjects.Job_Offer_Duration;
import com.citrus.shared.domain.JobOffer.JobOfferDURATION;

public class JobOfferDurationMother {

    public static Job_Offer_Duration create(Float integer) {
        return new Job_Offer_Duration(integer);
    }

    public static Job_Offer_Duration random() {
        return create(JobOfferDURATION.random());
    }
}
