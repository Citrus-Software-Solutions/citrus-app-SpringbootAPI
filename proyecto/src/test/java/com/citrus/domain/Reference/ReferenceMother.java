package com.citrus.domain.Reference;

import com.citrus.api.domain.Reference;
import com.citrus.api.domain.valueObjects.Phone_Number;
import com.citrus.api.domain.valueObjects.Reference_Company_Name;
import com.citrus.api.domain.valueObjects.Reference_Job_Title;
import com.citrus.api.domain.valueObjects.Reference_Name;
import com.citrus.api.domain.valueObjects.Reference_email;


public class ReferenceMother {

	public static Reference[] create(Reference_Name fullName, Reference_Job_Title jobTitle, Reference_Company_Name companyName, Phone_Number phoneNumber, Reference_email email) {
		return create(ReferenceFullMother.random(), ReferenceJobMother.random(), ReferenceCompanyMother.random(), ReferencePhoneMother.random(), ReferenceEmailMother.random());
	}
	
	public static Reference[] create() {
		return create(ReferenceFullMother.random(), ReferenceJobMother.random(), ReferenceCompanyMother.random(), ReferencePhoneMother.random(), ReferenceEmailMother.random());
	}
}
