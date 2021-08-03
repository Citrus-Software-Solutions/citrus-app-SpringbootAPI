package com.citrus.api.infraestructure.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citrus.api.application.service.InterviewFinder;
import com.citrus.api.infraestructure.api.DTO.InterviewDTO;
import com.citrus.api.infraestructure.api.mapper.InterviewMapperDTO;
import com.citrus.api.infraestructure.database.adapter.PersistanceAdapterInterview;


@RestController
@RequestMapping("/interview")
public class FindAllInterviewsController {

	final PersistanceAdapterInterview repo;

	public FindAllInterviewsController(PersistanceAdapterInterview repo) {
		super();
		this.repo = repo;
	}

	@Autowired
	InterviewMapperDTO mapperDTO;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<InterviewDTO> findAllInterviews() {
		InterviewFinder handler = new InterviewFinder(repo);
		return (mapperDTO.toDTO(handler.findAllInterviews()));

	}
}
