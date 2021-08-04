package com.citrus.shared.domain.Contact;

import com.citrus.shared.domain.MotherCreator;

public class ContactEMAIL {

    public static String random() {
    	return MotherCreator.random().internet().emailAddress();
    }
}
