package com.citrus.api.infraestructure.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.queries.InterviewByIdQuery;
import com.citrus.api.application.service.InterviewByIdFinder;
import com.citrus.api.domain.valueObjects.Interview_Id;
import com.citrus.api.infraestructure.api.DTO.InterviewDTO;
import com.citrus.api.infraestructure.api.mapper.InterviewMapperDTO;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterInterview;

@RestController
@RequestMapping("/interview")
public class FindInterviewByIdController {

	final PersistanceAdapterInterview repo;

	public FindInterviewByIdController(PersistanceAdapterInterview repo) {
		super();
		this.repo = repo;
	}

	@Autowired
	InterviewMapperDTO mapperDTO;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public InterviewDTO findInterviewById(@PathVariable("id") Integer id) {
		InterviewByIdFinder handler = new InterviewByIdFinder(repo);
		return (mapperDTO.toDTO(handler.findInterviewById(new InterviewByIdQuery(new Interview_Id(id)))));

	}
}
