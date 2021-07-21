package com.example.demo.infraestructure.api.mapper;
import org.springframework.stereotype.Service;

import com.example.demo.domain.ContactInformation;
import com.example.demo.infraestructure.api.DTO.ContactInformationDTO;

@Service
public class ContactInformationMapperDTO {
	
	public ContactInformationDTO[] toDTO (ContactInformation[] contact) {
		ContactInformationDTO[] contacte = null;
		for (int i = 0; i < contact.length; i++) {
			contacte[i]= toDTO(contact[i]);
        }
		return contacte;
	}

	private ContactInformationDTO toDTO(ContactInformation contact) {
		ContactInformationDTO contactd = new ContactInformationDTO();
		contactd.setEmail((contact.getEmail()== null)? null:contact.getEmail().getValue());
		contactd.setFullName((contact.getFullname()== null)? null:contact.getFullname().getValue());
		contactd.setJobTitle((contact.getJobTitle()== null)? null:contact.getJobTitle().getValue());
		contactd.setPhoneNumber((contact.getPhoneNumber()== null)? null:contact.getPhoneNumber().getValue());		
		return contactd;
	}

}
