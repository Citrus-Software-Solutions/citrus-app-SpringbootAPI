package com.citrus.shared.domain.Employee;

import com.citrus.shared.domain.MotherCreator;

public class EmployeeID {

    public static Integer random() {
    	return MotherCreator.random().number().randomDigit();
    }
}
