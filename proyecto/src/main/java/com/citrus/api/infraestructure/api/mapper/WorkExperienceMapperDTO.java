package com.citrus.api.infraestructure.api.mapper;

import org.springframework.stereotype.Service;

import com.citrus.api.domain.WorkExperience;
import com.citrus.api.infraestructure.api.DTO.WorkExperienceDTO;

@Service
public class WorkExperienceMapperDTO {
	
	public static WorkExperienceDTO toDTO(WorkExperience work) {
		WorkExperienceDTO worke = new WorkExperienceDTO();
		worke.setCategory((work.getCategory()==null)? null:work.getCategory().getValue());
		worke.setCompanyName((work.getCompanyName()==null)? null:work.getCompanyName().getValue());
		worke.setJobTitle((work.getJobTile()==null)? null:work.getJobTile().getValue());

		return worke;
	}
	
	public static WorkExperienceDTO[] toDTO(WorkExperience[] work) {
		WorkExperienceDTO[] worke = null;
		
		for (int i = 0; i < work.length; i++) {
			worke[i]= toDTO(work[i]);
        }
		

		return worke;
	}
	

}
