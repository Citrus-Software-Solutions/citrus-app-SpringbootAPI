package com.citrus.api.domain;

import com.citrus.api.domain.valueObjects.Skill_Category;
import com.citrus.api.domain.valueObjects.Skill_Id;
import com.citrus.api.domain.valueObjects.Skill_Name;

public class Skill {
	
	public Skill(Skill_Id id, Skill_Name name, Skill_Category category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}
	Skill_Id id;
	Skill_Name name;
	Skill_Category category;
	
	public Skill_Id getId() {
		return id;
	}
	public void setId(Skill_Id id) {
		this.id = id;
	}
	public Skill_Name getName() {
		return name;
	}
	public void setName(Skill_Name name) {
		this.name = name;
	}
	public Skill_Category getCategory() {
		return category;
	}
	public void setCategory(Skill_Category category) {
		this.category = category;
	}

}
