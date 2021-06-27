package com.example.demo.application.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import com.example.demo.application.port.IUser;
import com.example.demo.domain.User;


 
 
 
 
@Service
public class UserService {
    private final IUser iuser; 
    
    @Autowired
    public UserService(@Qualifier("postgres") IUser iuser) {
    	this.iuser=iuser;
    }
    
    
    public int addUser(User user) {
    	return iuser.addUser(user);
    }
    
    public List<User> getAllUsers()
    {
    	return iuser.selectAllUsers();
    }
    
}
