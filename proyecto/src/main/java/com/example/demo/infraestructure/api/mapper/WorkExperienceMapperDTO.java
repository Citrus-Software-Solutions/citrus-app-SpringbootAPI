package com.example.demo.infraestructure.api.mapper;

import org.springframework.stereotype.Service;

import com.example.demo.domain.WorkExperience;
import com.example.demo.infraestructure.api.DTO.WorkExperienceDTO;

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
