package com.example.demo.infraestructure.api.mapper;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Address;
import com.example.demo.infraestructure.api.DTO.AddressDTO;

@Service
public class AddressMapperDTO {
	
	
	public AddressDTO toDTO(Address address) {
		AddressDTO addressd = new AddressDTO();
		addressd.setCity((address.getCity() == null)? null:address.getCity().getValue());
		addressd.setState((address.getState() == null)? null:address.getState().getValue());
		addressd.setStreet1((address.getStreet1() == null)? null:address.getStreet1().getValue());
		addressd.setStreet2((address.getStreet2() == null)? null:address.getStreet2().getValue());
		addressd.setZip((address.getZip() == null)? null:address.getZip().getValue());
		
		return (addressd);
	}

}
