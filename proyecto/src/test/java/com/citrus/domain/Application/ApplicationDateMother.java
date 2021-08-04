package com.citrus.domain.Application;


import java.util.Date;

import com.citrus.api.domain.valueObjects.Application_Date;
import com.citrus.shared.domain.Application.ApplicationDate;

public class ApplicationDateMother {
	
    public static Application_Date create(Date value) {
        return new Application_Date(value);
    }

    public static Application_Date random() {
        return create(ApplicationDate.random());
    }

}
