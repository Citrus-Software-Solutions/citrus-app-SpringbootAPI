package domain;

import javax.persistence.Entity;
import domain.valueobjects.User_Id;
import domain.valueobjects.EmployerName;

@Entity
public class Employeer extends User {

	User_Id id;
	EmployerName name;
}

