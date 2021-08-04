package com.citrus.domain.Employer;

import com.citrus.api.domain.valueObjects.Special_Requirements;
import com.citrus.shared.domain.Employer.EmployerREQUIREMENTS;

public class EmployerRequirementMother {

    public static Special_Requirements create(String[] value) {
        return new Special_Requirements(value);
    }

    public static Special_Requirements random() {
        return create(EmployerREQUIREMENTS.random());
    }
}
