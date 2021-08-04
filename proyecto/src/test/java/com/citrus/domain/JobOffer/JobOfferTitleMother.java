package com.citrus.domain.JobOffer;

import com.citrus.api.domain.valueObjects.Job_Offer_Title;
import com.citrus.shared.domain.JobOffer.JobOfferTITLE;

public class JobOfferTitleMother {

    public static Job_Offer_Title create(String value) {
        return new Job_Offer_Title(value);
    }

    public static Job_Offer_Title random() {
        return create(JobOfferTITLE.random());
    }
}
