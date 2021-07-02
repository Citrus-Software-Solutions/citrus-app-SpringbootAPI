package com.example.demo.infraestructure.database.JPAClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.NotEmpty;

@Entity
@Table(name = "location")
public class LocationJPA {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long id;
    @NotEmpty
    @Column private String name;
    @NotEmpty
    @Column private String type;
    @NotEmpty
    @Column private Long locationId;
    
    public LocationJPA() {
    	super();
    }
    
    public LocationJPA(String name, String type, Long locationId) {
        this.name = name;
        this.type = type;
        this.locationId = locationId;
    }
    
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
	
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
    public Long getLocationId() {
        return locationId;
    }
 
    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }
}
