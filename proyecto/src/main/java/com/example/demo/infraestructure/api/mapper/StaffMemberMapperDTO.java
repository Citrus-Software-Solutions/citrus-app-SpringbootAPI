package com.example.demo.infraestructure.api.mapper;

import org.springframework.stereotype.Service;

import com.example.demo.domain.StaffMember;
import com.example.demo.infraestructure.api.DTO.StaffMemberDTO;


@Service
public class StaffMemberMapperDTO {
	
	public StaffMemberDTO toDTO(StaffMember domain)
	{
		StaffMemberDTO dto = new StaffMemberDTO();
		dto.setFirstName((domain.getFirstName()==null) ? null:domain.getFirstName().getName());
		dto.setLastName((domain.getLastName()==null) ? null:domain.getLastName().getName());
		dto.setMiddleName((domain.getMiddleName()==null) ? null:domain.getMiddleName().getName());
		dto.setTitle((domain.getTitle()==null) ? null:domain.getTitle().getValue());
		return dto;
	}

}
