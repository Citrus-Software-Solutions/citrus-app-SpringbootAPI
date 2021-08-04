package com.citrus.shared.domain.Address;

import com.citrus.shared.domain.MotherCreator;

public class AddressZIP {

    public static String random() {
    	return MotherCreator.random().toString();
    }
}
