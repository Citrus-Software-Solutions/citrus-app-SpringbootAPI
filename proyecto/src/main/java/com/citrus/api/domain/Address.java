package com.citrus.api.domain;

import com.citrus.api.domain.valueObjects.Address_City;
import com.citrus.api.domain.valueObjects.Address_State;
import com.citrus.api.domain.valueObjects.Address_Street;
import com.citrus.api.domain.valueObjects.Address_Zip;

public class Address {
	
	Address_Street street1;
	Address_Street street2;
	Address_City city;
	Address_State state;
	Address_Zip zip;
	
	public Address(Address_Street street1, Address_Street street2, Address_City city,
			Address_State state, Address_Zip zip) {

		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public Address_Street getStreet1() {
		return street1;
	}
	public void setStreet1(Address_Street street1) {
		this.street1 = street1;
	}
	public Address_Street getStreet2() {
		return street2;
	}
	public void setStreet2(Address_Street street2) {
		this.street2 = street2;
	}
	public Address_City getCity() {
		return city;
	}
	public void setCity(Address_City city) {
		this.city = city;
	}
	public Address_State getState() {
		return state;
	}
	public void setState(Address_State state) {
		this.state = state;
	}
	public Address_Zip getZip() {
		return zip;
	}
	public void setZip(Address_Zip zip) {
		this.zip = zip;
	}
	

}
