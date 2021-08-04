package com.citrus.shared.domain.Employer;

import com.citrus.shared.domain.MotherCreator;

public class EmployerSTATUS {

    public static Integer random() {
    	return MotherCreator.random().number().randomDigit();
    }
}
