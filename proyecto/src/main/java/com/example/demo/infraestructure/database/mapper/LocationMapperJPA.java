package com.example.demo.infraestructure.database.mapper;

import com.example.demo.domain.Location;
import com.example.demo.domain.valueObjects.Location_Id;
import com.example.demo.domain.valueObjects.Location_Name;
import com.example.demo.domain.valueObjects.Location_Type;
import com.example.demo.infraestructure.database.JPAClasses.LocationJPA;

public class LocationMapperJPA {
	
	public Location toDomain(LocationJPA jpa) {
		Location_Id id = new Location_Id(jpa.getId());
		Location_Name name = new Location_Name(jpa.getName());
		Location_Type type = new Location_Type(jpa.getType());
	
		
		return new Location (id, name, type);
	}


}
