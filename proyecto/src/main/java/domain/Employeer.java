package domain;

import domain.valueobjects.User_Id;
import domain.valueobjects.Employer_Name;


public class Employeer extends User {

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

