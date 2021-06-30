package com.example.demo.adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.adapter.out.persistance.EmployerJpaEntity;
import com.example.demo.adapter.out.persistance.LocationJpaEntity;
import com.example.demo.application.port.IEmployerJPA;
import com.example.demo.application.port.ILocationJPA;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
    private ILocationJPA lo;
	
    @RequestMapping(value="", method = RequestMethod.GET)
    public Iterable<LocationJpaEntity> ListLocation(ModelMap em){
        return lo.findAll();
    }
    
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Optional<LocationJpaEntity> FindLocation(@PathVariable("id") Long id)
    {
        return lo.findById(id);
    }

}
