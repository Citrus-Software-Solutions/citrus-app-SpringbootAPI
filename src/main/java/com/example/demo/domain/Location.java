package com.example.demo.domain;

import com.example.demo.domain.valueObjects.Location_Id;
import com.example.demo.domain.valueObjects.Location_Name;
import com.example.demo.domain.valueObjects.Location_Type;

public class Location {

	
	
	public Location(Location_Id id, Location_Name name, Location_Type type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	public Location() {
		super();
	}

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
	
	private Location_Id id;
	private Location_Name name;
	private Location_Type type;
	
	

}
