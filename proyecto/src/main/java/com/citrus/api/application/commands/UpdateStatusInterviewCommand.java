package com.citrus.api.application.commands;

import com.citrus.api.domain.valueObjects.Interview_Id;
import com.citrus.api.domain.valueObjects.Interview_Status;


public class UpdateStatusInterviewCommand {


	public UpdateStatusInterviewCommand(Interview_Id id, Interview_Status status) {
		super();
		this.id = id;
		this.status = status;
	}
	public Interview_Id getId() {
		return id;
	}
	public Interview_Status getStatus() {
		return status;
	}
	
	Interview_Id id;
	Interview_Status status;
	
	
}
