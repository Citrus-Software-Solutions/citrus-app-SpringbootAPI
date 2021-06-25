package domain;

import javax.persistence.Entity;

import domain.valueobjects.User_Id;
import domain.valueobjects.Document;
import domain.valueobjects.UserName;
import domain.valueobjects.Password;
import domain.valueobjects.Email;
import domain.valueobjects.Status_User;

@Entity
public class User {

	private User_Id id; // global identity
	private Document document;
	private UserName name;
	private Password password;
	private Email email;
	private Status_User status;
}
