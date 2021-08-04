package com.citrus.shared.domain.Employee;

import com.citrus.shared.domain.MotherCreator;

public class EmployeeEDUCATION {

    public static Integer random() {
    	return MotherCreator.random().number().randomDigit();
    }
}
