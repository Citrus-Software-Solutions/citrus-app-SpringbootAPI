package com.citrus.shared.domain.WorkExperience;

import com.citrus.shared.domain.MotherCreator;

public class WorkExperienceCATEGORY {

    public static Integer random() {
    	return MotherCreator.random().number().randomDigit();
    }
}
