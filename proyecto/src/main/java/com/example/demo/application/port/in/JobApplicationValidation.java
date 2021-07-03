package com.example.demo.application.port.in;

import com.example.demo.infraestructure.api.DTO.JobApplicationDTO;

public class JobApplicationValidation {

	private JobApplicationDTO Jobapplicationdto;
	
	public JobApplicationValidation (JobApplicationDTO Jobapplicationdto) {
		this.Jobapplicationdto = Jobapplicationdto;
	}
	
	public boolean JobApplicationPendingStatus() {
		return Jobapplicationdto.getStatus() == "Pending";
	}
}
