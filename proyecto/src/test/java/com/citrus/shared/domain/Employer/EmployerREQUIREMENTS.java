package com.citrus.shared.domain.Employer;

import com.citrus.shared.domain.MotherCreator;

public class EmployerREQUIREMENTS {

    public static String[] random() {
    	return MotherCreator.random().toString().split("value");
    }
}
