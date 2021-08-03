package com.citrus.api.infraestructure.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.queries.JobApplicationByEmployeeQuery;
import com.citrus.api.application.service.JobApplicationByEmployeeFinder;
import com.citrus.api.domain.valueObjects.Employee_Id;
import com.citrus.api.infraestructure.api.DTO.ApplicationDTO;
import com.citrus.api.infraestructure.api.mapper.JobApplicationMapperDTO;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterJobApplication;


@RestController
@RequestMapping("/job-application")
public class FindJobApplicationByEmployeeController {
	
	final PersistanceAdapterJobApplication repo;

	public FindJobApplicationByEmployeeController(PersistanceAdapterJobApplication repo) {
		super();
		this.repo = repo;
	}
	
	@Autowired
	JobApplicationMapperDTO mapperDTO;

	
	@RequestMapping(value="/employee/{employee_id}", method=RequestMethod.GET)
	public List<ApplicationDTO> findByIdEmployee(@PathVariable("employee_id") Integer id){
		JobApplicationByEmployeeFinder handler = new JobApplicationByEmployeeFinder(repo);
		return(mapperDTO.toDTO(handler.findApplicationByEmployee((new JobApplicationByEmployeeQuery(new Employee_Id(id))))));
 }


}