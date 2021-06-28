package com.example.demo.adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.adapter.out.persistance.Job_Offer;
import com.example.demo.application.port.IJob_OfferJPA;

@Controller
@RequestMapping("/JobOffer")
public class Job_OfferController {

	@Autowired
    private IJob_OfferJPA jo;
	
	@RequestMapping(value="", method = RequestMethod.GET)
    public Iterable<Job_Offer> ListJob_Offer(ModelMap mp){
        mp.put("job_offer", jo.findAll());
        return jo.findAll();
    }
    
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Optional<Job_Offer> FindByIdJob_Offer(@PathVariable("id") Long id){
        return jo.findById(id);
    }
    
    @RequestMapping(value="", method=RequestMethod.POST)
	public Job_Offer createJob_Offer(@RequestBody Job_Offer job_offer) {
		return jo.save(job_offer);
	}
}
