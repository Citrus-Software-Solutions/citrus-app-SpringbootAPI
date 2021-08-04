package com.citrus.domain.Contact;

import com.citrus.api.domain.valueObjects.Contact_Information_Email;
import com.citrus.shared.domain.Contact.ContactJOB;

public class ContactEmailMother {

    public static Contact_Information_Email create(String value) {
        return new Contact_Information_Email(value);
    }

    public static Contact_Information_Email random() {
        return create(ContactJOB.random());
    }
}
