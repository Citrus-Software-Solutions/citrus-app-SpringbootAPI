package domain;
import domain.valueobjects.*;
import java.util.ArrayList;

import javax.persistence.Entity;


public class Employee extends User{
	
	public Employee(User_Id id, Document document, Username name, Password password, Email email, User_Status status,
			Location location) {
		super(id, document, name, password, email, status, location);
		// TODO Auto-generated constructor stub
	}

	private Employee_Name name;
	
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
