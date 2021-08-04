package com.citrus.shared.domain.Skills;

import com.citrus.shared.domain.MotherCreator;

public class SkillsCATEGORY {

    public static Integer random() {
    	return MotherCreator.random().number().randomDigit();
    }
}
