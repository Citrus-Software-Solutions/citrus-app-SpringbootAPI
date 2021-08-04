package com.citrus.shared.domain.Reference;

import com.citrus.shared.domain.MotherCreator;

public class ReferencesEMAIL {

    public static String random() {
    	return MotherCreator.random().internet().emailAddress();
    }
}
