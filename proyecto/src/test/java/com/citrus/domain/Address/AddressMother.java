package com.citrus.domain.Address;

import com.citrus.api.domain.Address;
import com.citrus.api.domain.valueObjects.Address_City;
import com.citrus.api.domain.valueObjects.Address_State;
import com.citrus.api.domain.valueObjects.Address_Street;
import com.citrus.api.domain.valueObjects.Address_Zip;


public class AddressMother {

	private static Address create(Address_Street street, Address_Street street2, Address_City city,
			Address_State state, Address_Zip zip) {

		return new Address(street, street2, city, state, zip);
	}
	
	public static Address create() {
		return create(AddressStreetMother.random(), AddressStreetMother.random(), AddressCityMother.random(), AddressStateMother.random(), AddressZipMother.random());
	}

}
