package com.citrus.domain.Contact;

import com.citrus.api.domain.valueObjects.Contact_Information_Job_Title;
import com.citrus.shared.domain.Contact.ContactJOB;

public class ContactJobMother {

    public static Contact_Information_Job_Title create(String value) {
        return new Contact_Information_Job_Title(value);
    }

    public static Contact_Information_Job_Title random() {
        return create(ContactJOB.random());
    }
}
