package com.citrus.shared.domain.Reference;

import com.citrus.shared.domain.MotherCreator;

public class ReferencesJOB {

    public static String random() {
    	return MotherCreator.random().job().title();
    }
}
