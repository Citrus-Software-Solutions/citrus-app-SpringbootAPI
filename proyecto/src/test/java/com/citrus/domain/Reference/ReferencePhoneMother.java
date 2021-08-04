package com.citrus.domain.Reference;

import com.citrus.api.domain.valueObjects.Phone_Number;
import com.citrus.shared.domain.Reference.ReferencesPHONE;

public class ReferencePhoneMother {

    public static Phone_Number create(String value) {
        return new Phone_Number(value);
    }

    public static Phone_Number random() {
        return create(ReferencesPHONE.random());
    }
}
