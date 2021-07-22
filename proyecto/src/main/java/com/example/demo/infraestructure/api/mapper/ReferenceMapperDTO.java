package com.example.demo.infraestructure.api.mapper;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Reference;
import com.example.demo.domain.Skill;
import com.example.demo.infraestructure.api.DTO.ReferenceDTO;
import com.example.demo.infraestructure.api.DTO.SkillDTO;

@Service
public class ReferenceMapperDTO {
	
	public static ReferenceDTO toDTO(Reference reference) {
		ReferenceDTO referenced = new ReferenceDTO();
		referenced.setCompanyName((reference.getCompanyName()== null)? null:reference.getCompanyName().getValue());
		referenced.setEmail((reference.getEmail()== null)? null:reference.getEmail().getValue());
		referenced.setFullname((reference.getFullName()== null)? null:reference.getFullName().getValue());
		referenced.setJobTitle((reference.getJobTitle()== null)? null:reference.getJobTitle().getValue());
		referenced.setPhoneNumber((reference.getPhoneNumber()== null)? null:reference.getPhoneNumber().getValue());
		
		return referenced;
	}
	
	public static ReferenceDTO[] toDTO(Reference[] reference) {
		ReferenceDTO[] referencee = null;
		for (int i = 0; i < reference.length; i++) {
			referencee[i]= toDTO(reference[i]);
        }
		return referencee;
	}

}
