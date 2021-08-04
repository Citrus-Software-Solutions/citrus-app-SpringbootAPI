package com.citrus.domain.Employee;


import com.citrus.api.domain.valueObjects.Phone_Number;
import com.citrus.shared.domain.Employee.EmployeePHONE;

public class EmployeePhoneMother {

    public static Phone_Number create(String value) {
        return new Phone_Number(value);
    }

    public static Phone_Number random() {
        return create(EmployeePHONE.random());
    }
}
