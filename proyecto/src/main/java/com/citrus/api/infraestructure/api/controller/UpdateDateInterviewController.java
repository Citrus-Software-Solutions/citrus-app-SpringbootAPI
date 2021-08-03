package com.citrus.api.infraestructure.api.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.commands.UpdateDateInterviewCommand;
import com.citrus.api.application.service.InterviewDateUpdater;
import com.citrus.api.domain.valueObjects.Date_Format;
import com.citrus.api.domain.valueObjects.Interview_Id;
import com.citrus.api.infraestructure.api.mapper.InterviewMapperDTO;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterInterview;

@RestController
@RequestMapping("/interview")
public class UpdateDateInterviewController {
	
	
final PersistanceAdapterInterview repo;
	
	public UpdateDateInterviewController(PersistanceAdapterInterview repo) {
	super();
	this.repo = repo;
	}
	
	@Autowired
	InterviewMapperDTO mapperDTO;
	
	@RequestMapping(value="{id}/date/{date}", method=RequestMethod.PUT)
    public void updateDate(@PathVariable("id") Integer id, @PathVariable("date") String date) throws ParseException{
		Date dateParsed=new SimpleDateFormat("yyyy-MM-dd").parse(date);  
		UpdateDateInterviewCommand command = new UpdateDateInterviewCommand(new Interview_Id(id), new Date_Format(dateParsed));
		InterviewDateUpdater handler = new InterviewDateUpdater(repo);
		handler.updateDateInterview(command);
 }	

}
