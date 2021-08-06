package com.example.demo.resources;

import java.sql.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.citrus.api.application.commands.CreateJobApplicationCommand;
import com.citrus.api.domain.Address;
import com.citrus.api.domain.Application;
import com.citrus.api.domain.ContactInformation;
import com.citrus.api.domain.Employee;
import com.citrus.api.domain.Employer;
import com.citrus.api.domain.JobOffer;
import com.citrus.api.domain.Reference;
import com.citrus.api.domain.Skill;
import com.citrus.api.domain.WorkExperience;
import com.citrus.api.domain.valueObjects.Address_City;
import com.citrus.api.domain.valueObjects.Address_State;
import com.citrus.api.domain.valueObjects.Address_Street;
import com.citrus.api.domain.valueObjects.Address_Zip;
import com.citrus.api.domain.valueObjects.Application_Date;
import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.api.domain.valueObjects.Application_Status;
import com.citrus.api.domain.valueObjects.Contact_Information_Email;
import com.citrus.api.domain.valueObjects.Contact_Information_Full_Name;
import com.citrus.api.domain.valueObjects.Contact_Information_Job_Title;
import com.citrus.api.domain.valueObjects.Date_Format;
import com.citrus.api.domain.valueObjects.Employee_EducationLevel;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.domain.valueObjects.Employee_Name;
import com.citrus.api.domain.valueObjects.Employee_SSN;
import com.citrus.api.domain.valueObjects.Employee_Status;
import com.citrus.api.domain.valueObjects.Employee_rating;
import com.citrus.api.domain.valueObjects.Employer_Company_Name;
import com.citrus.api.domain.valueObjects.Employer_Id;
import com.citrus.api.domain.valueObjects.Employer_Logo;
import com.citrus.api.domain.valueObjects.Employer_Status;
import com.citrus.api.domain.valueObjects.Job_Offer_Duration;
import com.citrus.api.domain.valueObjects.Job_Offer_Hourly_Rate;
import com.citrus.api.domain.valueObjects.Job_Offer_Id;
import com.citrus.api.domain.valueObjects.Job_Offer_Schedule;
import com.citrus.api.domain.valueObjects.Job_Offer_Status;
import com.citrus.api.domain.valueObjects.Job_Offer_Title;
import com.citrus.api.domain.valueObjects.Phone_Number;
import com.citrus.api.domain.valueObjects.Reference_Company_Name;
import com.citrus.api.domain.valueObjects.Reference_Job_Title;
import com.citrus.api.domain.valueObjects.Reference_Name;
import com.citrus.api.domain.valueObjects.Reference_email;
import com.citrus.api.domain.valueObjects.Skill_Category;
import com.citrus.api.domain.valueObjects.Skill_Id;
import com.citrus.api.domain.valueObjects.Skill_Name;
import com.citrus.api.domain.valueObjects.Special_Requirements;
import com.citrus.api.domain.valueObjects.Work_Experience_Category;
import com.citrus.api.domain.valueObjects.Work_Experience_Company_Name;
import com.citrus.api.domain.valueObjects.Work_Experience_Job_Title;

@Component
public class TestResourcesApplication {
	
	///////////////////////ADDRESS//////////////////////////
	
	Address_Street street_a = new Address_Street("Las Acacias");
	Address_Street street_aa = new Address_Street("Las Mercedes");
	Address_City city_a = new Address_City("Caracas");
	Address_State state_a = new Address_State("Distrito Capital");
	Address_Zip zip_a = new Address_Zip("1040");
	
	public Address ad = new Address(street_a, street_aa, city_a, state_a, zip_a);
	
	
	///////////////////WORK EXPERIENCE///////////////////////////
	
	Work_Experience_Job_Title job_t = new Work_Experience_Job_Title("Desarrollo");
	Work_Experience_Company_Name company_w = new Work_Experience_Company_Name("Google");
	Work_Experience_Category category_w = new Work_Experience_Category(2);
	
	public WorkExperience[] work = new WorkExperience[] {new WorkExperience(job_t, company_w, category_w)};
	
	///////////////////SKILLS///////////////////////////////////
	
	Skill_Id id_s = new Skill_Id(2);
	Skill_Name name_s = new Skill_Name("Java");
	Skill_Category category_s = new Skill_Category(2);
	
	public Skill[] skill = new Skill[]{new Skill(id_s, name_s, category_s)};
	
	//////////////////////REFERENCE////////////////////////////////
	
	Reference_Name name_r = new Reference_Name("Ucab");
	Reference_Job_Title job_r = new Reference_Job_Title("Arquitecto");
	Reference_Company_Name company_r = new Reference_Company_Name("Zoom");
	Phone_Number phone_r = new Phone_Number("04127898987");
	Reference_email email_r = new Reference_email("pedro@yahhoo.com");
	
	public Reference[] ref = new Reference[] {new Reference(name_r, job_r, company_r, phone_r, email_r)};
	
	///////////////////CONTACT INFORMATION//////////////////////////
	
	Contact_Information_Full_Name full_cc = new Contact_Information_Full_Name("Carla");
	Contact_Information_Job_Title job_cc = new Contact_Information_Job_Title("Ingeniero");
	Phone_Number number_cc = new Phone_Number("04243521367");
	Contact_Information_Email email_cc = new Contact_Information_Email("ertlang@gmail.com");
	
	public ContactInformation[] contact = new ContactInformation[] { new ContactInformation(full_cc, job_cc, number_cc, email_cc)};
	
	///////////////////EMPLOYER/////////////////////////////////////
	
	Employer_Id id_ee = new Employer_Id(3);
	Employer_Company_Name company_ee = new Employer_Company_Name("UCAB");
	Employer_Logo logo_ee = new Employer_Logo("www.foto.com");
	Special_Requirements special_ee = new Special_Requirements("Tener 10 años de experiencia");
	Employer_Status status_ee = new Employer_Status(0);
	
	public Employer em = new Employer(id_ee, company_ee, ad, contact, logo_ee, skill, special_ee, status_ee);
	
	
	/////////////////////Employee///////////////////////////////
	
	Employee_Id id_e = new Employee_Id(3);
	Employee_Name firstname_e = new Employee_Name("Jose");
	Employee_Name middlename_e = new Employee_Name("Alberto");
	Employee_Name lastname_e = new Employee_Name("Pérez");
	Phone_Number phone_e = new Phone_Number("0412345678");
	Date_Format date_e = new Date_Format(Date.valueOf("2021-08-05"));
	Employee_SSN ssn_e = new Employee_SSN("1234");
	Employee_EducationLevel education_e = new Employee_EducationLevel(3);
	Employee_rating rating_e = new Employee_rating((float) 2);
	Employee_Status status_e = new Employee_Status(2);
	
	public Employee emp = new Employee(id_e, firstname_e, middlename_e, lastname_e, phone_e, date_e, ssn_e, ad, education_e, work, skill, ref, rating_e, status_e);
	
	////////////////////JOBOFFER///////////////////////////////////
	
	Job_Offer_Id id_j = new Job_Offer_Id(2);
	Job_Offer_Title title_j = new Job_Offer_Title("Desarrollador de Software");
	Date_Format date_j = new Date_Format(Date.valueOf("2021-08-10"));
	Job_Offer_Schedule schedule_j = new Job_Offer_Schedule(Date.valueOf("2021-08-20"));
	Special_Requirements special_j = new Special_Requirements("Tener 10 años de experiencia");
	Job_Offer_Duration duration_j = new Job_Offer_Duration((float) 200);
	Job_Offer_Hourly_Rate rate_j = new Job_Offer_Hourly_Rate((float) 500);
	Job_Offer_Status status_j = new Job_Offer_Status(0);
	
	public JobOffer job = new JobOffer(id_j, title_j, em, ad, date_j, schedule_j, skill, special_j, duration_j, rate_j, emp, status_j);
	
	////////////////////Application////////////////////////////////
	
	Application_Id id_A = new Application_Id(2);
	Application_Status status_A = new Application_Status(1);
	Application_Date date_A = new Application_Date(Date.valueOf("2021-08-05"));
	
	public Application app = new Application(id_A, status_A, date_A, emp, job);
	
	public Application JobApplicationCreate(){

		 return new Application(id_A, status_A, date_A, emp, job);
	}
	
	////////////////////////////APLICATIONCOMMAND/////////////////////////
	
	CreateJobApplicationCommand com = new CreateJobApplicationCommand(id_A, date_A, id_e, id_j, status_A);
	
	public CreateJobApplicationCommand CreateJobApplicationCommandCreate() {
		return new CreateJobApplicationCommand(id_A, date_A, id_e, id_j, status_A);
	}
}
