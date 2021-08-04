package com.citrus.domain.Reference;

import com.citrus.api.domain.valueObjects.Reference_Name;
import com.citrus.shared.domain.Reference.ReferencesFULL;

public class ReferenceFullMother {

    public static Reference_Name create(String value) {
        return new Reference_Name(value);
    }

    public static Reference_Name random() {
        return create(ReferencesFULL.random());
    }
}
