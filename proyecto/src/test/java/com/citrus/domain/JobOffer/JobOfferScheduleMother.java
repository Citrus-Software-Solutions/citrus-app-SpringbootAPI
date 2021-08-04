package com.citrus.domain.JobOffer;

import java.util.Date;

import com.citrus.api.domain.valueObjects.Job_Offer_Schedule;
import com.citrus.shared.domain.JobOffer.JobOfferSCHEDULES;

public class JobOfferScheduleMother {

    public static Job_Offer_Schedule create(Date[] value) {
        return new Job_Offer_Schedule(value);
    }

    public static Job_Offer_Schedule random() {
        return create(JobOfferSCHEDULES.random());
    }

}
