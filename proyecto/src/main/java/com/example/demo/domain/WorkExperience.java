package com.example.demo.domain;

import com.example.demo.domain.valueObjects.Work_Experience_Category;
import com.example.demo.domain.valueObjects.Work_Experience_Company_Name;
import com.example.demo.domain.valueObjects.Work_Experience_Job_Title;

public class WorkExperience {
	
	Work_Experience_Job_Title jobTile;
	Work_Experience_Company_Name companyName;
	Work_Experience_Category category;
	
	public Work_Experience_Job_Title getJobTile() {
		return jobTile;
	}
	public void setJobTile(Work_Experience_Job_Title jobTile) {
		this.jobTile = jobTile;
	}
	public Work_Experience_Company_Name getCompanyName() {
		return companyName;
	}
	public void setCompanyName(Work_Experience_Company_Name companyName) {
		this.companyName = companyName;
	}
	public Work_Experience_Category getCategory() {
		return category;
	}
	public void setCategory(Work_Experience_Category category) {
		this.category = category;
	}
	
	
}
