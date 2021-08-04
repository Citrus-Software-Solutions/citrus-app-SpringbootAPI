package com.citrus.domain.Employer;

import com.citrus.api.domain.Address;
import com.citrus.api.domain.ContactInformation;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.Employer;
import com.citrus.api.domain.Skill;
import com.citrus.api.domain.valueObjects.Employer_Company_Name;
import com.citrus.api.domain.valueObjects.Employer_Id;
import com.citrus.api.domain.valueObjects.Employer_Logo;
import com.citrus.api.domain.valueObjects.Employer_Status;
import com.citrus.api.domain.valueObjects.Special_Requirements;
import com.citrus.domain.Address.AddressMother;
import com.citrus.domain.Contact.ContactMother;
import com.citrus.domain.Employee.EmployeeMother;
import com.citrus.domain.Skills.SkillsMother;

public class EmployerMother {

	public static Employer create(Employer_Id id, Employer_Company_Name companyName, Address address, Employee employee,
			ContactInformation[] contacts, Employer_Logo logo, Skill[] skills, Special_Requirements specialRequeriments, Employer_Status status) {
		return new Employer(id);
	}
	
	public static Employer create() {
		return create(EmployerIdMother.random(), EmployerCompanyMother.random(), AddressMother.create(), EmployeeMother.create(), ContactMother.create(), EmployerLogoMother.random(), SkillsMother.create(), EmployerRequirementMother.random(),EmployerStatusMother.random() );
	}
}
