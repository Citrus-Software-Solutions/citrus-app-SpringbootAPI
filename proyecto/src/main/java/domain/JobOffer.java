package domain;
import javax.persistence.Entity;

import domain.valueobjects.*;

@Entity
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
	
	private Age max_age;
	
	private Location location;

}
