package com.citrus.domain.Employee;


import com.citrus.api.domain.valueObjects.Employee_EducationLevel;
import com.citrus.shared.domain.Employee.EmployeeEDUCATION;

public class EmployeeEducationMother {


    public static Employee_EducationLevel create(Integer value) {
        return new Employee_EducationLevel(value);
    }

    public static Employee_EducationLevel random() {
        return create(EmployeeEDUCATION.random());
    }
}
