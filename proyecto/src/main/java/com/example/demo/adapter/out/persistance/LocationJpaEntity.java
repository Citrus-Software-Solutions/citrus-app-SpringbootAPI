package com.example.demo.adapter.out.persistance;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.NotEmpty;
import com.example.demo.adapter.out.persistance.EmployerJpaEntity;;


@Entity
@Table(name = "location")
public class LocationJpaEntity {

    @Column private long user_id;
    
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Job_Location", nullable=true)
	private EmployerJpaEntity employerjpaEntity;
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long id;
    @NotEmpty
    @Column private String name;
    @NotEmpty
    @Column private String type;
    @NotEmpty
    @Column private Long locationId;
    
    public LocationJpaEntity() {
    	super();
    }
    
    public LocationJpaEntity(String name, String type, Long locationId) {
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
