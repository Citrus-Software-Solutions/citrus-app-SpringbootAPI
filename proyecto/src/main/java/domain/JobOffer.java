package domain;

import domain.valueobjects.Age;
import domain.valueobjects.Date_Format;
import domain.valueobjects.Gender;
import domain.valueobjects.Job_Offer_Description;
import domain.valueobjects.Job_Offer_Id;
import domain.valueobjects.Job_Offer_Name;
import domain.valueobjects.Price;
import domain.valueobjects.Quota;

public class JobOffer {
	
	private Job_Offer_Id id;
	
	private Job_Offer_Name name;
	
	private Job_Offer_Description description;
	
	private Quota available_vacans;
	
	private Date_Format date_begin;
	
	private Date_Format date_end;
	
	private Price salary;
	
	private Gender gender;
	
	private Age min_age;
	
	private Location location;

	
	
	public Job_Offer_Id getId() {
		return id;
	}

	public void setId(Job_Offer_Id id) {
		this.id = id;
	}

	public Job_Offer_Name getName() {
		return name;
	}

	public void setName(Job_Offer_Name name) {
		this.name = name;
	}

	public Job_Offer_Description getDescription() {
		return description;
	}

	public void setDescription(Job_Offer_Description description) {
		this.description = description;
	}

	public Quota getAvailable_vacans() {
		return available_vacans;
	}

	public void setAvailable_vacans(Quota available_vacans) {
		this.available_vacans = available_vacans;
	}

	public Date_Format getDate_begin() {
		return date_begin;
	}

	public void setDate_begin(Date_Format date_begin) {
		this.date_begin = date_begin;
	}

	public Date_Format getDate_end() {
		return date_end;
	}

	public void setDate_end(Date_Format date_end) {
		this.date_end = date_end;
	}

	public Price getSalary() {
		return salary;
	}

	public void setSalary(Price salary) {
		this.salary = salary;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Age getMin_age() {
		return min_age;
	}

	public void setMin_age(Age min_age) {
		this.min_age = min_age;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	

}
