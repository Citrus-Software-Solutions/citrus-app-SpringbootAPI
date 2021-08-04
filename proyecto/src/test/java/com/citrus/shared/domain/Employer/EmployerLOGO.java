package com.citrus.shared.domain.Employer;

import com.citrus.shared.domain.MotherCreator;

public class EmployerLOGO {

    public static String random() {
    	return MotherCreator.random().internet().image();
    }
}
