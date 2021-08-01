package com.citrus.api.infraestructure.api.mapper;

import org.springframework.stereotype.Service;

import com.citrus.api.domain.JobOffer;
import com.citrus.api.infraestructure.api.DTO.JobOfferDTO;

@Service
public class JobOfferMapperDTO {
	
	final AddressMapperDTO addressMapper;
	final SkillMapperDTO skillMapper;
	final EmployeeMapperDTO employeeMapper ;
	final EmployerMapperDTO employerMapper;
	
	public JobOfferMapperDTO(EmployeeMapperDTO employee, AddressMapperDTO addressMapper, SkillMapperDTO skillMapper, EmployerMapperDTO employerMapper) {
		this.employeeMapper=employee;
		this.addressMapper= addressMapper;
		this.skillMapper= skillMapper;
		this.employerMapper= employerMapper;
	}
	
	public JobOfferDTO toDTO (JobOffer jobOffer) {
		JobOfferDTO jobOfferd = new JobOfferDTO();
		jobOfferd.setDeadline((jobOffer.getDeadline()==null)? null:jobOffer.getDeadline().getValue());
		jobOfferd.setDuration((jobOffer.getDuration()==null)? null:jobOffer.getDuration().getValue());
		jobOfferd.setHourlyRate((jobOffer.getHourlyRate()==null)? null:jobOffer.getHourlyRate().getValue());
		jobOfferd.setId((jobOffer.getId()==null)? null:jobOffer.getId().getValue());
		jobOfferd.setStatus((jobOffer.getStatus()==null)? null:jobOffer.getStatus().getValue());
		jobOfferd.setTitle((jobOffer.getTitle()==null)? null:jobOffer.getTitle().getValue());
		jobOfferd.setSprecialRequirements((jobOffer.getSprecialRequirements()==null)? null:jobOffer.getSprecialRequirements().getValue());
		jobOfferd.setSchedules((jobOffer.getSchedules()==null)? null:jobOffer.getSchedules().getValue());
		jobOfferd.setEmployee((jobOffer.getEmployee()==null)? null:employeeMapper.toDTO(jobOffer.getEmployee()));
		jobOfferd.setSkills((jobOffer.getSkills()==null)? null:skillMapper.toDTO(jobOffer.getSkills()));
		jobOfferd.setLocation((jobOffer.getLocation()==null)? null:addressMapper.toDTO(jobOffer.getLocation()));
		jobOfferd.setEmployer((jobOffer.getEmployer()==null)? null:employerMapper.toDTO(jobOffer.getEmployer()));

		return jobOfferd;
	}

}
