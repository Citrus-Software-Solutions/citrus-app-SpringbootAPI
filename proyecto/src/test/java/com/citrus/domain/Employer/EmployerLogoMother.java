package com.citrus.domain.Employer;

import com.citrus.api.domain.valueObjects.Employer_Logo;
import com.citrus.shared.domain.Employer.EmployerLOGO;

public class EmployerLogoMother {

    public static Employer_Logo create(String value) {
        return new Employer_Logo(value);
    }

    public static Employer_Logo random() {
        return create(EmployerLOGO.random());
    }
}
