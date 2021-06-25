package domain;

import javax.persistence.Entity;

import domain.valueobjects.*;


public class StaffMember extends User{
		
	private Staff_Member_Name name;
	
	private Gender gender;
	
	private Date_Format birthdate;
	
	
	//public JobOffer createOffer() {
		
		//return;
	//};
	
	public void publishOffer(JobOffer job) {
		
		
	}
	
	//public ArrayList<JobOffer> showAllOffers() {
		
		//return;
	//} 

}
