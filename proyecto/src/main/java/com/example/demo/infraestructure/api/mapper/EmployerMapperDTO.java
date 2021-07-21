package com.example.demo.infraestructure.api.mapper;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Employer;
import com.example.demo.infraestructure.api.DTO.EmployerDTO;

@Service
public class EmployerMapperDTO {
	
	final AddressMapperDTO addressMapper;
	final SkillMapperDTO skillMapper;
	final ContactInformationMapperDTO contactMapper;
	public EmployerMapperDTO(AddressMapperDTO addressMapper, SkillMapperDTO skillMapper,ContactInformationMapperDTO contactMapper) {
		this.addressMapper=addressMapper;
		this.skillMapper=skillMapper;
		this.contactMapper= contactMapper;
	}
	
	public EmployerDTO toDTO(Employer employer) {
		EmployerDTO employerd = new EmployerDTO();
		employerd.setCompanyName((employer.getCompanyName()== null)? null:employer.getCompanyName().getValue());
		employerd.setSpecialRequirements((employer.getSpecialRequeriments()== null)? null:employer.getSpecialRequeriments().getValue());
		employerd.setLogo((employer.getLogo()== null)? null:employer.getLogo().getValue());
		employerd.setStatus((employer.getStatus()== null)? null:employer.getStatus().getValue());
		employerd.setAddress((employer.getAddress() == null)? null :addressMapper.toDTO(employer.getAddress()));
		employerd.setSkills((employer.getSkills() == null)? null :skillMapper.toDTO(employer.getSkills()));
		employerd.setContactInformation((employer.getContacts() == null)? null :contactMapper.toDTO(employer.getContacts()));
		
		return employerd;
	}



}
