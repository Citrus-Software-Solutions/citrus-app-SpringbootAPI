package com.citrus.shared.domain.StaffMember;

import com.citrus.shared.domain.MotherCreator;

public class StaffMemberNAME {

    public static String random() {
    	return MotherCreator.random().toString();
    }
}
