package com.citrus.domain.WorkExperience;

import com.citrus.api.domain.valueObjects.Work_Experience_Company_Name;
import com.citrus.shared.domain.WorkExperience.WorkExperienceCOMPANY;

public class WorkExperienceCompanyMother {

    public static Work_Experience_Company_Name create(String value) {
        return new Work_Experience_Company_Name(value);
    }

    public static Work_Experience_Company_Name random() {
        return create(WorkExperienceCOMPANY.random());
    }
}
