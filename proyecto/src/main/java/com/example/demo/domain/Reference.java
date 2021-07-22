package com.example.demo.domain;

import com.example.demo.domain.valueObjects.Phone_Number;
import com.example.demo.domain.valueObjects.Reference_Company_Name;
import com.example.demo.domain.valueObjects.Reference_Job_Title;
import com.example.demo.domain.valueObjects.Reference_Name;
import com.example.demo.domain.valueObjects.Reference_email;

public class Reference {
	
	Reference_Name fullName;
	Reference_Job_Title jobTitle;
	Reference_Company_Name companyName;
	Phone_Number phoneNumber;
	Reference_email email;
	public Reference_Name getFullName() {
		return fullName;
	}
	public void setFullName(Reference_Name fullName) {
		this.fullName = fullName;
	}
	public Reference_Job_Title getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(Reference_Job_Title jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Reference_Company_Name getCompanyName() {
		return companyName;
	}
	public void setCompanyName(Reference_Company_Name companyName) {
		this.companyName = companyName;
	}
	public Phone_Number getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Phone_Number phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Reference_email getEmail() {
		return email;
	}
	public void setEmail(Reference_email email) {
		this.email = email;
	}

}
