package com.citrus.domain.Skills;

import com.citrus.api.domain.valueObjects.Skill_Name;
import com.citrus.shared.domain.Skills.SkillsNAME;

public class SkillsNameMother {

	
    public static Skill_Name create(String value) {
        return new Skill_Name(value);
    }

    public static Skill_Name random() {
        return create(SkillsNAME.random());
    }}
