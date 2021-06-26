package domain;

import javax.persistence.Entity;
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
}

