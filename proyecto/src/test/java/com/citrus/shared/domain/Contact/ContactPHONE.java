package com.citrus.shared.domain.Contact;

import com.citrus.shared.domain.MotherCreator;

public class ContactPHONE {

    public static String random() {
    	return MotherCreator.random().toString();
    }
}
