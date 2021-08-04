package com.citrus.domain.Employer;

import com.citrus.api.domain.valueObjects.Employer_Id;
import com.citrus.shared.domain.Employer.EmployerID;

public class EmployerIdMother {

    public static Employer_Id create(Integer value) {
        return new Employer_Id(value);
    }

    public static Employer_Id random() {
        return create(EmployerID.random());
    }
}
