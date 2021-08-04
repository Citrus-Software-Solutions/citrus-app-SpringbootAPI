package com.citrus.shared.domain.StaffMember;

import com.citrus.shared.domain.MotherCreator;

public class StaffMemberTITLE {

    public static String random() {
    	return MotherCreator.random().company().name();
    }
}
