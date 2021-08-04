package com.citrus.domain.JobOffer;

import com.citrus.api.domain.valueObjects.Job_Offer_Id;
import com.citrus.shared.domain.JobOffer.JobOfferID;

public class JobOfferIdMother {

    public static Job_Offer_Id create(Integer value) {
        return new Job_Offer_Id(value);
    }

    public static Job_Offer_Id random() {
        return create(JobOfferID.random());
    }
}
