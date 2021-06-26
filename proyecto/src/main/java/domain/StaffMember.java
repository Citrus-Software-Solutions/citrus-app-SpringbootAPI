package domain;

import javax.persistence.Entity;

import domain.valueobjects.*;


public class StaffMember extends User{
		
	public StaffMember(User_Id id, Document document, Username name, Password password, Email email, User_Status status,
			Location location) {
		super(id, document, name, password, email, status, location);
		// TODO Auto-generated constructor stub
	}


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
