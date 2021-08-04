package com.citrus.shared.domain.Reference;

import com.citrus.shared.domain.MotherCreator;

public class ReferencesPHONE {

    public static String random() {
    	return MotherCreator.random().phoneNumber().toString();
    }
}
