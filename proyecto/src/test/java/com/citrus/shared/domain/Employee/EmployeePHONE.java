package com.citrus.shared.domain.Employee;

import com.citrus.shared.domain.MotherCreator;

public class EmployeePHONE {

    public static String random() {
    	return MotherCreator.random().toString();
    }
}
