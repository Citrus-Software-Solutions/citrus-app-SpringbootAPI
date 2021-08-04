package com.citrus.shared.domain.WorkExperience;

import com.citrus.shared.domain.MotherCreator;

public class WorkExperiencieJOB {

    public static String random() {
    	return MotherCreator.random().job().title();
    }
}

