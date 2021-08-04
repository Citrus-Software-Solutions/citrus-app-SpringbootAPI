package com.citrus.domain.Reference;

import com.citrus.api.domain.valueObjects.Reference_Job_Title;
import com.citrus.shared.domain.Reference.ReferencesJOB;

public class ReferenceJobMother {

    public static Reference_Job_Title create(String value) {
        return new Reference_Job_Title(value);
    }

    public static Reference_Job_Title random() {
        return create(ReferencesJOB.random());
    }
}
