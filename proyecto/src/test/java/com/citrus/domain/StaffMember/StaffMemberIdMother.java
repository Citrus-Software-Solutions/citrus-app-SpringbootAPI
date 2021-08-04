package com.citrus.domain.StaffMember;

import com.citrus.api.domain.valueObjects.StaffMember_Id;
import com.citrus.shared.domain.StaffMember.StaffMemberID;

public class StaffMemberIdMother {

    public static StaffMember_Id create(Integer value) {
        return new StaffMember_Id(value);
    }

    public static StaffMember_Id random() {
        return create(StaffMemberID.random());
    }
}
