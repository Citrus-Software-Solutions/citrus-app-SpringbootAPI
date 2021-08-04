package com.citrus.domain.Employee;

import com.citrus.api.domain.valueObjects.Employee_SSN;
import com.citrus.shared.domain.Employee.EmployeeSSN;

public class EmployeeSsnMother {

    public static Employee_SSN create(String value) {
        return new Employee_SSN(value);
    }

    public static Employee_SSN random() {
        return create(EmployeeSSN.random());
    }
}
