package com.citrus.domain.Address;

import com.citrus.api.domain.valueObjects.Address_Street;
import com.citrus.shared.domain.Address.AddresSTREET;

public class AddressStreetMother {

    public static Address_Street create(String value) {
        return new Address_Street(value);
    }

    public static Address_Street random() {
        return create(AddresSTREET.random());
    }
}
