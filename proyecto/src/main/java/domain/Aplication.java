package domain;


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
	
	public Aplication_Id getId() {
		return id;
	}

	public void setId(Aplication_Id id) {
		this.id = id;
	}

	public Aplication_Status getStatus() {
		return status;
	}

	public void setStatus(Aplication_Status status) {
		this.status = status;
	}

	public Date_Format getDate() {
		return date;
	}

	public void setDate(Date_Format date) {
		this.date = date;
	}

	public User_Id getUser_id() {
		return user_id;
	}

	public void setUser_id(User_Id user_id) {
		this.user_id = user_id;
	}

	public Job_Offer_Id getJob_offer_id() {
		return job_offer_id;
	}

	public void setJob_offer_id(Job_Offer_Id job_offer_id) {
		this.job_offer_id = job_offer_id;
	}


}



