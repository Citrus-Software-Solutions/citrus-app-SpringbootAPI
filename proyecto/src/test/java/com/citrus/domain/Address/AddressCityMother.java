package com.citrus.domain.Address;

import com.citrus.api.domain.valueObjects.Address_City;
import com.citrus.shared.domain.Address.AddressCITY;

public class AddressCityMother {

    public static Address_City create(String value) {
        return new Address_City(value);
    }

    public static Address_City random() {
        return create(AddressCITY.random());
    }
}
