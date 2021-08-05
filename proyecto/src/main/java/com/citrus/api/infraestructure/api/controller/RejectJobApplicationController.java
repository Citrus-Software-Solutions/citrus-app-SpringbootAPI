package com.citrus.api.infraestructure.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.commands.UpdateStatusApplicationCommand;
import com.citrus.api.application.service.JobApplicationApprover;
import com.citrus.api.application.service.JobApplicationRejecter;
import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.api.domain.valueObjects.Application_Status;
import com.citrus.api.infraestructure.api.mapper.JobApplicationMapperDTO;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterJobApplication;

@RestController
@RequestMapping("/job-application")
public class RejectJobApplicationController {
	
	final PersistanceAdapterJobApplication repo;
	public RejectJobApplicationController(PersistanceAdapterJobApplication repo) {
		super();
		this.repo = repo;
		}
		
		@Autowired
		JobApplicationMapperDTO mapperDTO;
		
		@RequestMapping(value="{id}/reject", method=RequestMethod.PUT)
	    public void rejectApplication(@PathVariable("id") Integer id){
			UpdateStatusApplicationCommand command = new UpdateStatusApplicationCommand(new Application_Id(id), new Application_Status(2));
			JobApplicationRejecter handler = new JobApplicationRejecter(repo);
			handler.rejectApplication(command);
	 }	

}
