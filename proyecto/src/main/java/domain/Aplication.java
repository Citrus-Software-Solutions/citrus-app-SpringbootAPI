package domain;

import javax.persistence.Entity;

import domain.valueobjects.Aplication_Id;
import domain.valueobjects.Aplication_Status;
import domain.valueobjects.Date_Format;
import domain.valueobjects.User_Id;
import domain.valueobjects.Job_Offer_Id;



public class Aplication {

	private Aplication_Id id; // global identity
	
	private Aplication_Status status;
	
	private Date_Format date;
	
	private User_Id user_id;
	
	private Job_Offer_Id job_offer_id;
}


