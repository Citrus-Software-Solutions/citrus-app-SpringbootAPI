package com.citrus.domain.Employee;


import com.citrus.api.domain.valueObjects.Employee_Name;
import com.citrus.shared.domain.Employee.EmployeeNAME;

public class EmployeeNameMother {

    public static Employee_Name create(String value) {
        return new Employee_Name(value);
    }

    public static Employee_Name random() {
        return create(EmployeeNAME.random());
    }
}
