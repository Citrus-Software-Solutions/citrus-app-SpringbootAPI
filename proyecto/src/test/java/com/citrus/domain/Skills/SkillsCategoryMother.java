package com.citrus.domain.Skills;

import com.citrus.api.domain.valueObjects.Skill_Category;
import com.citrus.shared.domain.Skills.SkillsCATEGORY;

public class SkillsCategoryMother {

    public static Skill_Category create(Integer value) {
        return new Skill_Category(value);
    }

    public static Skill_Category random() {
        return create(SkillsCATEGORY.random());
    }
}
