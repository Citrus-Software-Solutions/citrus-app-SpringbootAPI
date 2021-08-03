package com.citrus.api.application.commands;

import com.citrus.api.domain.valueObjects.Date_Format;
import com.citrus.api.domain.valueObjects.Interview_Id;


public class UpdateDateInterviewCommand {

	public UpdateDateInterviewCommand(Interview_Id id, Date_Format startDate) {
		super();
		this.id = id;
		this.startDate = startDate;
	}
	public Interview_Id getId() {
		return id;
	}
	public Date_Format getStartDate() {
		return startDate;
	}
	Interview_Id id;
	Date_Format startDate;
	
	
}
