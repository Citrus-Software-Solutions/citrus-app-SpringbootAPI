package com.citrus.api.infraestructure.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.commands.UpdateStatusInterviewCommand;
import com.citrus.api.application.service.InterviewStatusUpdater;
import com.citrus.api.domain.valueObjects.Interview_Id;
import com.citrus.api.domain.valueObjects.Interview_Status;
import com.citrus.api.infraestructure.api.mapper.InterviewMapperDTO;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterInterview;

@RestController
@RequestMapping("/interview")
public class UpdateStatusInterviewController {
	
	
final PersistanceAdapterInterview repo;
	
	public UpdateStatusInterviewController(PersistanceAdapterInterview repo) {
	super();
	this.repo = repo;
	}
	
	@Autowired
	InterviewMapperDTO mapperDTO;
	
	@RequestMapping(value="{id}/status/{status}", method=RequestMethod.PUT)
    public void updateStatus(@PathVariable("id") Integer id, @PathVariable("status") Integer status){
		UpdateStatusInterviewCommand command = new UpdateStatusInterviewCommand(new Interview_Id(id), new Interview_Status(status));
		InterviewStatusUpdater handler = new InterviewStatusUpdater(repo);
		handler.updateStatusInterview(command);
 }	

}
