package com.citrus.shared.domain.Employer;

import com.citrus.shared.domain.MotherCreator;

public class EmployerCOMPANY {

    public static String random() {
    	return MotherCreator.random().company().name();
    }
}
