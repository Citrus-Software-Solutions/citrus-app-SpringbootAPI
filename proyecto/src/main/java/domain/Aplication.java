package domain;

import javax.persistence.Entity;

import domain.valueobjects.Job_Application_id;
import domain.valueobjects.StatusApplication;
import domain.valueobjects.DateFormat;
import domain.valueobjects.User_Id;
import domain.valueobjects.Job_Offer_Id;


@Entity
public class Aplication {

	private Job_Application_id id; // global identity
	private StatusApplication status;
	private DateFormat date;
	private User_Id user_id;
	private Job_Offer_Id job_offer_id;
}


