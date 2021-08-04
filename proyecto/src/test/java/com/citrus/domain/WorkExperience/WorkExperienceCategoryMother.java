package com.citrus.domain.WorkExperience;

import com.citrus.api.domain.valueObjects.Work_Experience_Category;
import com.citrus.shared.domain.WorkExperience.WorkExperienceCATEGORY;

public class WorkExperienceCategoryMother {

    public static Work_Experience_Category create(Integer value) {
        return new Work_Experience_Category(value);
    }

    public static Work_Experience_Category random() {
        return create(WorkExperienceCATEGORY.random());
    }
}
