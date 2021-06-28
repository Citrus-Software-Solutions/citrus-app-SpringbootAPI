package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.adapter.out.persistance.Job_Offer;
import com.example.demo.application.port.IJob_OfferJPA;

@ComponentScan
@SpringBootApplication
@RestController
@EnableJpaRepositories
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

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
