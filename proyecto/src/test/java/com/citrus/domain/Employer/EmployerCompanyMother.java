package com.citrus.domain.Employer;

import com.citrus.api.domain.valueObjects.Employer_Company_Name;
import com.citrus.shared.domain.Employer.EmployerCOMPANY;

public class EmployerCompanyMother {

    public static Employer_Company_Name create(String value) {
        return new Employer_Company_Name(value);
    }

    public static Employer_Company_Name random() {
        return create(EmployerCOMPANY.random());
    }
}
