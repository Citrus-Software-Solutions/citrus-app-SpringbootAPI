package com.citrus.domain.Contact;

import com.citrus.api.domain.valueObjects.Contact_Information_Full_Name;
import com.citrus.shared.domain.Contact.ContactFULL;

public class ContactFullMother {

    public static Contact_Information_Full_Name create(String value) {
        return new Contact_Information_Full_Name(value);
    }

    public static Contact_Information_Full_Name random() {
        return create(ContactFULL.random());
    }
}
