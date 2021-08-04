package com.citrus.domain.Contact;

import com.citrus.api.domain.ContactInformation;
import com.citrus.api.domain.valueObjects.Contact_Information_Email;
import com.citrus.api.domain.valueObjects.Contact_Information_Full_Name;
import com.citrus.api.domain.valueObjects.Contact_Information_Job_Title;
import com.citrus.api.domain.valueObjects.Phone_Number;

public class ContactMother {

	public static ContactInformation[] create(Contact_Information_Full_Name fullname, Contact_Information_Job_Title jobTitle, Phone_Number phoneNumber, Contact_Information_Email email) {
		return create(ContactFullMother.random(), ContactJobMother.random(), ContactPhoneMother.random(), ContactEmailMother.random());
	}
	
	public static ContactInformation[] create() {
		return create(ContactFullMother.random(), ContactJobMother.random(), ContactPhoneMother.random(), ContactEmailMother.random());
	}
}
