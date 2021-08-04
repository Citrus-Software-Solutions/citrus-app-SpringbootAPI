package com.citrus.domain.JobOffer;

import com.citrus.api.domain.valueObjects.Special_Requirements;
import com.citrus.shared.domain.JobOffer.JobOfferRequerements;

public class JobOfferRequirementsMother {

    public static Special_Requirements create(String[] value) {
        return new Special_Requirements(value);
    }

    public static Special_Requirements random() {
        return create(JobOfferRequerements.random());
    }
}
