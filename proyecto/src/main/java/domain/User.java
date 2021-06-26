package domain;

import javax.persistence.Entity;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import domain.valueobjects.User_Id;
import domain.valueobjects.Document;
import domain.valueobjects.Username;
import domain.valueobjects.Password;
import domain.valueobjects.Email;
import domain.valueobjects.User_Status;


public class User {
	@NotNull
	private User_Id id; // global identity
	private Document document;
	@NotBlank
	private Username name;
	private Password password;
	private Email email;
	private User_Status status;
	private Location location;


	public User(@JsonProperty("id") User_Id id, 
				Document document,
				@JsonProperty("name") Username name,
				Password password,
				Email email,
				User_Status status,
				Location location)
	{
		super();
		this.id= id;
		this.document=document;
		this.name=name;
		this.password=password;
		this.email=email;
		this.status=status;
		this.location=location;
	}

	public User_Id getId()
	{
		return id;
	}

	public Username  getName() {
        return name;
    }
 
    public void setName(Username  nombre) {
        this.name = name;
    }

}
