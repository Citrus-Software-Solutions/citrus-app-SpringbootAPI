package com.citrus.domain.Application;

import com.citrus.api.domain.valueObjects.Application_Status;
import com.citrus.shared.domain.Application.ApplicationStatus;

public class ApplicationStatusMother {

    public static Application_Status create(Integer value) {
        return new Application_Status(value);
    }

    public static Application_Status random() {
        return create(ApplicationStatus.random());
    }
	
}
