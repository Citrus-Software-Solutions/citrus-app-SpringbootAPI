package com.citrus.api.infraestructure.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.queries.InterviewByIdEmployeeQuery;
import com.citrus.api.application.service.InterviewByEmployeeIdFinder;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.infraestructure.api.DTO.InterviewDTO;
import com.citrus.api.infraestructure.api.mapper.InterviewMapperDTO;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterInterview;

@RestController
@RequestMapping("/interview")
public class FindInterviewByIdEmployeeController {
	
	final PersistanceAdapterInterview repo;
	
	public FindInterviewByIdEmployeeController (PersistanceAdapterInterview repo) {
		super();
		this.repo=repo;
	}
	
	@Autowired
	InterviewMapperDTO mapperDTO;
	
	@RequestMapping(value="/employee/{employee_id}", method=RequestMethod.GET)
	public List<InterviewDTO> findByIdEmployee(@PathVariable("employee_id") Integer id){
		InterviewByEmployeeIdFinder handler = new InterviewByEmployeeIdFinder(repo);
		return(mapperDTO.toDTO(handler.findInterviewByEmployee((new InterviewByIdEmployeeQuery(new Employee_Id(id))))));
 }

}
