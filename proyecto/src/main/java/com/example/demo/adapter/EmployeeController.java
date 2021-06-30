package com.example.demo.adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.adapter.out.persistance.EmployeeJpaEntity;
import com.example.demo.application.port.IEmployeeJPA;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

	@Autowired
    private IEmployeeJPA empl;
    
    
	@RequestMapping(value="", method = RequestMethod.GET)
	public Iterable<EmployeeJpaEntity> ListEmployee(ModelMap sm){
		return empl.findAll();
	}
    
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Optional<EmployeeJpaEntity> FindIdEmployee(@PathVariable("id") Long id){
		return empl.findById(id);
	}
	  @RequestMapping(value="", method=RequestMethod.POST)
		public EmployeeJpaEntity createEmployee(@RequestBody EmployeeJpaEntity employee) {
			return empl.save(employee);
	}
	
}
