package com.citrus.domain.Reference;

import com.citrus.api.domain.valueObjects.Reference_Company_Name;
import com.citrus.shared.domain.Reference.ReferencesCOMPANY;

public class ReferenceCompanyMother {

    public static Reference_Company_Name create(String value) {
        return new Reference_Company_Name(value);
    }

    public static Reference_Company_Name random() {
        return create(ReferencesCOMPANY.random());
    }
}
