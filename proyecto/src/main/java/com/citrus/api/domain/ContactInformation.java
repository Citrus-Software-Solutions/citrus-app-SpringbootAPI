package com.citrus.api.domain;

import com.citrus.api.domain.valueObjects.Contact_Information_Email;
import com.citrus.api.domain.valueObjects.Contact_Information_Full_Name;
import com.citrus.api.domain.valueObjects.Contact_Information_Job_Title;
import com.citrus.api.domain.valueObjects.Phone_Number;

public class ContactInformation {
	
	public ContactInformation(Contact_Information_Full_Name fullname, Contact_Information_Job_Title jobTitle,
			Phone_Number phoneNumber, Contact_Information_Email email) {
		super();
		this.fullname = fullname;
		this.jobTitle = jobTitle;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	Contact_Information_Full_Name fullname;
	Contact_Information_Job_Title jobTitle;
	Phone_Number phoneNumber;
	Contact_Information_Email email;
	public Contact_Information_Full_Name getFullname() {
		return fullname;
	}
	public void setFullname(Contact_Information_Full_Name fullname) {
		this.fullname = fullname;
	}
	public Contact_Information_Job_Title getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(Contact_Information_Job_Title jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Phone_Number getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Phone_Number phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Contact_Information_Email getEmail() {
		return email;
	}
	public void setEmail(Contact_Information_Email email) {
		this.email = email;
	}
	
}
