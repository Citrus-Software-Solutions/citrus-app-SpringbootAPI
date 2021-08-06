package com.citrus.api.infraestructure.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.commands.UpdateStatusJobApplicationCommand;
import com.citrus.api.application.service.JobApplicationStatusUpdater;
import com.citrus.api.domain.valueObjects.Application_Id;
import com.citrus.api.domain.valueObjects.Application_Status;
import com.citrus.api.infraestructure.api.mapper.InterviewMapperDTO;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterJobApplication;

@RestController
@RequestMapping("/job-application")
public class rejectJobApplicationController {
	
	final PersistanceAdapterJobApplication repo;
	
	public rejectJobApplicationController(PersistanceAdapterJobApplication repo) {
	super();
	this.repo = repo;
	}
	
	@Autowired
	InterviewMapperDTO mapperDTO;
	
	@RequestMapping(value="{id}/reject", method=RequestMethod.PUT)
    public void rejectApplication(@PathVariable("id") Integer id){
		UpdateStatusJobApplicationCommand command = new UpdateStatusJobApplicationCommand(new Application_Id(id), new Application_Status(3));
		JobApplicationStatusUpdater handler = new JobApplicationStatusUpdater(repo);
		handler.updateStatusApplication(command);
 }	

}


