package com.citrus.domain.Employee;

import com.citrus.api.domain.valueObjects.Employee_Status;
import com.citrus.shared.domain.Employee.EmployeeSTATUS;

public class EmployeeStatusMother {

    public static Employee_Status create(Integer value) {
        return new Employee_Status(value);
    }

    public static Employee_Status random() {
        return create(EmployeeSTATUS.random());
    }
}
