package com.citrus.shared.domain.Contact;

import com.citrus.shared.domain.MotherCreator;

public class ContactJOB {

	 public static String random() {
	    	return MotherCreator.random().job().title();
	    }
}
