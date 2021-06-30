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

import com.example.demo.adapter.out.persistance.Job_OfferJpa;
import com.example.demo.application.port.IJob_OfferJPA;

@RestController
@RequestMapping("/JobOffer")
public class Job_OfferController {

	@Autowired
    private IJob_OfferJPA jo;
	
	@RequestMapping(value="", method = RequestMethod.GET)
    public Iterable<Job_OfferJpa> ListJob_Offer(ModelMap mp){
        mp.put("job_offer", jo.findAll());
        return jo.findAll();
    }
    
	@RequestMapping(value="/{employer_id}", method=RequestMethod.GET)
    public Iterable<Job_OfferJpa> FindByIdJob_Offer(@PathVariable("employer_id") Long employer_id){
        return jo.findByEmployerId(employer_id);
    }
    
    @RequestMapping(value="", method=RequestMethod.POST)
	public Job_OfferJpa createJob_Offer(@RequestBody Job_OfferJpa job_offer) {
		return jo.save(job_offer);
	}
    
	@RequestMapping(value="ByStatus/{status}", method=RequestMethod.GET)
    public Iterable<Job_OfferJpa> findByPublishedStatus(@PathVariable("status") String status){
        return jo.findByStatus(status);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value = "/{id}")
	public Job_OfferJpa updateJob_Status(@PathVariable("id") Long id, @RequestBody Job_OfferJpa status){
		
		if (status != null && jo.existsById(id)){
			
			Job_OfferJpa oldStatus = jo.getOne(id);
			
			oldStatus.setStatus("Published");
			
			return jo.save(oldStatus);
		}
		return null;
	}
    
}
