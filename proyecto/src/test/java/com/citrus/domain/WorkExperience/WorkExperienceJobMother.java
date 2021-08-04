package com.citrus.domain.WorkExperience;

import com.citrus.api.domain.valueObjects.Work_Experience_Job_Title;
import com.citrus.shared.domain.WorkExperience.WorkExperiencieJOB;

public class WorkExperienceJobMother {

    public static Work_Experience_Job_Title create(String value) {
        return new Work_Experience_Job_Title(value);
    }

    public static Work_Experience_Job_Title random() {
        return create(WorkExperiencieJOB.random());
    }
}
