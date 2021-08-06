package com.citrus.api.application.commands;

import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.api.domain.valueObjects.Application_Status;

public class UpdateStatusJobApplicationCommand {
	
	Application_Id id;
	Application_Status status;
	
	public UpdateStatusJobApplicationCommand(Application_Id id,Application_Status status ) {
		super();
		this.id=id;
		this.status=status;
	}

	public Application_Id getId() {
		return id;
	}

	public void setId(Application_Id id) {
		this.id = id;
	}

	public Application_Status getStatus() {
		return status;
	}

	public void setStatus(Application_Status status) {
		this.status = status;
	}
	

}
