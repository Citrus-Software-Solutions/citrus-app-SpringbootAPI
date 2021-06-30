package com.example.demo.adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.adapter.out.persistance.StaffMemberJpaEntity;
import com.example.demo.application.port.IStaffMemberJPA;

@RestController
@RequestMapping("/StaffMember")
public class StaffMemberController {

    @Autowired
    private IStaffMemberJPA staffm;
    
    
	@RequestMapping(value="", method = RequestMethod.GET)
	public Iterable<StaffMemberJpaEntity> ListStaffMember(ModelMap sm){
		return staffm.findAll();
	}
    
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Optional<StaffMemberJpaEntity> FindIdStaffMember(@PathVariable("id") Long id){
		return staffm.findById(id);
	}
	  @RequestMapping(value="", method=RequestMethod.POST)
		public StaffMemberJpaEntity createStaffMember(@RequestBody StaffMemberJpaEntity staff) {
			return staffm.save(staff);
		}
}
