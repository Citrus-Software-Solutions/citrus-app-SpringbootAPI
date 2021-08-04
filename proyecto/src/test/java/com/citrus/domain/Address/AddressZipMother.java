package com.citrus.domain.Address;

import com.citrus.api.domain.valueObjects.Address_Zip;
import com.citrus.shared.domain.Address.AddressZIP;

public class AddressZipMother {

    public static Address_Zip create(String value) {
        return new Address_Zip(value);
    }

    public static Address_Zip random() {
        return create(AddressZIP.random());
    }
}
