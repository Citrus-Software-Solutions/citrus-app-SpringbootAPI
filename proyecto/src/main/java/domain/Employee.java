package domain;
import domain.valueobjects.*;
import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Employee extends User{
	
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
