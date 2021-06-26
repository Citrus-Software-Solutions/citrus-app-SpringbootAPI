package domain;

import javax.persistence.Entity;

import domain.valueobjects.Location_Id;
import domain.valueobjects.Location_Name;
import domain.valueobjects.Location_Type;

@Entity
public class Location {

	private Location_Id id; // global identity
	private Location_Name name;
	private Location_Type date;
	private Location location;

}
