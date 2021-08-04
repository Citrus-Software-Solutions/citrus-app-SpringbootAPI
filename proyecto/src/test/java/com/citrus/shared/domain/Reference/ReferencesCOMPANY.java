package com.citrus.shared.domain.Reference;

import com.citrus.shared.domain.MotherCreator;

public class ReferencesCOMPANY {

    public static String random() {
    	return MotherCreator.random().company().name();
    }
}
