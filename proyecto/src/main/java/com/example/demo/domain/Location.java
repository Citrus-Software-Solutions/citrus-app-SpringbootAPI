package com.example.demo.domain;


import com.example.demo.domain.valueobjects.Location_Id;
import com.example.demo.domain.valueobjects.Location_Name;
import com.example.demo.domain.valueobjects.Location_Type;


public class Location {

	private Location_Id id; // global identity
	private Location_Name name;
	private Location_Type type;
	private Location location;
	
	public Location_Id getId() {
		return id;
	}
	public void setId(Location_Id id) {
		this.id = id;
	}
	public Location_Name getName() {
		return name;
	}
	public void setName(Location_Name name) {
		this.name = name;
	}
	public Location_Type getType() {
		return type;
	}
	public void setType(Location_Type type) {
		this.type = type;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	

}
