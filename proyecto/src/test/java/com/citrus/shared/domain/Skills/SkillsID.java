package com.citrus.shared.domain.Skills;

import com.citrus.shared.domain.MotherCreator;

public class SkillsID {

    public static Integer random() {
    	return MotherCreator.random().number().randomDigit();
    }	
}
