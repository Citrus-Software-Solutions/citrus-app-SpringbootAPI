package com.citrus.domain.JobOffer;

import com.citrus.api.domain.valueObjects.Job_Offer_Status;
import com.citrus.shared.domain.JobOffer.JobOfferSTATUS;

public class JobOfferStatusMother {

    public static Job_Offer_Status create(Integer integer) {
        return new Job_Offer_Status(integer);
    }

    public static Job_Offer_Status random() {
        return create(JobOfferSTATUS.random());
    }
}
