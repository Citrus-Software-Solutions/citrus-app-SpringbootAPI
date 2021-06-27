package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.ui.ModelMap;
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
    private IJob_OfferJPA uc;
	
	@RequestMapping(value="", method = RequestMethod.GET)
    public Iterable<Job_Offer> ListJob_Offer(ModelMap mp){
        mp.put("job_offer", uc.findAll());
        return uc.findAll();
    }
}
