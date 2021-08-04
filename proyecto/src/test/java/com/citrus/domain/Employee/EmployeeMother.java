package com.citrus.domain.Employee;

import com.citrus.api.domain.Address;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.Reference;
import com.citrus.api.domain.Skill;
import com.citrus.api.domain.WorkExperience;
import com.citrus.api.domain.valueObjects.Date_Format;
import com.citrus.api.domain.valueObjects.Employee_EducationLevel;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.domain.valueObjects.Employee_Name;
import com.citrus.api.domain.valueObjects.Employee_SSN;
import com.citrus.api.domain.valueObjects.Employee_Status;
import com.citrus.api.domain.valueObjects.Employee_rating;
import com.citrus.api.domain.valueObjects.Phone_Number;
import com.citrus.domain.Address.AddressMother;
import com.citrus.domain.Reference.ReferenceMother;
import com.citrus.domain.Skills.SkillsMother;
import com.citrus.domain.WorkExperience.WorkExperienceMother;


public class EmployeeMother {

	public static Employee create(Employee_Id id, Employee_Name firstName, Employee_Name middleName, Employee_Name LastName, Phone_Number phoneNumber, 
			Date_Format dateOfBirth, Employee_SSN ssn, Address address, Employee_EducationLevel educationLevel, WorkExperience[] workExperience, 
			Skill[] skills, Reference[] references, Employee_rating rating, Employee_Status status) {
		return new Employee(id, firstName, middleName, LastName, phoneNumber, dateOfBirth, ssn, address, educationLevel,workExperience, skills, references, rating, status);
	}


	public static Employee create() {
		return create(EmployeeIdMother.random(), EmployeeNameMother.random(), EmployeeNameMother.random(), EmployeeNameMother.random(), EmployeePhoneMother.random(),
				EmployeeDateMother.random(), EmployeeSsnMother.random(), AddressMother.create(), EmployeeEducationMother.random(), WorkExperienceMother.create(), SkillsMother.create(),
				ReferenceMother.create(), EmployeeRatingsMother.random(), EmployeeStatusMother.random());
	}
}
