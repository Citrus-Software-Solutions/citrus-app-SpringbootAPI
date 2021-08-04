package com.citrus.domain.StaffMember;

import com.citrus.api.domain.valueObjects.Staff_Member_Name;
import com.citrus.shared.domain.StaffMember.StaffMemberNAME;

public class StaffMemberFirstMother {

    public static Staff_Member_Name create(String value) {
        return new Staff_Member_Name(value);
    }

    public static Staff_Member_Name random() {
        return create(StaffMemberNAME.random());
    }
}
