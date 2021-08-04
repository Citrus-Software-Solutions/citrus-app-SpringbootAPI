package com.citrus.domain.Application;

import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.shared.domain.Application.ApplicationID;

public class ApplicationIdMother {
	
    public static Application_Id create(Integer value) {
        return new Application_Id(value);
    }

    public static Application_Id random() {
        return create(ApplicationID.random());
    }

}
