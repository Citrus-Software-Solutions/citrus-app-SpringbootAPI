package com.citrus.domain.Employee;

import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.shared.domain.Employee.EmployeeID;

public class EmployeeIdMother {

    public static Employee_Id create(Integer value) {
        return new Employee_Id(value);
    }

    public static Employee_Id random() {
        return create(EmployeeID.random());
    }
}
