package com.citrus.domain.Contact;

import com.citrus.api.domain.valueObjects.Phone_Number;
import com.citrus.shared.domain.Contact.ContactPHONE;

public class ContactPhoneMother {

    public static Phone_Number create(String value) {
        return new Phone_Number(value);
    }

    public static Phone_Number random() {
        return create(ContactPHONE.random());
    }
}
