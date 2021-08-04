package com.citrus.shared.domain.Application;

import com.citrus.shared.domain.MotherCreator;

public class ApplicationStatus {

    public static Integer random() {
    	return MotherCreator.random().number().randomDigit();
    }
}
