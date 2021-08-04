package com.citrus.domain.StaffMember;

import com.citrus.api.domain.valueObjects.Staff_Member_Title;
import com.citrus.shared.domain.StaffMember.StaffMemberNAME;

public class StaffMemberTitleMother {

    public static Staff_Member_Title create(String value) {
        return new Staff_Member_Title(value);
    }

    public static Staff_Member_Title random() {
        return create(StaffMemberNAME.random());
    }
}
