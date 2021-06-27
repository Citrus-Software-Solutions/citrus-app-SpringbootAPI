package com.example.demo.adapter;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	
}
