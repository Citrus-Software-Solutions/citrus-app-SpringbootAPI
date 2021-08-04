package com.citrus.domain.Skills;

import com.citrus.api.domain.Skill;
import com.citrus.api.domain.valueObjects.Skill_Category;
import com.citrus.api.domain.valueObjects.Skill_Id;
import com.citrus.api.domain.valueObjects.Skill_Name;


public class SkillsMother {

	public static Skill[] create(Skill_Id Id, Skill_Name name, Skill_Category category) {
		return create(SkillsIdMother.random(), SkillsNameMother.random(), SkillsCategoryMother.random());
	}
	
	public static Skill[] create() {
		return create(SkillsIdMother.random(), SkillsNameMother.random(), SkillsCategoryMother.random());
	}
}
