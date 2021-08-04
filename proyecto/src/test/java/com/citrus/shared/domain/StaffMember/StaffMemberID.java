package com.citrus.shared.domain.StaffMember;

import com.citrus.shared.domain.MotherCreator;

public class StaffMemberID {

    public static Integer random() {
    	return MotherCreator.random().number().randomDigit();
    }
}
