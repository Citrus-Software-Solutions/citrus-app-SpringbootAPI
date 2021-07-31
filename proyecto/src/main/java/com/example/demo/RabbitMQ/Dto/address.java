package com.example.demo.RabbitMQ.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class address {
	
   private String street1;
   private String street2;
   private String city;
   private String state;
   private String _zip;
   
   public address() {} 
   public address(String street1, String street2, String city, String state, String _zip) {
	   super();
	   this.setStreet1(street1);
	   this.setStreet2(street2);
	   this.setCity(city);
	   this.setState(state);
	   this.set_zip(_zip);
   }

public String getStreet1() {
	return street1;
}

public void setStreet1(String street1) {
	this.street1 = street1;
}

public String getStreet2() {
	return street2;
}

public void setStreet2(String street2) {
	this.street2 = street2;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String get_zip() {
	return _zip;
}

public void set_zip(String _zip) {
	this._zip = _zip;
}

}
