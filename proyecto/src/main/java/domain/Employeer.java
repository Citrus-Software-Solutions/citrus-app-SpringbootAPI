package domain;

import javax.persistence.Entity;
import domain.valueobjects.User_Id;
import domain.valueobjects.Employer_Name;

@Entity
public class Employeer extends User {

	User_Id id;
	Employer_Name name;
}

