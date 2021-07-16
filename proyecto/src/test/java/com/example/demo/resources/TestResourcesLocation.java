package com.example.demo.resources;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Location;
import com.example.demo.domain.valueObjects.Location_Id;
import com.example.demo.domain.valueObjects.Location_Name;
import com.example.demo.domain.valueObjects.Location_Type;

@Component
public class TestResourcesLocation {

	Location_Id id = new Location_Id((long) 2);
			Location_Name name = new Location_Name("Calle Los Ruices");
			Location_Type type = new Location_Type("Specific Direction");
			
			 public Location loc = new Location (id, name, type);
}
