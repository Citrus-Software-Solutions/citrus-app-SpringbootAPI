package domain;

import domain.valueobjects.User_Id;
import domain.valueobjects.User_Status;
import domain.valueobjects.Username;
import domain.valueobjects.Document;
import domain.valueobjects.Email;
import domain.valueobjects.Employer_Name;
import domain.valueobjects.Password;


public class Employeer extends User {

	public Employeer(User_Id id, Document document, Username name, Password password, Email email, User_Status status,
			Location location) {
		super(id, document, name, password, email, status, location);
		// TODO Auto-generated constructor stub
	}
	User_Id id;
	Employer_Name name;
	
	
	public User_Id getId() {
		return id;
	}
	public void setId(User_Id id) {
		this.id = id;
	}
	public Employer_Name getName() {
		return name;
	}
	public void setName(Employer_Name name) {
		this.name = name;
	}
	
	
	
}

