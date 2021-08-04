package com.citrus.domain.Employee;

import java.util.Date;

import com.citrus.api.domain.valueObjects.Date_Format;
import com.citrus.shared.domain.Employee.EmployeeDATE;

public class EmployeeDateMother {

    public static Date_Format create(Date value) {
        return new Date_Format(value);
    }

    public static Date_Format random() {
        return create(EmployeeDATE.random());
    }
}
