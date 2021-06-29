package com.example.demo.adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.adapter.out.persistance.JobApplicationJpaEntity;
import com.example.demo.application.port.IJobApplicationJPA;

@RestController
@RequestMapping("/JobApplication")
public class Job_ApplicationController {
	
	@Autowired
	private IJobApplicationJPA ja; 
	
	@RequestMapping(value="/view/all", method = RequestMethod.GET)
	public Iterable<JobApplicationJpaEntity> ListAplications(ModelMap mp){
		return ja.findAll();
	}
    
	@RequestMapping(value="{id}",method=RequestMethod.GET)
	public Optional<JobApplicationJpaEntity> FindIdApplication(@PathVariable("id") Long id){
		return ja.findById(id);
	}
	  @RequestMapping(value="", method=RequestMethod.POST)
		public JobApplicationJpaEntity createJob_Offer(@RequestBody JobApplicationJpaEntity job_app) {
			return ja.save(job_app);
		}
}
