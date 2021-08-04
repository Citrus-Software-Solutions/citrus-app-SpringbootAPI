package com.citrus.domain.Address;

import com.citrus.api.domain.valueObjects.Address_State;
import com.citrus.shared.domain.Address.AddressSTATE;

public class AddressStateMother {

    public static Address_State create(String value) {
        return new Address_State(value);
    }

    public static Address_State random() {
        return create(AddressSTATE.random());
    }
}
