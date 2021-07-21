package com.example.demo.infraestructure.api.mapper;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Skill;
import com.example.demo.infraestructure.api.DTO.SkillDTO;

@Service
public class SkillMapperDTO {
	
	public static SkillDTO toDTO(Skill skill) {
		SkillDTO skilld = new SkillDTO();
		skilld.setCategory((skill.getCategory() == null)? null: skill.getCategory().getValue());
		skilld.setId((skill.getId() == null)? null: skill.getId().getValue());
		skilld.setName((skill.getName() == null)? null: skill.getName().getValue());

		return skilld;
	}
	
	public static SkillDTO[] toDTO(Skill[] skill) {
		SkillDTO[] skille = null;
		for (int i = 0; i < skill.length; i++) {
			skille[i]= toDTO(skill[i]);
        }
		return skille;
	}

}
