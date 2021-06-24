package domain;

import javax.persistence.Entity;

import domain.valueobjects.User_Id;
import domain.valueobjects.Document;
import domain.valueobjects.Username;
import domain.valueobjects.Password;
import domain.valueobjects.Email;
import domain.valueobjects.User_Status;

@Entity
public class User {

	private User_Id id; // global identity
	private Document document;
	private Username name;
	private Password password;
	private Email email;
	private User_Status status;
}
