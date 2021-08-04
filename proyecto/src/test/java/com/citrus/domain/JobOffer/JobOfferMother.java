package com.citrus.domain.JobOffer;

import com.citrus.api.domain.Address;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.Employer;
import com.citrus.api.domain.JobOffer;
import com.citrus.api.domain.Skill;
import com.citrus.api.domain.valueObjects.Date_Format;
import com.citrus.api.domain.valueObjects.Job_Offer_Duration;
import com.citrus.api.domain.valueObjects.Job_Offer_Hourly_Rate;
import com.citrus.api.domain.valueObjects.Job_Offer_Id;
import com.citrus.api.domain.valueObjects.Job_Offer_Schedule;
import com.citrus.api.domain.valueObjects.Job_Offer_Status;
import com.citrus.api.domain.valueObjects.Job_Offer_Title;
import com.citrus.api.domain.valueObjects.Special_Requirements;
import com.citrus.domain.Address.AddressMother;
import com.citrus.domain.Employee.EmployeeMother;
import com.citrus.domain.Employer.EmployerMother;
import com.citrus.domain.Skills.SkillsMother;

public class JobOfferMother {

	public static JobOffer create(Job_Offer_Id id, Job_Offer_Title title, Employer employer, Address location,
			Date_Format deadline, Job_Offer_Schedule schedules, Skill[] skills, Special_Requirements sprecialRequirements,
			Job_Offer_Duration duration, Job_Offer_Hourly_Rate hourlyRate, Employee employee, Job_Offer_Status status) {
		return new JobOffer(id);
	}
	
	public static JobOffer create() {
		return create(JobOfferIdMother.random(), JobOfferTitleMother.random(), EmployerMother.create(), AddressMother.create(),
				JobOfferDateMother.random(), JobOfferScheduleMother.random(), SkillsMother.create(), JobOfferRequirementsMother.random(), JobOfferDurationMother.random(),
				JobOfferRateMother.random(), EmployeeMother.create(), JobOfferStatusMother.random());
	}
}
