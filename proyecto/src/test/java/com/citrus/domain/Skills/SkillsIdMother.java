package com.citrus.domain.Skills;

import com.citrus.api.domain.valueObjects.Skill_Id;
import com.citrus.shared.domain.Skills.SkillsID;

public class SkillsIdMother {

    public static Skill_Id create(Integer value) {
        return new Skill_Id(value);
    }

    public static Skill_Id random() {
        return create(SkillsID.random());
    }
}
