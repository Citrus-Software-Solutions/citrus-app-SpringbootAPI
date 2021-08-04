package com.citrus.domain.Employer;

import com.citrus.api.domain.valueObjects.Employer_Status;
import com.citrus.shared.domain.Employer.EmployerSTATUS;

public class EmployerStatusMother {

    public static Employer_Status create(Integer value) {
        return new Employer_Status(value);
    }

    public static Employer_Status random() {
        return create(EmployerSTATUS.random());
    }
}
