package com.citrus.shared.domain.Address;

import com.citrus.shared.domain.MotherCreator;

public class AddressCITY {

    public static String random() {
    	return MotherCreator.random().toString();
    }
}
