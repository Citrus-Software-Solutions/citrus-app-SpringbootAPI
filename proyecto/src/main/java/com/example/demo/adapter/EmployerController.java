package com.example.demo.adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.adapter.out.persistance.EmployerJpaEntity;
import com.example.demo.application.port.IEmployerJPA;

@Controller
@RequestMapping("api/v1/employer")
public class EmployerController {
    @Autowired
    private IEmployerJPA emp;

    @RequestMapping(value="/view/all", method = RequestMethod.GET)
    public Iterable<EmployerJpaEntity> ListEmployer(ModelMap em){
        return emp.findAll();
    }

    @RequestMapping(value="/view/{id}", method = RequestMethod.GET)
    public Optional<EmployerJpaEntity> FindEmployer(@PathVariable("id") Long id)
    {
        return emp.findById(id);
    }

    @RequestMapping(value="/view/{id}", method = RequestMethod.POST)
    public EmployerJpaEntity createEmployer(@RequestBody EmployerJpaEntity employer){
        return emp.save(employer);
    }
}
