package com.citrus.api.infraestructure.api.mapper;

import org.springframework.stereotype.Service;

import com.citrus.api.domain.Employee;
import com.citrus.api.infraestructure.api.DTO.EmployeeDTO;

@Service
public class EmployeeMapperDTO {
	
	final AddressMapperDTO addressMapper;
	final WorkExperienceMapperDTO workExperienceMapper;
	final SkillMapperDTO skillMapper;
	final ReferenceMapperDTO referenceMapper;
	
	public EmployeeMapperDTO(AddressMapperDTO Address, WorkExperienceMapperDTO workExperienceMapper, SkillMapperDTO skillMapper, ReferenceMapperDTO referenceMapper) {
		this.addressMapper= Address;
		this.workExperienceMapper=workExperienceMapper;
		this.skillMapper= skillMapper;
		this.referenceMapper = referenceMapper;
	}
	
	public EmployeeDTO toDTO(Employee employee) {
		EmployeeDTO employeed = new EmployeeDTO();
		employeed.setId((employee.getId()==null)? null:employee.getId().getValue());
		employeed.setFirstName((employee.getFirstName() == null)? null : employee.getFirstName().getValue());
    	employeed.setMiddleName((employee.getMiddleName() == null)? null : employee.getMiddleName().getValue());
    	employeed.setLastName((employee.getLastName() == null)? null : employee.getLastName().getValue());
    	employeed.setPhoneNumber((employee.getPhoneNumber() == null)? null : employee.getPhoneNumber().getValue());
    	employeed.setDateOfBirth((employee.getDateOfBirth() == null)? null :employee.getDateOfBirth().getValue());
    	employeed.setSsn((employee.getSsn() == null)? null :employee.getSsn().getValue());
    	employeed.setEducationLevel((employee.getEducationLevel() == null)? null :employee.getEducationLevel().getValue());
    	employeed.setRating((employee.getRating() == null)? null :employee.getRating().getValue());
    	employeed.setStatus((employee.getStatus() == null)? null :employee.getStatus().getValue());
    	employeed.setAddress((employee.getAddress() == null)? null :addressMapper.toDTO(employee.getAddress()));
    	employeed.setWorkExperience((employee.getWorkExperience() == null)? null :workExperienceMapper.toDTO(employee.getWorkExperience()));
    	employeed.setSkills((employee.getSkills() == null)? null :skillMapper.toDTO(employee.getSkills()));
    	employeed.setReferences((employee.getReferences() == null)? null :referenceMapper.toDTO(employee.getReferences()));
    	return employeed;
	}

}
