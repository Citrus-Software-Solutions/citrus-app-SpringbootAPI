package com.citrus.domain.Employee;

import com.citrus.api.domain.valueObjects.Employee_rating;
import com.citrus.shared.domain.Employee.EmployeeRATINGS;

public class EmployeeRatingsMother {

    public static Employee_rating create(Float value) {
        return new Employee_rating(value);
    }

    public static Employee_rating random() {
        return create(EmployeeRATINGS.random());
    }
}
