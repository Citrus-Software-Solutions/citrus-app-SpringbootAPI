package com.citrus.domain.WorkExperience;

import com.citrus.api.domain.WorkExperience;
import com.citrus.api.domain.valueObjects.Work_Experience_Category;
import com.citrus.api.domain.valueObjects.Work_Experience_Company_Name;
import com.citrus.api.domain.valueObjects.Work_Experience_Job_Title;


public class WorkExperienceMother {

	public static WorkExperience[] create() {
		return create(WorkExperienceJobMother.random(), WorkExperienceCompanyMother.random(), WorkExperienceCategoryMother.random());
	}
	

	private static WorkExperience[] create(Work_Experience_Job_Title jobTile, Work_Experience_Company_Name companyName,
			Work_Experience_Category category) {
		return create(WorkExperienceJobMother.random(), WorkExperienceCompanyMother.random(), WorkExperienceCategoryMother.random());
	}
}
