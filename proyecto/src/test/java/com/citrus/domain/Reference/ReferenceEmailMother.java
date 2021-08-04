package com.citrus.domain.Reference;

import com.citrus.api.domain.valueObjects.Reference_email;
import com.citrus.shared.domain.Reference.ReferencesEMAIL;

public class ReferenceEmailMother {

    public static Reference_email create(String value) {
        return new Reference_email(value);
    }

    public static Reference_email random() {
        return create(ReferencesEMAIL.random());
    }
}
