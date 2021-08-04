package com.citrus.shared.domain.Employee;

import com.citrus.shared.domain.MotherCreator;

public class EmployeeSTATUS {

    public static Integer random() {
    	return MotherCreator.random().number().randomDigit();
    }
}
