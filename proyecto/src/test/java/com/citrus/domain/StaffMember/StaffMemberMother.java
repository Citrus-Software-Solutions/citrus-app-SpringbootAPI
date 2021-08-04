package com.citrus.domain.StaffMember;

import com.citrus.api.domain.StaffMember;
import com.citrus.api.domain.valueObjects.StaffMember_Id;
import com.citrus.api.domain.valueObjects.Staff_Member_Name;
import com.citrus.api.domain.valueObjects.Staff_Member_Title;


public class StaffMemberMother {

	public static StaffMember create(StaffMember_Id id, Staff_Member_Name firstName, Staff_Member_Name middleName, Staff_Member_Name LastName,
			Staff_Member_Title title) {
		return new StaffMember(id);
	}
	
	public static StaffMember create() {
		return create(StaffMemberIdMother.random(), StaffMemberFirstMother.random(), StaffMemberMidleMother.random(), StaffMemberLastMother.random(), StaffMemberTitleMother.random());
	}
}
