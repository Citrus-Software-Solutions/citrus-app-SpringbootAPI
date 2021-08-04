package com.citrus.shared.domain.Employee;

import java.util.Date;

import com.citrus.shared.domain.MotherCreator;

public class EmployeeDATE {

    public static Date random() {
    	return MotherCreator.random().date().birthday();
    }
}
