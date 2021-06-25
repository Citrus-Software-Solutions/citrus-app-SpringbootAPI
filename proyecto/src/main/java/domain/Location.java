package domain;

import javax.persistence.Entity;

import domain.valueobjects.Location_id;
import domain.valueobjects.Location_Name;
import domain.valueobjects.Location_Type;

@Entity
public class Location {

	private Location_id id; // global identity
	private Location_Name name;
	private Location_Type date;

}
